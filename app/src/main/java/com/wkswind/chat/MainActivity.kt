package com.wkswind.chat

import android.os.Bundle
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI.onNavDestinationSelected
import androidx.navigation.ui.setupWithNavController
import com.wkswind.chat.base.BaseActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity:BaseActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    with(bottom_nav) {
      setupWithNavController(Navigation.findNavController(this@MainActivity, R.id.nav_host_fragment))
      setOnNavigationItemSelectedListener {
        onNavDestinationSelected(it, Navigation.findNavController(this@MainActivity, R.id.nav_host_fragment))
      }
    }
  }
}