package com.wkswind.chat.api

import com.wkswind.chat.db.User
import com.wkswind.chat.db.VideoChatHistory
import com.wkswind.chat.db.VisitorHistory
import io.reactivex.Observable
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

interface Api {
  @POST
  @FormUrlEncoded
  fun login(acccount: String, pwd: String): Observable<User>

  @GET
  fun userProfile(): Observable<User>

  @POST
  @FormUrlEncoded
  fun visitorHistory(userId: String): Observable<List<VisitorHistory>>

  @POST
  @FormUrlEncoded
  fun videoChatHistory(userId: String): Observable<List<VideoChatHistory>>
}