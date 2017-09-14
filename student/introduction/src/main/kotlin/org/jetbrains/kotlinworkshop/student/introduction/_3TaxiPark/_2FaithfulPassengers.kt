package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

// Find all passengers having more than 'minTrips' number of trips
fun TaxiPark.findFaithfulPassengers(minTrips: Int): List<Passenger> =
        this.allPassengers.filter { p -> this.orders.count { it.passengers.contains(p) } > minTrips }