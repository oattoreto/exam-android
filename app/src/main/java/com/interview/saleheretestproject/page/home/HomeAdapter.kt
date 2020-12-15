package com.interview.saleheretestproject.page.home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.interview.saleheretestproject.R
import com.interview.saleheretestproject.model.HomeListModel
import com.interview.saleheretestproject.page.home.banner.BannerListViewHolder
import com.interview.saleheretestproject.page.home.goal.GoalListViewHolder

class HomeAdapter : ListAdapter<HomeListModel, RecyclerView.ViewHolder>(UserItemDiffCallback()) {

    private var type: Int = 0
    private val viewTypeItemGoal = 0
    private val viewTypeItemOffer = 1
    private val viewTypeItemSuggest = 2

    override fun getItemViewType(position: Int): Int {
        getItem(position)?.let {
            when (it.type) {
                "goal" -> type = viewTypeItemGoal
                "best_offer" -> type = viewTypeItemOffer
                "suggest" -> type = viewTypeItemSuggest
            }
        }
        return type
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (type) {
            viewTypeItemGoal -> {
                GoalListViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.fragment_home_goal_list, parent, false)
                )
            }
            viewTypeItemOffer, viewTypeItemSuggest -> {
                BannerListViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.fragment_home_banner_list, parent, false)
                )
            }
            else -> {
                GoalListViewHolder(
                    LayoutInflater.from(parent.context)
                        .inflate(R.layout.fragment_home_goal_list, parent, false)
                )
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is GoalListViewHolder -> getItem(position)?.let {
                holder.onBind(it, position)
            }
            is BannerListViewHolder -> getItem(position)?.let {
                holder.onBind(it, position)
            }
        }
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