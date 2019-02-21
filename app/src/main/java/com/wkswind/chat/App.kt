package com.wkswind.chat

import android.app.Application
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric
import timber.log.Timber

class App:Application(){
  override fun onCreate() {
    super.onCreate()
    Fabric.with(this, Crashlytics())
    ObjectBox.build(this)
    ApiTool.build(this)
    Timber.plant(if(BuildConfig.DEBUG){Timber.DebugTree()}else {ReleaseTree})
  }

  object ReleaseTree:Timber.Tree() {
    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {

    }
  }

}