package com.googry.firstcarfinder.data.model

data class DaumCarEntity(
    val title: String,
    val imgUrl: String,
    val maxPrice: Int,
    val minPrice: Int,
    val bodyType: String,
    val maxEfficiency: String,
    val minEfficiency: String,
    val powerTrain: String,
    val releaseDate: String,
    val salesStatus: String,
    val segment: String,
    val years: String,
    val brandEntity: DaumCarBrandEntity
)