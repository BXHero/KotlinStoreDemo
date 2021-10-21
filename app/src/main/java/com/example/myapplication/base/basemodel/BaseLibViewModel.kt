@file:Suppress("unused")

package com.example.myapplication.base.basemodel

import androidx.lifecycle.ViewModel

/**
 * MVVM ViewModel 基类
 *
 * - 继承 [ViewModel]
 *
 * @author 王杰
 */
abstract class BaseLibViewModel
    : ViewModel() {
    
    override fun onCleared() {
//        InternalLog.i("BaseLibViewModel", "View onCleared ----> ViewModel: $this")
    }
}