package com.example.myapplication.model

import android.app.Activity
import android.content.Intent

data class UiCloseModel(
    var resultCode : Int = Activity.RESULT_CANCELED,
    var result : Intent? = null
)
