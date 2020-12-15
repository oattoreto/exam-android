package com.interview.saleheretestproject.page.home.banner
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.interview.saleheretestproject.R
import com.interview.saleheretestproject.model.HomeItemModel

class BannerAdapter  : ListAdapter<HomeItemModel, BannerItemViewHolder>(UserItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BannerItemViewHolder {
        return BannerItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_home_banner_view_holder, parent, false)
        )
    }

    override fun onBindViewHolder(holder: BannerItemViewHolder, position: Int) {
        holder.onBind(getItem(position), position)
    }
}

class UserItemDiffCallback : DiffUtil.ItemCallback<HomeItemModel>() {
    override fun areItemsTheSame(oldItem: HomeItemModel, newItem: HomeItemModel): Boolean = oldItem == newItem

    override fun areContentsTheSame(oldItem: HomeItemModel, newItem: HomeItemModel): Boolean = oldItem == newItem
}