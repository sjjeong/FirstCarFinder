package com.googry.firstcarfinder.model

import com.googry.firstcarfinder.domain.model.Car

data class CarSummaryModel(
    val imageUrl: String,
    val name: String,
    val price: String,
    val efficiency: String,
    val powerTrain: String,
    val brandName: String,
    val brandLogoUrl: String
)

fun List<Car>.toPresentation() = map {
    CarSummaryModel(
        imageUrl = it.imgUrl,
        name = it.title,
        price = String.format("%,d ~ %,d", it.minPrice, it.maxPrice),
        efficiency = "${it.minEfficiency} ~ ${it.maxEfficiency}",
        powerTrain = it.powerTrain,
        brandName = it.brandEntity.title,
        brandLogoUrl = it.brandEntity.logoUrl
    )
}