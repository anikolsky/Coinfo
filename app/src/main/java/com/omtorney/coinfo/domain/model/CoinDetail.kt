package com.omtorney.coinfo.domain.model

import com.omtorney.coinfo.data.remote.CoinDetailDto.TeamMember

class CoinDetail(
    val description: String,
    val id: String,
    val isActive: Boolean,
    val isNew: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val tags: List<String>,
    val team: List<TeamMember>
)