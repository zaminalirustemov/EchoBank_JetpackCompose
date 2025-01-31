package com.zaminali.composeApp.common.base

import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flow

open class BaseRepository {
    suspend fun <T> handleSource(
        call: suspend () -> BaseResource<T>,
        onSuccess: () -> T
    ): Flow<BaseResource<T>> = flow<BaseResource<T>> {
        emit(BaseResource.Loading)
        when (val response = call.invoke()) {
            is BaseResource.Error -> emit(BaseResource.Error(response.throwable))
            BaseResource.Loading -> Unit
            is BaseResource.Success -> emit(BaseResource.Success(onSuccess.invoke()))
        }
    }.catch {
        emit(BaseResource.Error(Exception(it)))
    }
}