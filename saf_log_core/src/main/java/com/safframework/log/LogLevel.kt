package com.safframework.log

/**
 *
 * @FileName:
 *          com.safframework.log.LogLevel
 * @author: Tony Shen
 * @date: 2019-08-15 01:02
 * @version: V1.0 <描述当前版本功能>
 */
enum class LogLevel {
    ERROR {
        override val value: Int
            get() = 0
    },
    WARN {
        override val value: Int
            get() = 1
    },
    INFO {
        override val value: Int
            get() = 2
    },
    DEBUG {
        override val value: Int
            get() = 3
    };

    abstract val value: Int
}