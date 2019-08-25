package com.googry.firstcarfinder.remote.enums

enum class DaumCarSortField(val type: String) {
    RANKING_PV("ranking.pv"),
    ETCINFO_LATEST_RELEASE_DATE("etcInfo.latestReleaseDate"),
    RANKING_MAX_PRICE("ranking.maxPrice"),
    RANKING_MIN_PRICE("ranking.minPrice"),
    RANKING_MAX_EFFICIENCY("ranking.maxEfficiency"),
    RANKING_MIN_EFFICIENCY("ranking.minEfficiency");
}