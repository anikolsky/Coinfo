package com.omtorney.coinfo.presentation.detail

import com.omtorney.coinfo.domain.model.CoinDetail

data class CoinDetailState(
    val coin: CoinDetail? = null,
    val isLoading: Boolean = false,
    val error: String? = null // or "" ?
)