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
        val filterKey = mutableListOf<String>().apply {
            if (salesStatus != null) {
                add(DaumCarSalesStatus.KEY)
            }
            if (segment != null) {
                add(DaumCarSegment.KEY)
            }
            if (bodyType != null) {
                add(DaumCarBodyType.KEY)
            }
        }.joinToString(",")
        val filterVal = mutableListOf<String>().apply {
            if (!salesStatus.isNullOrEmpty()) {
                add(DaumCarSalesStatus.getParam(salesStatus))
            }
            if (!segment.isNullOrEmpty()) {
                add(DaumCarSegment.getParam(segment))
            }
            if (!bodyType.isNullOrEmpty()) {
                add(DaumCarBodyType.getParam(bodyType))
            }
        }.joinToString(",")


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