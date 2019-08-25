package com.googry.firstcarfinder.data.impl

import com.dino.library.util.DataRemoteBoundResource
import com.googry.firstcarfinder.data.model.DaumCarEntity
import com.googry.firstcarfinder.data.model.toDomain
import com.googry.firstcarfinder.data.remote.DaumAutoRemoteDataSource
import com.googry.firstcarfinder.domain.model.Car
import com.googry.firstcarfinder.domain.repository.DaumAutoRepository
import com.googry.firstcarfinder.remote.enums.*

class DaumAutoRepositoryImpl(
    private val daumAutoRemoteDataSource: DaumAutoRemoteDataSource
) : DaumAutoRepository {
    override suspend fun getCarInfo(
        page: Int,
        sortField: DaumCarSortField,
        sortOrder: DaumCarSortOrder,
        salesStatus: List<DaumCarSalesStatus>?,
        segment: List<DaumCarSegment>?,
        bodyType: List<DaumCarBodyType>?
    ) =
        object : DataRemoteBoundResource<List<Car>, List<DaumCarEntity>>() {
            override suspend fun createRemoteSourceResult(): List<DaumCarEntity> {
                return daumAutoRemoteDataSource.getCarInfo(
                    page,
                    sortField,
                    sortOrder,
                    salesStatus,
                    segment,
                    bodyType
                )
            }

            override suspend fun convertDataToDomain(dataType: List<DaumCarEntity>): List<Car> {
                return dataType.toDomain()
            }
        }.flow()
}