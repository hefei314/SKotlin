package com.hefei.kotlin.support.logger

import com.hefei.kotlin.BuildConfig
import com.hefei.kotlin.support.logger.tree.FileLoggingTree
import timber.log.Timber

/**
 * <pre>
 *     author: hefei
 *     time  : 2022/1/26
 *     desc  :
 * </pre>
 */
class LoggerUtil {

    companion object {

        fun initLogger() {
            if (BuildConfig.DEBUG) {
                Timber.plant(Timber.DebugTree())
            } else {
                Timber.plant(FileLoggingTree())
            }
        }
    }
}