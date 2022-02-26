/**
 * Created by Vigli on 26,2월,2022
 * Kmong.com
 */

package com.mobile.tracker_data.mapper

import com.mobile.tracker_data.local.entity.TrackedFoodEntity
import com.mobile.tracker_domain.model.MealType
import com.mobile.tracker_domain.model.TrackedFood
import java.time.LocalDate
import java.util.*

fun TrackedFoodEntity.toTrackedFood(): TrackedFood {
    return TrackedFood(
        name = name,
        carbs = carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        mealType = MealType.fromString(type),
        amount = amount,
        date = LocalDate.of(year, month, dayOfMonth),
        calories = calories,
        id = id
    )
}

fun TrackedFood.toTrackedFoodEntity(): TrackedFoodEntity {
    return TrackedFoodEntity(
        name = name,
        carbs = carbs,
        protein = protein,
        fat = fat,
        imageUrl = imageUrl,
        type = mealType.name,
        amount = amount,
        dayOfMonth = date.dayOfMonth,
        month = date.monthValue,
        year = date.year,
        calories = calories,
        id = id
    )
}
