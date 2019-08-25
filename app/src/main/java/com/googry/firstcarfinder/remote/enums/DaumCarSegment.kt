package com.googry.firstcarfinder.remote.enums

enum class DaumCarSegment(val type: String) {
    // 초소형
    Tiny("A"),
    // 경차
    LIGHT("B"),
    // 소형
    SMALL("C"),
    // 중형
    MEDIUM("D"),
    // 대형
    LARGE("E");

    companion object {
        const val KEY = "etcInfo.segment"

        fun getParam(segmentList: List<DaumCarSegment>) =
            "IN" + segmentList.map { "__${it.type}" }.reduce { acc, salesStatus -> "$acc$salesStatus" }
    }
}