package com.googry.firstcarfinder.ui.carfinder

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.dino.library.data.DataResource
import com.dino.library.ui.BaseViewModel
import com.googry.firstcarfinder.domain.usecase.GetCarInfoUseCase
import com.googry.firstcarfinder.model.CarSummaryModel
import com.googry.firstcarfinder.model.toPresentation
import com.googry.firstcarfinder.remote.enums.*
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class CarFinderViewModel(
    private val getCarInfoUseCase: GetCarInfoUseCase
) : BaseViewModel() {

    private var _liveCarSummaryList = MutableLiveData<List<CarSummaryModel>>()
    val liveCarSummaryList: LiveData<List<CarSummaryModel>> = _liveCarSummaryList

    init {
        viewModelScope.launch {
            getCarInfoUseCase(
                1,
                DaumCarSortField.RANKING_PV,
                DaumCarSortOrder.DESC,
                listOf(DaumCarSalesStatus.SELLING_S, DaumCarSalesStatus.SELLING_N),
                DaumCarSegment.values().toList(),
                DaumCarBodyType.values().toList()
            ).collect {
                when (it) {
                    is DataResource.Success -> _liveCarSummaryList.postValue(it.data.toPresentation())
                    is DataResource.Error -> {
                        it.exception.printStackTrace()
                    }
                    DataResource.Loading -> {

                    }
                }
            }
        }
    }
}