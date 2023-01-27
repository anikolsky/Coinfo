package com.omtorney.coinfo.domain.repository

import com.omtorney.coinfo.data.remote.CoinDetailDto
import com.omtorney.coinfo.data.remote.CoinDto

interface Repository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}