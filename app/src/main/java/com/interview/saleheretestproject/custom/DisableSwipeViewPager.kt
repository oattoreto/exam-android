package com.interview.saleheretestproject.custom

import android.content.Context
import android.util.AttributeSet
import android.view.MotionEvent
import androidx.viewpager.widget.ViewPager

/**
 * Created by ICBZ0000 on 19/1/2561.
 */
class DisableSwipeViewPager(context: Context, attrs: AttributeSet) : ViewPager(context, attrs) {

    var isPagingEnabled = false

    override fun onTouchEvent(event: MotionEvent): Boolean {
        return this.isPagingEnabled && super.onTouchEvent(event)
    }

    override fun onInterceptTouchEvent(event: MotionEvent): Boolean {
        return this.isPagingEnabled && super.onInterceptTouchEvent(event)
    }

    override fun setCurrentItem(item: Int) {
        if (isPagingEnabled) {
            super.setCurrentItem(item)
        } else {
            super.setCurrentItem(item, false)
        }
    }
}