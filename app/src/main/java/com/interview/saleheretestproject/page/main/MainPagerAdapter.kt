package com.interview.saleheretestproject.page.main

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.interview.saleheretestproject.ConstantApp
import com.interview.saleheretestproject.page.achievement.AchievementFragment
import com.interview.saleheretestproject.page.empty.EmptyFragment
import com.interview.saleheretestproject.page.home.HomeFragment

class MainPagerAdapter(fragmentManager: FragmentManager) :
    FragmentPagerAdapter(fragmentManager, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> EmptyFragment()
            2 -> AchievementFragment()
            3 -> EmptyFragment()
            else -> Fragment()
        }
    }

    override fun getCount(): Int = ConstantApp.mainPagerCount
}