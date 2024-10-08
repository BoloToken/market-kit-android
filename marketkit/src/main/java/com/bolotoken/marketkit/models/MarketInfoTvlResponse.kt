package com.bolotoken.marketkit.models

import com.google.gson.annotations.SerializedName
import java.math.BigDecimal

data class MarketInfoTvlResponse(
    @SerializedName("date")
    val timestamp: Long,
    val tvl: BigDecimal?
)
