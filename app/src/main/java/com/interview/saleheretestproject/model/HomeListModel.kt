package com.interview.saleheretestproject.model

import android.annotation.SuppressLint
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@SuppressLint("ParcelCreator")
@Parcelize
data class HomeListModel(
    @SerializedName("list")
    val list: List<HomeItemModel>,
    @SerializedName("type")
    val type: String,
    @SerializedName("title")
    val title: String
): Parcelable