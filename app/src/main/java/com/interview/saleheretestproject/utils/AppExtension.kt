package com.interview.saleheretestproject.utils

import android.annotation.SuppressLint
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.akexorcist.roundcornerprogressbar.RoundCornerProgressBar
import com.interview.saleheretestproject.ConstantApp
import com.interview.saleheretestproject.R
import com.interview.saleheretestproject.model.HomeItemModel
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.fragment_home_goal_holder_item.view.*
import java.text.DecimalFormat

object CustomBinding {
    @BindingAdapter("imageIcon")
    @JvmStatic
    fun handleImageIcon(view: ImageView, id: String? = "") {
        id.let {
            if (it != null && it.trim().isNotEmpty()) {
                when (it) {
                    "travel" -> {
                        view.setImageResource(R.drawable.ic_travel)
                    }
                    "invest" -> {
                        view.setImageResource(R.drawable.ic_invest)
                    }
                    "education" -> {
                        view.setImageResource(R.drawable.ic_graduation)
                    }
                    "clothes" -> {
                        view.setImageResource(R.drawable.ic_clothes)
                    }
                }
            }
        }
    }

    @BindingAdapter("imageUrl")
    @JvmStatic
    fun handleImageUrl(view: ImageView, imageUrl: String? = "") {
        imageUrl.let {
            if (it != null && it.trim().isNotEmpty())
                Picasso.get().load(it).into(view)
        }
    }

    @SuppressLint("SetTextI18n")
    @BindingAdapter("numberFormat")
    @JvmStatic
    fun handleNumber(view: TextView, number: String? = "") {
        number.let {
            view.text = "${
                DecimalFormat(ConstantApp.numberFormat).format(
                    number.toString().trim().toFloat()
                ).toString()
            } THB"
        }
    }

    @SuppressLint("SetTextI18n")
    @BindingAdapter("percent")
    @JvmStatic
    fun handlePercent(view: RoundCornerProgressBar, item: HomeItemModel?) {
        item?.let {
            var percent : Double = 0.0
            percent = ((it.amount.toDouble() / it.amount_maximum) * 100)
            view.setProgress(percent.toInt())
        }
    }
}