package com.mobile.core.domain.preferences

import com.mobile.core.domain.model.ActivityLevel
import com.mobile.core.domain.model.Gender
import com.mobile.core.domain.model.GoalType
import com.mobile.core.domain.model.UserInfo

//Not Important to know how implements save and load logic
interface Preferences {
    fun saveGender(gender: Gender)
    fun saveAge(age: Int)
    fun saveWeight(weight: Float)
    fun saveHeight(height: Int)
    fun saveActivityLevel(level: ActivityLevel)
    fun saveGoalType(type: GoalType)
    fun saveCarbRatio(ratio: Float)
    fun saveProteinRatio(ratio: Float)
    fun saveFatRatio(ratio: Float)

    fun loadUserInfo(): UserInfo

    companion object {
        const val KEY_GENDER = "gender"
        const val KEY_AGE = "age"
        const val KEY_WEIGHT = "weight"
        const val KEY_HEIGHT = "height"
        const val KEY_ACTIVITY_LEVEL = "activity_level"
        const val KEY_GOAL_TYPE = "goal_type"
        const val KEY_CARB_RATIO = "carb_ratio"
        const val KEY_PROTEIN_RATIO = "proteign_ratio"
        const val KEY_FAT_RATIO = "fat_ratio"


    }
}