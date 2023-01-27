package com.omtorney.coinfo.data.repository

import com.omtorney.coinfo.data.remote.CoinApi
import com.omtorney.coinfo.data.remote.CoinDetailDto
import com.omtorney.coinfo.data.remote.CoinDto
import com.omtorney.coinfo.domain.repository.Repository
import javax.inject.Inject

class RepositoryImpl @Inject constructor(
    private val api: CoinApi
) : Repository {

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}