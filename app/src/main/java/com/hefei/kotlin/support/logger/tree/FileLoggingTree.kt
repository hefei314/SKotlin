package com.hefei.kotlin.support.logger.tree

import android.util.Log
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import timber.log.Timber

/**
 * <pre>
 *     author: hefei
 *     time  : 2022/1/26
 *     desc  :
 * </pre>
 */
class FileLoggingTree : Timber.Tree() {

    private val logger: Logger = LoggerFactory.getLogger("FILE")

    override fun log(priority: Int, tag: String?, message: String, t: Throwable?) {
        if (priority == Log.VERBOSE) {
            return
        }

        val logMessage = "$tag: $message"
        when (priority) {
            Log.DEBUG -> logger.debug(logMessage)
            Log.INFO -> logger.info(logMessage)
            Log.WARN -> logger.warn(logMessage)
            Log.ERROR -> logger.error(logMessage)
        }
    }

}