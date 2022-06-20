package com.hefei.kotlin.module.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * <pre>
 *     author: hefei
 *     time  : 2022/1/25
 *     desc  :
 * </pre>
 */
class MainViewModel : ViewModel() {

    val countLiveData =  MutableLiveData<String>()
    var title: String = ""

    fun updateTitlePost(str: String) {
        title = str
        countLiveData.postValue(title)
    }
}