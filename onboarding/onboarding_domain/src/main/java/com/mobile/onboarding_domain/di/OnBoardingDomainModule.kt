/**
 * Created by Vigli on 23,2월,2022
 * Kmong.com
 */

package com.mobile.onboarding_domain.di

import com.mobile.onboarding_domain.use_case.ValidateNutrients
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
object OnBoardingDomainModule {
    @Provides
    @ViewModelScoped
    fun provideValidateNutrientsUseCase(): ValidateNutrients {
        return ValidateNutrients()
    }
}