package com.bolotoken.marketkit.providers

import com.bolotoken.marketkit.managers.CoinPriceManager
import com.bolotoken.marketkit.managers.ICoinPriceCoinUidDataSource
import com.bolotoken.marketkit.Scheduler

class CoinPriceSchedulerFactory(
    private val manager: CoinPriceManager,
    private val provider: HsProvider
) {
    fun scheduler(currencyCode: String, coinUidDataSource: ICoinPriceCoinUidDataSource): Scheduler {
        val schedulerProvider = CoinPriceSchedulerProvider(currencyCode, manager, provider)
        schedulerProvider.dataSource = coinUidDataSource
        return Scheduler(schedulerProvider)
    }
}
