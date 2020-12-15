package com.interview.saleheretestproject.page.goal

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.interview.saleheretestproject.databinding.ActivityNewGoalBinding
import com.interview.saleheretestproject.page.achievement.AchievementAdapter

class GoalActivity : AppCompatActivity(){

    private val binding: ActivityNewGoalBinding by lazy { ActivityNewGoalBinding.inflate(layoutInflater) }
    private val adapter: GoalAdapter by lazy { GoalAdapter() }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        init()
        setup()
        bind()
    }

    private fun init() {
        binding.lifecycleOwner = this
    }

    private fun setup() {
        binding.apply {
            recyclerviewGoal.adapter = adapter
        }
    }

    private fun bind() {

    }
}