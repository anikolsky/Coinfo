package com.omtorney.coinfo.domain.usecase

import com.omtorney.coinfo.data.remote.toCoinDetail
import com.omtorney.coinfo.domain.model.CoinDetail
import com.omtorney.coinfo.domain.repository.Repository
import com.omtorney.coinfo.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoinDetail @Inject constructor(
    private val repository: Repository
) {

    operator fun invoke(coinId: String): Flow<Resource<CoinDetail>> = flow {
        try {
            emit(Resource.Loading())
            val coin = repository.getCoinById(coinId)
            emit(Resource.Success(coin.toCoinDetail()))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Couldn't reach server"))
        }
    }
}