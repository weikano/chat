package com.wkswind.chat

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.wkswind.chat.base.BaseActivity

class SplashActivity : BaseActivity() {
  private val action = Runnable {
    finish()
    startActivity(Intent(this, MainActivity::class.java))
  }
  private lateinit var handler:Handler
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    handler = Handler(Looper.getMainLooper()).apply {
      postDelayed(action, 1000)
    }
  }

  override fun onDestroy() {
    handler.removeCallbacks(action)
    super.onDestroy()
  }
}