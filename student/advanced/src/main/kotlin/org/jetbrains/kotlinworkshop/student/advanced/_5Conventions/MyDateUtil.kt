package org.jetbrains.kotlinworkshop.student.advanced._5Conventions

import org.jetbrains.kotlinworkshop.student.advanced._5Conventions.TimeInterval.*
import java.util.*

fun MyDate.nextDay() = addTimeIntervals(DAY, 1)

fun MyDate.addTimeIntervals(timeInterval: TimeInterval, number: Int): MyDate {
    val c = Calendar.getInstance()
    c.set(year + if (timeInterval == YEAR) number else 0, month, dayOfMonth)
    var timeInMillis = c.timeInMillis
    val millisecondsInADay = 24 * 60 * 60 * 1000L
    timeInMillis += number * when (timeInterval) {
        DAY -> millisecondsInADay
        WEEK -> 7 * millisecondsInADay
        YEAR -> 0L
    }
    val result = Calendar.getInstance()
    result.timeInMillis = timeInMillis
    return MyDate(result.get(Calendar.YEAR), result.get(Calendar.MONTH), result.get(Calendar.DATE))
}

operator fun MyDate.compareTo(other: MyDate): Int {
    val y1 = this.year
    val y2 = other.year
    var c = y1 - y2
    if (c != 0) return c

    val m1 = this.month
    val m2 = other.month
    c = m1 - m2
    if (c != 0) return c

    return this.dayOfMonth - other.dayOfMonth
}

operator fun DateRange.contains(date: MyDate): Boolean =
        (start <= date) && (date <= endInclusive)

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate =
        addTimeIntervals(timeInterval, 1)

class DateOperator(val timeInterval: TimeInterval, val number: Int)

operator fun TimeInterval.times(number: Int): DateOperator =
        DateOperator(this, number)

operator fun MyDate.plus(intervals: DateOperator): MyDate =
        addTimeIntervals(intervals.timeInterval, intervals.number)
