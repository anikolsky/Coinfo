package com.omtorney.coinfo.domain.usecase

import com.omtorney.coinfo.data.remote.toCoin
import com.omtorney.coinfo.domain.model.Coin
import com.omtorney.coinfo.domain.repository.Repository
import com.omtorney.coinfo.util.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCoins @Inject constructor(
    private val repository: Repository
) {

    operator fun invoke(): Flow<Resource<List<Coin>>> = flow {
        try {
            emit(Resource.Loading())
            val coins = repository.getCoins()
            emit(Resource.Success(coins.map { it.toCoin() }))
        } catch (e: HttpException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Unexpected error"))
        } catch (e: IOException) {
            emit(Resource.Error(message = e.localizedMessage ?: "Couldn't reach server"))
        }
    }
}