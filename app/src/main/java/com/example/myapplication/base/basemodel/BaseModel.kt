package com.example.myapplication.base.basemodel

import androidx.lifecycle.MutableLiveData

abstract class BaseModel : BaseLibViewModel() {

    /**
     *界面跳转控制
     */
    val uiNavigationData = MutableLiveData<String>()

    /**
     * UI控制组件的关闭
     */
    val uiCloseData = MutableLiveData<String>()

    /**
     * SnackBar控制
     */
    val snackBarData = MutableLiveData<String>()

}