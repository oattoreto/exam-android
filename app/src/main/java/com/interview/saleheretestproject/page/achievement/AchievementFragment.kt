package com.interview.saleheretestproject.page.achievement

import com.interview.saleheretestproject.R
import com.interview.saleheretestproject.databinding.FragmentAchievementBinding
import com.interview.saleheretestproject.page.base.BaseFragment
import com.interview.saleheretestproject.page.home.HomeAdapter

class AchievementFragment :
    BaseFragment<FragmentAchievementBinding>(R.layout.fragment_achievement) {

    private val adapter: AchievementAdapter by lazy { AchievementAdapter() }

    override fun init() {
        binding.lifecycleOwner = this
    }

    override fun setup() {
        binding.recyclerviewAchievement.adapter = adapter
    }

    override fun bind() {

    }
}