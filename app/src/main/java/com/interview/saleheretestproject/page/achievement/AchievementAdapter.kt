package com.interview.saleheretestproject.page.achievement

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.interview.saleheretestproject.R
import com.interview.saleheretestproject.model.HomeListModel

class AchievementAdapter : ListAdapter<HomeListModel, AchievementViewHolder>(UserItemDiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AchievementViewHolder {
        return AchievementViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_achievement_view_holder, parent, false)
        )
    }

    override fun onBindViewHolder(holder: AchievementViewHolder, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount(): Int {
        return 8
    }
}

class UserItemDiffCallback : DiffUtil.ItemCallback<HomeListModel>() {
    override fun areItemsTheSame(oldItem: HomeListModel, newItem: HomeListModel): Boolean =
        oldItem == newItem

    override fun areContentsTheSame(
        oldItem: HomeListModel,
        newItem: HomeListModel
    ): Boolean = oldItem == newItem
}