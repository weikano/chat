package com.wkswind.chat

import android.os.Bundle
import com.wkswind.chat.base.BaseActivity

class MainActivity:BaseActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
//    bottom_nav.setOnNavigationItemSelectedListener {
//      when(it.itemId) {
//      }
//    }
  }
}