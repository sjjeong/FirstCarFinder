package com.googry.firstcarfinder.remote.impl

import com.googry.firstcarfinder.data.model.DaumCarEntity
import com.googry.firstcarfinder.data.remote.DaumAutoRemoteDataSource
import com.googry.firstcarfinder.remote.api.DaumAutoApi
import com.googry.firstcarfinder.remote.enums.*
import com.googry.firstcarfinder.remote.model.toData

class DaumAutoRemoteDataSourceImpl(
    private val daumAutoApi: DaumAutoApi
) : DaumAutoRemoteDataSource {
    override suspend fun getCarInfo(
        page: Int,
        sortField: DaumCarSortField,
        sortOrder: DaumCarSortOrder,
        salesStatus: List<DaumCarSalesStatus>?,
        segment: List<DaumCarSegment>?,
        bodyType: List<DaumCarBodyType>?
    ): List<DaumCarEntity> {
        val filterKey =
            (if (salesStatus != null) DaumCarSalesStatus.KEY else "") +
                    (if (segment != null) DaumCarSegment.KEY else "") +
                    (if (bodyType != null) DaumCarBodyType.KEY else "")
        val filterVal =
            (if (!salesStatus.isNullOrEmpty()) DaumCarSalesStatus.getParam(salesStatus) else "") +
                    (if (!segment.isNullOrEmpty()) DaumCarSegment.getParam(segment) else "") +
                    (if (!bodyType.isNullOrEmpty()) DaumCarBodyType.getParam(bodyType) else "")


        return daumAutoApi.getCarInfo(
            pageSize = DEFAULT_PAGE_SIZE,
            page = page,
            sortField = sortField.type,
            sortOrder = sortOrder.type,
            filterKey = filterKey,
            filterVal = filterVal
        ).toData()
    }

    companion object {
        const val DEFAULT_PAGE_SIZE = 20
    }
}