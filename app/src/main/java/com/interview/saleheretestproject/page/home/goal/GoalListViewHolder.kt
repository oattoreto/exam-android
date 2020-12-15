package com.interview.saleheretestproject.page.home.goal

import android.content.Intent
import android.view.View
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.interview.saleheretestproject.databinding.FragmentHomeGoalListBinding
import com.interview.saleheretestproject.model.HomeListModel
import com.interview.saleheretestproject.page.goal.GoalActivity
import com.interview.saleheretestproject.page.home.HomeAdapter

class GoalListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val adapter: GoalAdapter by lazy { GoalAdapter() }

    private val binding: FragmentHomeGoalListBinding? by lazy {
        DataBindingUtil.bind<FragmentHomeGoalListBinding>(
            itemView
        )
    }

    fun onBind(item: HomeListModel, position: Int) {
        var width = 0
        itemView.context?.let {
            val displayMetrics = it.resources.displayMetrics
            width = displayMetrics.widthPixels * 3 / 5
        }

        binding?.vm = this
        binding?.apply {
            recyclerviewGoal.adapter = adapter
            recyclerviewGoal.setPadding(16, 0, width, 0)
            val helper: SnapHelper = LinearSnapHelper()
            helper.attachToRecyclerView(recyclerviewGoal)
            item.let {
                adapter.submitList(it.list)
            }
        }
    }

    fun intentNewGoal() {
        itemView.context.startActivity(Intent(itemView.context, GoalActivity::class.java))
    }
}