package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

// Find all passengers that were taken by this driver more than once
fun TaxiPark.findFrequentPassengers(driver: Driver): List<Passenger> =
        allPassengers.filter { p -> orders.filter { it.passengers.contains(p) }.count { it.driver == driver } > 1 }