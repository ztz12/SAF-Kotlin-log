package com.safframework.log

/**
 * Created by Tony Shen on 2017/1/2.
 */
object LoggerPrinter {

    private val MIN_STACK_OFFSET = 3

    /**
     * Drawing toolbox
     */
    private val TOP_LEFT_CORNER    = '╔'
    private val BOTTOM_LEFT_CORNER = '╚'
    private val MIDDLE_CORNER      = '╟'
    private val DOUBLE_DIVIDER     = "═════════════════════════════════════════════════"
    private val SINGLE_DIVIDER     = "─────────────────────────────────────────────────"

    val TOP_BORDER          = TOP_LEFT_CORNER + DOUBLE_DIVIDER + DOUBLE_DIVIDER
    val BOTTOM_BORDER       = BOTTOM_LEFT_CORNER + DOUBLE_DIVIDER + DOUBLE_DIVIDER
    val MIDDLE_BORDER       = MIDDLE_CORNER + SINGLE_DIVIDER + SINGLE_DIVIDER

    val BR                 = System.getProperty("line.separator")     // 换行符
    val HORIZONTAL_DOUBLE_LINE     = "║ "
    val BLANK                      = " "

    /**
     * It is used for json pretty print
     */
    val JSON_INDENT = 2

    fun getStackOffset(trace: Array<StackTraceElement>): Int {
        var i = MIN_STACK_OFFSET
        while (i < trace.size) {
            val e = trace[i]
            val name = e.className
            if (name != LoggerPrinter::class.java.name && name != L::class.java.name) {
                return --i
            }
            i++
        }
        return -1
    }
}