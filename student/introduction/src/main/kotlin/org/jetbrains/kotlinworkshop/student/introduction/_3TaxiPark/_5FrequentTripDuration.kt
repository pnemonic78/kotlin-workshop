package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

// Find the most frequent trip interval duration (or several if there are many)
// among 0-9 minutes, 10-19 minutes, 20-29 minutes etc.
// If there's no duration info, return empty list.
fun TaxiPark.findTheMostFrequentTripDurations(): List<IntRange> {
    val perDuration = orders.groupBy { it.duration / 10 }
    val most = perDuration.maxBy { it.value.size }?.value?.size
    return perDuration.filterValues { it.size == most }.keys.map { it * 10 }.map { it.rangeTo(it + 9) }
}