package com.example.android2homework2

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Nature(
    val natureImage: Int,
    val descriptionOfNature: String
) : Parcelable

