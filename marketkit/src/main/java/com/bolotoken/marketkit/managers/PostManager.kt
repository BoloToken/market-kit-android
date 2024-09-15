package com.bolotoken.marketkit.managers

import com.bolotoken.marketkit.models.Post
import com.bolotoken.marketkit.providers.CryptoCompareProvider
import io.reactivex.Single

class PostManager(
    private val provider: CryptoCompareProvider
) {
    fun postsSingle(): Single<List<Post>> {
        return provider.postsSingle()
    }
}
