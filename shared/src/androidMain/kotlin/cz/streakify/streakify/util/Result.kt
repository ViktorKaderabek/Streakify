package cz.streakify.streakify.util

sealed class Result<out T : Any> {

    data class Success<out T : Any>(val data: T) : Result<T>()

    data class Error<T : Any>(val error: ErrorResult, val data: T? = null) : Result<T>()

    fun isSuccess() = this is Success

    fun isError() = this is Error

    fun getOrNull() = when (this) {
        is Error -> data
        is Success -> data
    }

    override fun toString(): String =
        when (this) {
            is Error -> "ErrorResult: [${this.error}]"
            is Success -> "SuccessResult: [${this.data}]"
        }
}

abstract class ErrorResult(
    val message: String? = null,
    val throwable: Throwable? = null
)
