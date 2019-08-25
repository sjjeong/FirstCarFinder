package com.googry.firstcarfinder.data.remote

import com.googry.firstcarfinder.data.model.DaumCarEntity
import com.googry.firstcarfinder.remote.enums.*

interface DaumAutoRemoteDataSource {
    suspend fun getCarInfo(
        page: Int,
        sortField: DaumCarSortField,
        sortOrder: DaumCarSortOrder,
        salesStatus: List<DaumCarSalesStatus>? = null,
        segment: List<DaumCarSegment>? = null,
        bodyType: List<DaumCarBodyType>? = null
    ): List<DaumCarEntity>
}