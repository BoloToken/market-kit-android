package com.bolotoken.marketkit.storage

import com.bolotoken.marketkit.models.GlobalMarketInfo
import com.bolotoken.marketkit.models.HsTimePeriod

class GlobalMarketInfoStorage(marketDatabase: MarketDatabase) {
    private val dao = marketDatabase.globalMarketInfoDao()

    fun globalMarketInfo(currencyCode: String, timePeriod: HsTimePeriod): GlobalMarketInfo? {
        return dao.getGlobalMarketInfo(currencyCode, timePeriod)
    }

    fun save(globalMarketInfo: GlobalMarketInfo) {
        dao.insert(globalMarketInfo)
    }
}
