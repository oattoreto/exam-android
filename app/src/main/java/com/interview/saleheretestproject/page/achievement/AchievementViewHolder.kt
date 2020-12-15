package com.interview.saleheretestproject.page.achievement

import android.view.Gravity
import android.view.View
import android.widget.FrameLayout
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearSnapHelper
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.SnapHelper
import com.interview.saleheretestproject.databinding.FragmentAchievementViewHolderBinding
import com.interview.saleheretestproject.databinding.FragmentHomeBannerListBinding
import com.interview.saleheretestproject.model.HomeListModel


class AchievementViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    private val binding: FragmentAchievementViewHolderBinding? by lazy {
        DataBindingUtil.bind<FragmentAchievementViewHolderBinding>(
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
        }
    }
}