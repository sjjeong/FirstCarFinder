package com.googry.firstcarfinder.data.model

import com.googry.firstcarfinder.domain.model.Car

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

fun List<DaumCarEntity>.toDomain() = map {
    Car(
        title = it.title,
        imgUrl = it.imgUrl,
        maxPrice = it.maxPrice,
        minPrice = it.minPrice,
        bodyType = it.bodyType,
        maxEfficiency = it.maxEfficiency,
        minEfficiency = it.minEfficiency,
        powerTrain = it.powerTrain,
        releaseDate = it.releaseDate,
        salesStatus = it.salesStatus,
        segment = it.segment,
        years = it.years,
        brandEntity = it.brandEntity.toDomain()
    )
}