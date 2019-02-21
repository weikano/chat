package com.wkswind.chat.ui.settings

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.wkswind.chat.R
import com.wkswind.chat.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_recycler.*

class AccountFragment:BaseFragment() {
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_account, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    toolbar.setTitle(R.string.label_account)
    toolbar.setNavigationIcon(R.drawable.ic_close)
    toolbar.setNavigationOnClickListener {  }
  }
}