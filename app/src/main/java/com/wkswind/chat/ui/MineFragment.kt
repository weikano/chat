package com.wkswind.chat.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wkswind.chat.R
import com.wkswind.chat.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_mine.*

class MineFragment: BaseFragment() {
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_mine, container, false)
  }
  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    loadAvatar()
    settings.setOnClickListener {  }
    edit.setOnClickListener {  }
    account.setOnClickListener {  }
    wallet.setOnClickListener {  }
    visitor.setOnClickListener {  }
    video.setOnClickListener {  }
    cservice.setOnClickListener {  }
    gift.setOnClickListener {  }
    share.setOnClickListener {  }
  }

  private fun loadAvatar(){

  }
}