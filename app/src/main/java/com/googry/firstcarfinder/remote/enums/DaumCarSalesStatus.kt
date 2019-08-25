package com.googry.firstcarfinder.remote.enums

enum class DaumCarSalesStatus(val type: String) {
    // 시판
    SELLING_S("S"),
    // 시판
    SELLING_N("N"),
    // 단종
    DISCONTINUED("D"),
    // 미정
    UNDECIDED("U"),
    // 예정
    ESTIMATED("E");

    companion object {
        const val KEY = "etcInfo.salesStatus"

        fun getParam(statusList: List<DaumCarSalesStatus>) =
            "IN" + statusList.map { "__${it.type}" }.reduce { acc, salesStatus -> "$acc$salesStatus" }
    }
}