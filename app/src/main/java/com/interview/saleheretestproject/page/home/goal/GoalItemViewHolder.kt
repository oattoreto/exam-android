package com.interview.saleheretestproject.page.home.goal

import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.interview.saleheretestproject.R
import com.interview.saleheretestproject.databinding.FragmentHomeGoalHolderItemBinding
import com.interview.saleheretestproject.model.HomeItemModel
import com.interview.saleheretestproject.page.home.HomeAdapter

class GoalItemViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding: FragmentHomeGoalHolderItemBinding? by lazy {
        DataBindingUtil.bind<FragmentHomeGoalHolderItemBinding>(
            itemView
        )
    }

    fun onBind(item: HomeItemModel, position: Int) {
        binding?.apply {
            this.item = item
        }
    }
}