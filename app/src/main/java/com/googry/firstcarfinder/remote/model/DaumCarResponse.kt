package com.googry.firstcarfinder.remote.model

import com.google.gson.annotations.SerializedName

data class DaumCarResponse(
    // 페이지당 몇개
    @SerializedName("countPerPage")
    val countPerPage: Int,
    // 요청시간
    @SerializedName("createdAt")
    val createdAt: String,
    // 현재 페이지의 데이터 개수
    @SerializedName("currentCount")
    val currentCount: Int,
    // 현재 페이지
    @SerializedName("currentPage")
    val currentPage: Int,
    // 데이터
    @SerializedName("data")
    val `data`: List<Data>,
    // 알수 없음
    @SerializedName("extraInfo")
    val extraInfo: Any,
    // 다음 페이지 부를것이 있는지
    @SerializedName("hasNext")
    val hasNext: Boolean,
    // 총 데이터 개수
    @SerializedName("totalCount")
    val totalCount: Int
) {
    data class Data(
        @SerializedName("_id")
        val id: Int,
        @SerializedName("contentsCounter")
        val contentsCounter: ContentsCounter,
        @SerializedName("contentsMapDt")
        val contentsMapDt: ContentsMapDt,
        // 차량 정보
        @SerializedName("etcInfo")
        val etcInfo: EtcInfo,
        @SerializedName("factor")
        val factor: Factor,
        @SerializedName("image")
        val image: Image,
        @SerializedName("keyword")
        val keyword: List<String>,
        @SerializedName("modiDt")
        val modiDt: Long,
        @SerializedName("parentCluster")
        val parentCluster: ParentCluster,
        @SerializedName("ranking")
        val ranking: Ranking,
        @SerializedName("regDt")
        val regDt: Long,
        // 차량명
        @SerializedName("title")
        val title: String,
        @SerializedName("totalCount")
        val totalCount: Int
    ) {
        data class Image(
            @SerializedName("exterior")
            val exterior: String
        )

        data class Ranking(
            @SerializedName("avgRate")
            val avgRate: Double,
            @SerializedName("maxEfficiency")
            val maxEfficiency: Int,
            // 최고가격
            @SerializedName("maxPrice")
            val maxPrice: Int,
            @SerializedName("minEfficiency")
            val minEfficiency: Int,
            // 최소가격
            @SerializedName("minPrice")
            val minPrice: Int,
            @SerializedName("pv")
            val pv: Int
        )

        data class ContentsMapDt(
            @SerializedName("comment")
            val comment: Long,
            @SerializedName("harmony")
            val harmony: Long,
            @SerializedName("news")
            val news: Long,
            @SerializedName("photo")
            val photo: Long,
            @SerializedName("video")
            val video: Long
        )

        data class Factor(
            @SerializedName("category")
            val category: String,
            @SerializedName("important")
            val important: Any,
            @SerializedName("service")
            val service: String,
            @SerializedName("status")
            val status: String,
            @SerializedName("type")
            val type: String
        )

        data class ContentsCounter(
            @SerializedName("comment")
            val comment: Int,
            @SerializedName("harmony")
            val harmony: Int,
            @SerializedName("news")
            val news: Int,
            @SerializedName("photo")
            val photo: Int,
            @SerializedName("video")
            val video: Int
        )

        data class EtcInfo(
            // [DaumCarBodyType]
            @SerializedName("bodyType")
            val bodyType: String,
            // 브랜드
            @SerializedName("brand")
            val brand: String,
            @SerializedName("cpId")
            val cpId: String,
            // 연비 단위
            @SerializedName("efficiencyUnit")
            val efficiencyUnit: String,
            @SerializedName("generation")
            val generation: String,
            // 등급
            @SerializedName("grades")
            val grades: String,
            @SerializedName("group")
            val group: String,
            @SerializedName("imported")
            val imported: String,
            @SerializedName("lastUpdatedAt")
            val lastUpdatedAt: String,
            @SerializedName("latestReleaseDate")
            val latestReleaseDate: String,
            // 최대 연비
            @SerializedName("maxEfficiency")
            val maxEfficiency: String,
            @SerializedName("maxPassengers")
            val maxPassengers: String,
            // 최소 연비
            @SerializedName("minEfficiency")
            val minEfficiency: String,
            @SerializedName("minPassengers")
            val minPassengers: String,
            @SerializedName("orgId")
            val orgId: String,
            // 연료
            @SerializedName("powerTrain")
            val powerTrain: String,
            // 출시일
            @SerializedName("releaseDate")
            val releaseDate: String,
            // [DaumCarSalesStatus]
            @SerializedName("salesStatus")
            val salesStatus: String,
            // [DaumCarSegment]
            @SerializedName("segment")
            val segment: String,
            @SerializedName("series")
            val series: String,
            @SerializedName("sterilizeDate")
            val sterilizeDate: String,
            // 연도
            @SerializedName("years")
            val years: String
        )

        data class ParentCluster(
            @SerializedName("_id")
            val id: Int,
            @SerializedName("contentsCounter")
            val contentsCounter: ContentsCounter,
            @SerializedName("contentsMapDt")
            val contentsMapDt: ContentsMapDt,
            @SerializedName("etcInfo")
            val etcInfo: EtcInfo,
            @SerializedName("factor")
            val factor: Factor,
            @SerializedName("image")
            val image: Image,
            @SerializedName("keyword")
            val keyword: List<String>,
            @SerializedName("modiDt")
            val modiDt: Long,
            @SerializedName("regDt")
            val regDt: Long,
            // 회사명
            @SerializedName("title")
            val title: String,
            @SerializedName("totalCount")
            val totalCount: Int
        ) {
            data class Factor(
                // 국내/해외
                @SerializedName("category")
                val category: String,
                @SerializedName("important")
                val important: Any,
                @SerializedName("service")
                val service: String,
                @SerializedName("status")
                val status: String,
                @SerializedName("type")
                val type: String
            )

            data class EtcInfo(
                @SerializedName("appendPrefix")
                val appendPrefix: String,
                @SerializedName("consulting")
                val consulting: String,
                @SerializedName("guarantee")
                val guarantee: String,
                @SerializedName("homepage")
                val homepage: String,
                @SerializedName("order")
                val order: String,
                @SerializedName("orgId")
                val orgId: String,
                @SerializedName("showroom")
                val showroom: String,
                @SerializedName("tel1")
                val tel1: String,
                @SerializedName("titleEn")
                val titleEn: String
            )

            data class ContentsCounter(
                @SerializedName("comment")
                val comment: Int,
                @SerializedName("harmony")
                val harmony: Int,
                @SerializedName("news")
                val news: Int,
                @SerializedName("video")
                val video: Int
            )

            data class ContentsMapDt(
                @SerializedName("comment")
                val comment: Long,
                @SerializedName("harmony")
                val harmony: Long,
                @SerializedName("news")
                val news: Long,
                @SerializedName("video")
                val video: Long
            )

            data class Image(
                // 로고
                @SerializedName("logo")
                val logo: String,
                @SerializedName("whiteLogo")
                val whiteLogo: String
            )
        }
    }
}