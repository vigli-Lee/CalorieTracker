/**
 * Created by Vigli on 23,2월,2022
 * Kmong.com
 */

package com.mobile.onboarding_presentation.nutrient_goal

sealed class NutrientGoalEvent {
    data class OnCarbRatioEnter(val ratio: String): NutrientGoalEvent()
    data class OnProteinRatioEnter(val ratio: String): NutrientGoalEvent()
    data class OnFatRatioEnter(val ratio: String): NutrientGoalEvent()
    object OnNextClick: NutrientGoalEvent()
}