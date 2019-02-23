package com.wkswind.chat.ui

import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.google.android.material.tabs.TabLayout
import com.wkswind.chat.R
import com.wkswind.chat.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_nearby.*
import java.lang.IllegalArgumentException

class NearbyFragment : BaseFragment() {
  companion object {
    fun newInstance() = NearbyFragment()
  }
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_nearby, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    pager.adapter = NearbyContentAdapter(childFragmentManager)
    tab.tabMode = TabLayout.MODE_SCROLLABLE
    tab.tabGravity = TabLayout.GRAVITY_CENTER
    tab.setupWithViewPager(pager)
  }

  private inner class NearbyContentAdapter(fm:FragmentManager) : FragmentStatePagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
      return when(position) {
        0->AnchorsFragment.newInstance()
        1->RecommendersFragment.newInstance()
        else -> throw IllegalArgumentException("Invalid position: $position")
      }
    }
    override fun getCount(): Int = 2
    override fun getPageTitle(position: Int): CharSequence? {
      return when(position) {
        0->resources.getString(R.string.nav_nearby)
        1->resources.getString(R.string.label_recommend)
        else -> throw IllegalArgumentException("Invalid position: $position")
      }
    }
  }
}