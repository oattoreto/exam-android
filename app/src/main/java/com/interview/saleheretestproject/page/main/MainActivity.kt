package com.interview.saleheretestproject.page.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.lifecycle.Observer
import androidx.viewpager.widget.ViewPager
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.interview.saleheretestproject.ConstantApp
import com.interview.saleheretestproject.R
import com.interview.saleheretestproject.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity(),
    BottomNavigationView.OnNavigationItemSelectedListener {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val pagerAdapter: MainPagerAdapter by lazy { MainPagerAdapter(supportFragmentManager) }
    private val viewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        init()
        setup()
        bind()
    }

    private fun init() {
        binding.vm = viewModel
        binding.lifecycleOwner = this
    }

    private fun setup() {
        binding.apply {
            viewPager.apply {
                adapter = pagerAdapter
                offscreenPageLimit = ConstantApp.mainPagerCount
            }
            bottomNavigate.setOnNavigationItemSelectedListener(this@MainActivity)
        }
    }

    private fun bind() {

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        binding.viewPager.currentItem = when (item.itemId) {
            R.id.action_home -> 0
            R.id.action_wallet -> 1
            R.id.action_rewards -> 2
            R.id.action_profile -> 3
            else -> 0
        }
        return true
    }
}