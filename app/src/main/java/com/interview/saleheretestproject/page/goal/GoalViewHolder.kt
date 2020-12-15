package com.interview.saleheretestproject.page.goal

import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.interview.saleheretestproject.R
import com.interview.saleheretestproject.databinding.ActivityNewGoalViewHolderBinding
import com.interview.saleheretestproject.databinding.FragmentAchievementViewHolderBinding
import com.interview.saleheretestproject.databinding.FragmentHomeBannerListBinding
import com.interview.saleheretestproject.model.HomeListModel


class GoalViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding: ActivityNewGoalViewHolderBinding? by lazy {
        DataBindingUtil.bind<ActivityNewGoalViewHolderBinding>(
            itemView
        )
    }

    fun onBind(position: Int) {
        var width = 0
        var height = 0
        itemView.context?.let {
            val displayMetrics = it.resources.displayMetrics
            width = displayMetrics.widthPixels
            height = width / 3
        }
        binding?.apply {
            root.layoutParams = FrameLayout.LayoutParams(height, height, Gravity.CENTER)
            when (position % 4) {
                0 -> {
                    imageViewGoal.setImageResource(R.drawable.ic_travel)
                    textViewTitle.text = itemView.context.getString(R.string.goal_0)
                }
                1 -> {
                    imageViewGoal.setImageResource(R.drawable.ic_graduation)
                    textViewTitle.text = itemView.context.getString(R.string.goal_1)
                }
                2 -> {
                    imageViewGoal.setImageResource(R.drawable.ic_invest)
                    textViewTitle.text = itemView.context.getString(R.string.goal_2)
                }
                3 -> {
                    imageViewGoal.setImageResource(R.drawable.ic_clothes)
                    textViewTitle.text = itemView.context.getString(R.string.goal_3)
                }
            }
        }
    }
}