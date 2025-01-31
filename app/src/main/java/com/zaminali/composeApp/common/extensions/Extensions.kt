package com.zaminali.composeApp.common.extensions

fun Any.getFileNameAddress(): String =
    this::class.java.canonicalName?.substringBeforeLast(".Companion").orEmpty()