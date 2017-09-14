package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

// Find all the drivers that completed no orders
fun TaxiPark.findFakeDrivers(): Set<Driver> =
        this.allDrivers.filterNot { this.orders.map { it.driver }.contains(it) }.toSet()