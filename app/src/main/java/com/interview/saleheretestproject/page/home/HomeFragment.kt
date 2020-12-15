package com.interview.saleheretestproject.page.home

import android.content.Intent
import androidx.lifecycle.Observer
import com.interview.saleheretestproject.R
import com.interview.saleheretestproject.databinding.FragmentHomeBinding
import com.interview.saleheretestproject.page.base.BaseFragment
import com.interview.saleheretestproject.page.goal.GoalActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {

    private val adapter: HomeAdapter by lazy { HomeAdapter() }
    private val viewModel: HomeViewModel by viewModel()

    override fun init() {
        binding.lifecycleOwner = this
    }

    override fun setup() {
        binding.recyclerviewHome.adapter = adapter
    }

    override fun bind() {
        viewModel.getDashboard().observe(this, Observer {
            adapter.submitList(it)
        })
        viewModel.loadPlace()
    }
}