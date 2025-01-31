package com.zaminali.composeApp.common.base

import retrofit2.Response

open class BaseSource {
    suspend fun <T> handleResponse(service: suspend () -> Response<T>): BaseResource<T> {
        return try {
            val response = service.invoke()
            if (response.isSuccessful) {
                response.body()?.let {
                    BaseResource.Success(it)
                } ?: BaseResource.Error(Exception("Empty response"))
            } else {
                BaseResource.Error(Exception(response.message()))
            }
        } catch (e: Exception) {
            BaseResource.Error(e)
        }
    }
}