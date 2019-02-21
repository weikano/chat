package com.wkswind.chat.db

import io.objectbox.converter.PropertyConverter

enum class Status {
  ONLINE, OFFLINE
}

enum class Type {
  DIAL, MATCH, RECEIVE
}

class StatusConverter : PropertyConverter<Status, Int> {
  override fun convertToEntityProperty(databaseValue: Int?): Status = Status.values()[databaseValue!!]
  override fun convertToDatabaseValue(entityProperty: Status?): Int = entityProperty!!.ordinal
}
class TypeConverter:PropertyConverter<Type,Int> {
  override fun convertToEntityProperty(databaseValue: Int?): Type = Type.values()[databaseValue!!]
  override fun convertToDatabaseValue(entityProperty: Type?): Int = entityProperty!!.ordinal
}