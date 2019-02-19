package com.wkswind.chat.db

import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class Note(
  @Id var id: Long = 0, var text: String? = null,
  var comment: String? = null,
  var time: Long = System.currentTimeMillis()
)