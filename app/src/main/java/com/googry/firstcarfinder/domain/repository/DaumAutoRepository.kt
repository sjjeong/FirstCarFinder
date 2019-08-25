package com.googry.firstcarfinder.domain.repository

import com.dino.library.data.DataResource
import com.googry.firstcarfinder.domain.model.Car
import com.googry.firstcarfinder.remote.enums.*
import kotlinx.coroutines.flow.Flow

interface DaumAutoRepository {
    suspend fun getCarInfo(
        page: Int,
        sortField: DaumCarSortField,
        sortOrder: DaumCarSortOrder,
        salesStatus: List<DaumCarSalesStatus>? = null,
        segment: List<DaumCarSegment>? = null,
        bodyType: List<DaumCarBodyType>? = null
    ): Flow<DataResource<List<Car>>>

}