package com.interview.saleheretestproject.page.base

import android.app.Activity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment

abstract class BaseFragment<B : ViewDataBinding>(private val layout: Int) : Fragment() {

    lateinit var binding: B
    lateinit var mActivity: Activity

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        activity?.let {
            mActivity = it
        }

        return DataBindingUtil.inflate<B>(inflater, layout, container, false)
            .also { binding = it }.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        init()
        setup()
        bind()
    }

    abstract fun init()

    abstract fun setup()

    abstract fun bind()
}