package com.zaminali.composeApp.common.base

sealed class BaseResource<out T> {
    data object Loading : BaseResource<Nothing>()
    data class Success<out T>(val result: T?) : BaseResource<T>()
    data class Error(val throwable: Exception) : BaseResource<Nothing>()
}