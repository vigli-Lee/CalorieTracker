/**
 * Created by Vigli on 27,2월,2022
 * Kmong.com
 */

package com.mobile.tracker_domain.use_case

import com.mobile.tracker_domain.model.TrackedFood
import com.mobile.tracker_domain.repository.TrackerRepository

class DeleteTrackedFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(trackedFood: TrackedFood) {
        return repository.deleteTrackedFood(trackedFood)
    }
}