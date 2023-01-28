package com.omtorney.coinfo.presentation.list

import com.omtorney.coinfo.domain.model.Coin

data class CoinListState(
    val coins: List<Coin> = emptyList(),
    val isLoading: Boolean = false,
    val error: String = ""
)