/**
 * Created by Vigli on 15,2월,2022
 * Kmong.com
 */

package com.plcoding.calorytracker.navigation

import androidx.navigation.NavController
import com.mobile.core.util.UiEvent

fun NavController.navigate(event: UiEvent.Navigate) {
    this.navigate(event.route)
}