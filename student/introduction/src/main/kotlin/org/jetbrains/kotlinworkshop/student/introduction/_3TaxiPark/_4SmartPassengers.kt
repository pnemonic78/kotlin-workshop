package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

// Find passengers that used discounts for majority of the trips
fun TaxiPark.findSmartPassengers(): Set<Passenger> =
        allPassengers.filter { p -> orders.count { it.passengers.contains(p) && it.discount != null } > orders.count { it.passengers.contains(p) && it.discount == null } }.toSet()