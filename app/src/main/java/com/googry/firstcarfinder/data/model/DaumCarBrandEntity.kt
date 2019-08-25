package com.googry.firstcarfinder.data.model

import com.googry.firstcarfinder.domain.model.CarBrand

data class DaumCarBrandEntity(
    val title: String,
    val logoUrl: String,
    val category: String
)

fun DaumCarBrandEntity.toDomain() = CarBrand(title, logoUrl, category)