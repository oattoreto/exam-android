package com.interview.saleheretestproject.model

import android.annotation.SuppressLint
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@SuppressLint("ParcelCreator")
@Parcelize
data class HomeItemModel(
    @SerializedName("amount")
    val amount: Int,
    @SerializedName("amount_maximum")
    val amount_maximum: Int,
    @SerializedName("day_left")
    val day_left: Int,
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("image")
    val image: String
): Parcelable