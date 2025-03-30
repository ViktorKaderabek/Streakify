package cz.streakify.streakify.util.usecase

import cz.streakify.streakify.util.ErrorResult
import cz.streakify.streakify.util.Result
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

interface UseCaseResult<in I : Any, out O : Any> {
    operator fun invoke(data: I): Result<O>
}

interface UseCaseNoResult<in I : Any> {
    operator fun invoke(data: I): Result<Unit>
}

suspend inline fun <T : Any> withUseCaseContext(
    context: CoroutineContext = Dispatchers.Default,
    crossinline block: suspend CoroutineScope.() -> Result<T>
): Result<T> {
    return withContext(context) {
        try {
            block()
        } catch (e: Exception) {
            Result.Error(error = UnhandledExceptionError(e.message))
        }
    }
}

class UnhandledExceptionError
@PublishedApi
internal constructor(message: String?) : ErrorResult(message = message)
