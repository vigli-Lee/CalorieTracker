/**
 * Created by Vigli on 15,2월,2022
 * Kmong.com
 */

package com.mobile.core.util

sealed class UiEvent {
    object Success: UiEvent()
    object NavigateUp: UiEvent()

    data class ShowSnackbar(val message: UiText): UiEvent()
}