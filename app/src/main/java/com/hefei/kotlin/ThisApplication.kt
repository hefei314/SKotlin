package com.hefei.kotlin

import android.app.Application
import com.hefei.kotlin.support.logger.LoggerUtil
import com.tencent.mmkv.MMKV

/**
 * <pre>
 *     author: hefei
 *     time  : 2022/1/19
 *     desc  :
 * </pre>
 */
class ThisApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        initConfig()
    }

    private fun initConfig() {

        LoggerUtil.initLogger()

        MMKV.initialize(this)

    }

}