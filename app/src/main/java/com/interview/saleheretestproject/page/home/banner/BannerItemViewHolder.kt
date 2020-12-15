package com.interview.saleheretestproject.page.home.banner

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.interview.saleheretestproject.R
import com.interview.saleheretestproject.databinding.FragmentHomeBannerViewHolderBinding
import com.interview.saleheretestproject.databinding.FragmentHomeGoalHolderItemBinding
import com.interview.saleheretestproject.model.HomeItemModel
import com.interview.saleheretestproject.page.home.HomeAdapter

class BannerItemViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding: FragmentHomeBannerViewHolderBinding? by lazy {
        DataBindingUtil.bind<FragmentHomeBannerViewHolderBinding>(
            itemView
        )
    }

    fun onBind(item: HomeItemModel, position: Int) {
        binding?.apply {
            this.item = item
        }
    }
}