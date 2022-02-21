/**
 * Created by Vigli on 21,2월,2022
 * Kmong.com
 */

package com.mobile.core.domain.use_case

class FilterOutDigits {
    operator fun invoke(text: String): String {
        return text.filter { it.isDigit() }
    }
}