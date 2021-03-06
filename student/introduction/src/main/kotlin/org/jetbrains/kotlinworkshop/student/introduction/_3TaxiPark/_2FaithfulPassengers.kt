package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

// Find all passengers having more than 'minTrips' number of trips
fun TaxiPark.findFaithfulPassengers(minTrips: Int): List<Passenger> =
        allPassengers.filter { p -> orders.count { it.passengers.contains(p) } > minTrips }