package cz.streakify.streakify.presentation.vm

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

abstract class BaseIntentViewModel<S : VmState, I : VmIntent>(state: S) : ViewModel() {
    var state = mutableStateOf(state)
        protected set

    fun handleIntent(intent: I) {
        viewModelScope.launch {
            onIntent(intent)
        }
    }

    abstract suspend fun onIntent(intent: I)
}

interface VmIntent

interface VmState