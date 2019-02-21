package com.wkswind.chat

import android.content.Context
import com.wkswind.chat.api.Api
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object ApiTool {
  lateinit var api: Api
  fun build(context: Context) {
    api = Retrofit.Builder()
      .addConverterFactory(GsonConverterFactory.create())
      .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
      .baseUrl(HttpUrl.Builder().scheme("https").host("github.com").build())
      .client(client(context.applicationContext))
      .build().create(Api::class.java)
  }

  private fun client(context:Context):OkHttpClient {
    return OkHttpClient.Builder()
      .addInterceptor(HttpLoggingInterceptor())
      .addInterceptor(TimeoutInterceptor)
      .connectTimeout(20, TimeUnit.SECONDS)
      .readTimeout(20, TimeUnit.SECONDS)
      .writeTimeout(20, TimeUnit.SECONDS)
      .build()
  }

  private object TimeoutInterceptor : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
      return chain.proceed(chain.request())
    }
  }
}

