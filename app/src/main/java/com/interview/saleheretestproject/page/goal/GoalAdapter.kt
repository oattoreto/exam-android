package com.interview.saleheretestproject.page.goal

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.interview.saleheretestproject.R
import com.interview.saleheretestproject.model.HomeListModel

class GoalAdapter : ListAdapter<HomeListModel, GoalViewHolder>(UserItemDiffCallback()) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoalViewHolder {
        return GoalViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.activity_new_goal_view_holder, parent, false)
        )
    }

    override fun onBindViewHolder(holder: GoalViewHolder, position: Int) {
        holder.onBind(position)
    }

    override fun getItemCount(): Int {
        return 5
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