package com.rogok.safeargswithnavigationcomponent.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class User(
    val firstName: String,
    val lastName: String
) : Parcelable