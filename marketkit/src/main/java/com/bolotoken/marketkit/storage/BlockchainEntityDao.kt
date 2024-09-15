package com.bolotoken.marketkit.storage

import androidx.room.*
import com.bolotoken.marketkit.models.*

@Dao
interface BlockchainEntityDao {

    @Query("SELECT * FROM BlockchainEntity")
    fun getAll(): List<BlockchainEntity>

}
