package com.interview.saleheretestproject.page.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.interview.saleheretestproject.ConstantApp
import com.interview.saleheretestproject.model.HomeListModel

class HomeViewModel : ViewModel() {

    private var dashboard = MutableLiveData<ArrayList<HomeListModel>>()

    fun getDashboard(): LiveData<ArrayList<HomeListModel>> {
        return dashboard
    }

    fun loadPlace() {
        val typeToken = object : TypeToken<ArrayList<HomeListModel>>() {}.type
        dashboard.value = Gson().fromJson(ConstantApp.homeData, typeToken)
    }
}