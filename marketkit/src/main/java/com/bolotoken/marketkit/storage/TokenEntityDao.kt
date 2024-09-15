package com.bolotoken.marketkit.storage

import androidx.room.*
import com.bolotoken.marketkit.models.*

@Dao
interface TokenEntityDao {

    @Query("SELECT * FROM TokenEntity")
    fun getAll(): List<TokenEntity>

}
