package com.safframework.log.formatter

import com.safframework.log.LoggerPrinter

/**
 *
 * @FileName:
 *          com.safframework.log.formatter.SimpleFormatter
 * @author: Tony Shen
 * @date: 2019-09-15 16:28
 * @version: V1.0 <描述当前版本功能>
 */
class SimpleFormatter:Formatter {

    override fun top()    = LoggerPrinter.BR

    override fun middle() = "," + LoggerPrinter.BLANK

    override fun bottom() = LoggerPrinter.BR

    override fun spliter()= ""
}