package com.wkswind.chat.db

import io.objectbox.annotation.Convert
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

/**
 * 用户
 */
@Entity
data class User (
  @Id var id: Long,
  var userId: String,
  var avatar: String,
  var nickname: String,
  var signature:String?,
  var age: Int
)

/**
 * 视频记录
 */
@Entity
data class VideoChatHistory(
  @Id var id:Long,
  var userId:String,
  var nickname:String,
  var url:String,
  var time:Long,
  @Convert(converter = StatusConverter::class, dbType = Int::class)
  var status:Status,
  @Convert(converter = TypeConverter::class, dbType = Int::class)
  var callType:Type
)

/**
 * 访客记录
 */
@Entity
data class VisitorHistory(
  @Id var id:Long,
  var date: Long,
  var avatar: String,
  var nickname: String
)

@Entity
data class Anchor(
  @Id
  var id : Long,
  var signature:String?,
  var distance:String,
  var vip:Boolean
)