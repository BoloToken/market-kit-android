package com.bolotoken.marketkit

import com.bolotoken.marketkit.models.HsPointTimePeriod

data class IntervalData(
    val interval: HsPointTimePeriod,
    val fromTimestamp: Long?,
    val visibleTimestamp: Long,
)
