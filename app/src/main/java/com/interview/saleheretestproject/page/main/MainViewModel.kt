package com.interview.saleheretestproject.page.main

import androidx.databinding.ObservableField
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.interview.saleheretestproject.ConstantApp


class MainViewModel : ViewModel() {

    private var error = MutableLiveData<String>()

    fun getError(): LiveData<String> = error

}