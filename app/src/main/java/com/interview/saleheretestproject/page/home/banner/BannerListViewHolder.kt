package com.interview.saleheretestproject.page.home.banner

import android.view.View
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.interview.saleheretestproject.databinding.FragmentHomeBannerListBinding
import com.interview.saleheretestproject.model.HomeListModel


class BannerListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val adapter: BannerAdapter by lazy { BannerAdapter() }
    private val binding: FragmentHomeBannerListBinding? by lazy {
        DataBindingUtil.bind<FragmentHomeBannerListBinding>(
            itemView
        )
    }

    fun onBind(item: HomeListModel, position: Int) {
        var width = 0
        var height = 0
        var padding = 0
        itemView.context?.let {
            val displayMetrics = it.resources.displayMetrics
            width = displayMetrics.widthPixels
            height = width / 2
            padding = width / 4
        }
        binding?.apply {
            this.item = item
            recyclerviewBanner.adapter = adapter
            recyclerviewBanner.setPadding(16, 0, padding, 0)
            root.layoutParams = FrameLayout.LayoutParams(width, height)
            val helper: SnapHelper = LinearSnapHelper()
            helper.attachToRecyclerView(recyclerviewBanner)
            item.let {
                adapter.submitList(it.list)
            }
        }
    }
}