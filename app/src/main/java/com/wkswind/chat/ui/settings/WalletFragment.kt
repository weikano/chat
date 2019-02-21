package com.wkswind.chat.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wkswind.chat.R
import com.wkswind.chat.base.BaseFragment

class WalletFragment: BaseFragment() {
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_recycler, container, false)
  }
}