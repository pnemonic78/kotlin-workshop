package org.jetbrains.kotlinworkshop.student.advanced._5Conventions

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

class DateRange(val start: MyDate, val endInclusive: MyDate)

operator fun MyDate.rangeTo(other: MyDate): DateRange = TODO()

enum class TimeInterval {
    DAY,
    WEEK,
    YEAR
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
