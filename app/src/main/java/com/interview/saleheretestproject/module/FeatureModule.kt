package com.interview.saleheretestproject.module
import com.interview.saleheretestproject.page.home.HomeViewModel
import com.interview.saleheretestproject.page.main.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val featureModule = module {
    viewModel { MainViewModel() }
    viewModel { HomeViewModel() }
}