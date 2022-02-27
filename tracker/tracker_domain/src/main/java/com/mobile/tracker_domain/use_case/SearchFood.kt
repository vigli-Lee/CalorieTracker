/**
 * Created by Vigli on 27,2월,2022
 * Kmong.com
 */

package com.mobile.tracker_domain.use_case

import com.mobile.tracker_domain.model.TrackableFood
import com.mobile.tracker_domain.repository.TrackerRepository

class SearchFood(
    private val repository: TrackerRepository
) {

    suspend operator fun invoke(
        query: String,
        page: Int = 1,
        pageSize: Int = 40
    ): Result<List<TrackableFood>> {
        if (query.isBlank()) {
            return Result.success(emptyList())
        }
        return repository.searchFood(query.trim(), page, pageSize)
    }
}