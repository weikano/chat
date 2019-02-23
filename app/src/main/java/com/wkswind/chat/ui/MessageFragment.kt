package com.wkswind.chat.ui

import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.wkswind.chat.R
import com.wkswind.chat.base.BaseFragment
import kotlinx.android.synthetic.main.fragment_message.*

class MessageFragment: BaseFragment() {

  companion object {
    fun newInstance():MessageFragment = MessageFragment()
  }

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setHasOptionsMenu(true)
  }

  override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
    return inflater.inflate(R.layout.fragment_message, container, false)
  }

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)
    toolbar.setTitle(R.string.nav_message)
    activity?.also {
      (it as AppCompatActivity).setSupportActionBar(toolbar)
    }
  }

  override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
    super.onCreateOptionsMenu(menu, inflater)
    inflater.inflate(R.menu.fragment_message, menu)
  }

  override fun onOptionsItemSelected(item: MenuItem): Boolean {
    when(item.itemId) {
      R.id.action_delete -> Toast.makeText(context, "delete", Toast.LENGTH_SHORT).show()
    }
    return super.onOptionsItemSelected(item)
  }
}