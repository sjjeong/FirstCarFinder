package com.googry.firstcarfinder.ui.carfinder

import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.dino.library.ui.BaseFragment
import com.dino.library.ui.SimpleRecyclerView
import com.dino.library.util.EndlessRecyclerViewScrollListener
import com.googry.firstcarfinder.BR
import com.googry.firstcarfinder.R
import com.googry.firstcarfinder.databinding.FragmentCarFinderBinding
import com.googry.firstcarfinder.databinding.ItemCarSummaryBinding
import com.googry.firstcarfinder.model.CarSummaryModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class CarFinderFragment : BaseFragment<FragmentCarFinderBinding, CarFinderViewModel>(
    R.layout.fragment_car_finder
) {
    override val viewModel by viewModel<CarFinderViewModel>()

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        binding {
            rvContent.run {
                adapter =
                    object : SimpleRecyclerView.Adapter<CarSummaryModel, ItemCarSummaryBinding>(
                        R.layout.item_car_summary,
                        BR.item
                    ) {}
                layoutManager?.let {
                    addOnScrollListener(object : EndlessRecyclerViewScrollListener(it) {
                        override fun onLoadMore(
                            page: Int,
                            totalItemsCount: Int,
                            view: RecyclerView
                        ) {
                            viewModel.loadCarInfo()
                        }
                    })
                }
            }
        }
    }
}