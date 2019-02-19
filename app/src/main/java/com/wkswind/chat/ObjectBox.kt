package com.wkswind.chat

import android.content.Context
import com.wkswind.chat.db.MyObjectBox
import io.objectbox.BoxStore

/**
 *  ObjectBox.store.boxFor()
 */
object ObjectBox {
  lateinit var store:BoxStore
    private set
  fun build(context:Context) {
    store = MyObjectBox.builder().androidContext(context.applicationContext).build()
  }
}