package com.interview.saleheretestproject.page.home.goal
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.interview.saleheretestproject.R
import com.interview.saleheretestproject.model.HomeItemModel

class GoalAdapter  : ListAdapter<HomeItemModel, GoalItemViewHolder>(UserItemDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GoalItemViewHolder {
        return GoalItemViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.fragment_home_goal_holder_item, parent, false)
        )
    }

    override fun onBindViewHolder(holder: GoalItemViewHolder, position: Int) {
        holder.onBind(getItem(position), position)
    }
}

class UserItemDiffCallback : DiffUtil.ItemCallback<HomeItemModel>() {
    override fun areItemsTheSame(oldItem: HomeItemModel, newItem: HomeItemModel): Boolean = oldItem == newItem

    override fun areContentsTheSame(oldItem: HomeItemModel, newItem: HomeItemModel): Boolean = oldItem == newItem
}