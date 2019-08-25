package com.googry.firstcarfinder.domain.usecase

import com.googry.firstcarfinder.domain.repository.DaumAutoRepository
import com.googry.firstcarfinder.remote.enums.*

class GetCarInfoUseCase(
    private val daumCarRepository: DaumAutoRepository
) {

    suspend operator fun invoke(
        page: Int,
        sortField: DaumCarSortField,
        sortOrder: DaumCarSortOrder,
        salesStatus: List<DaumCarSalesStatus>? = null,
        segment: List<DaumCarSegment>? = null,
        bodyType: List<DaumCarBodyType>? = null
    ) = daumCarRepository.getCarInfo(page, sortField, sortOrder, salesStatus, segment, bodyType)

}