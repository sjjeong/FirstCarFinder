package com.googry.firstcarfinder.remote.model

import com.google.gson.annotations.SerializedName

data class DaumCarResponse(
    @SerializedName("countPerPage")
    val countPerPage: Int,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("currentCount")
    val currentCount: Int,
    @SerializedName("currentPage")
    val currentPage: Int,
    @SerializedName("data")
    val `data`: List<Data>,
    @SerializedName("extraInfo")
    val extraInfo: Any,
    @SerializedName("hasNext")
    val hasNext: Boolean,
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
            @SerializedName("maxPrice")
            val maxPrice: Int,
            @SerializedName("minEfficiency")
            val minEfficiency: Int,
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
            @SerializedName("bodyType")
            val bodyType: String,
            @SerializedName("brand")
            val brand: String,
            @SerializedName("cpId")
            val cpId: String,
            @SerializedName("efficiencyUnit")
            val efficiencyUnit: String,
            @SerializedName("generation")
            val generation: String,
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
            @SerializedName("maxEfficiency")
            val maxEfficiency: String,
            @SerializedName("maxPassengers")
            val maxPassengers: String,
            @SerializedName("minEfficiency")
            val minEfficiency: String,
            @SerializedName("minPassengers")
            val minPassengers: String,
            @SerializedName("orgId")
            val orgId: String,
            @SerializedName("powerTrain")
            val powerTrain: String,
            @SerializedName("releaseDate")
            val releaseDate: String,
            @SerializedName("salesStatus")
            val salesStatus: String,
            @SerializedName("segment")
            val segment: String,
            @SerializedName("series")
            val series: String,
            @SerializedName("sterilizeDate")
            val sterilizeDate: String,
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
            @SerializedName("title")
            val title: String,
            @SerializedName("totalCount")
            val totalCount: Int
        ) {
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
                @SerializedName("logo")
                val logo: String,
                @SerializedName("whiteLogo")
                val whiteLogo: String
            )
        }
    }
}