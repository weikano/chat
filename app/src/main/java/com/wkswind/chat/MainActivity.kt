package com.wkswind.chat

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.wkswind.chat.base.BaseActivity
import com.wkswind.chat.ui.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    bottom_nav.setOnNavigationItemSelectedListener {
      showContent(it.itemId)
      true
    }
    bottom_nav.selectedItemId = R.id.main_nav_profile


  }

  private fun showContent(id: Int) {
    val tag = findTagById(id)
    val fragment = supportFragmentManager.findFragmentByTag(tag)
    val fragmentNeedCreated = fragment == null
    with(supportFragmentManager.beginTransaction()) {
      supportFragmentManager.fragments.forEach {
        hide(it)
      }
      if (fragmentNeedCreated) {
        add(R.id.content, createFragmentById(id), tag)
      } else {
        show(fragment!!)
      }
      commit()
    }
  }

  private fun createFragmentById(id: Int): Fragment {
    return when (id) {
      R.id.main_nav_nearby -> NearbyFragment.newInstance()
      R.id.main_nav_match -> MatchFragment.newInstance()
      R.id.main_nav_message -> MessageFragment.newInstance()
      R.id.main_nav_square -> SquareFragment.newInstance()
      R.id.main_nav_profile -> MineFragment.newInstance()
      else -> throw IllegalArgumentException("id not handled")
    }
  }

//  @TargetApi(Build.VERSION_CODES.LOLLIPOP)
//  private fun animateByMenuItem(item: MenuItem) {
//    val rect = Rect()
//    val view = bottom_nav.findViewById<View>(item.itemId)
//    view.requestRectangleOnScreen(rect, true)
//    ViewAnimationUtils.createCircularReveal(
//      view,
//      rect.centerX(),
//      rect.centerY(),
//      0F,
//      Math.hypot(rect.width().toDouble(), rect.height().toDouble()).toFloat()
//    ).start()
//  }

  private fun findTagById(id: Int): String {
    return when (id) {
      R.id.main_nav_nearby -> NearbyFragment::class.java.simpleName
      R.id.main_nav_match -> MatchFragment::class.java.simpleName
      R.id.main_nav_message -> MessageFragment::class.java.simpleName
      R.id.main_nav_square -> SquareFragment::class.java.simpleName
      R.id.main_nav_profile -> MineFragment::class.java.simpleName
      else -> throw IllegalArgumentException("id not handled")
    }
  }
}