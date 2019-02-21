package com.wkswind.chat.base

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.wkswind.chat.R
import timber.log.Timber

open class BaseFragment: Fragment() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    Timber.i("onCreate")
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    Timber.i("onCreateView")
    return super.onCreateView(inflater, container, savedInstanceState)
  }
}
@SuppressLint("Registered")
open class BaseActivity:AppCompatActivity()
open class BaseListFragment:BaseFragment(){
  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_recycler, container, false)
  }
}