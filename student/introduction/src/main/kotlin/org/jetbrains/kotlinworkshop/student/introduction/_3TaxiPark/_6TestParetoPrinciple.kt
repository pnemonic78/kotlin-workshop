package org.jetbrains.kotlinworkshop.student.introduction._3TaxiPark

// Check whether 20% of the drivers make 80% of the profit
fun TaxiPark.checkParetoPrinciple(): Boolean {
    val profit80 = orders.sumByDouble { it.cost } * 0.80
    val numDrivers20 = allDrivers.size / 5 // 20%

    // Table: Driver vs. Profit
    // 1. Orders => Map<Driver, List<Order>>
    val orderPerDriver = orders.groupBy { it.driver }
    // 2.        => Map<Driver, Sum(Cost)>
    // 3.        => Map<Driver, Profit>
    val profitPerDriver = orderPerDriver.mapValues { it.value.sumByDouble { it.cost } }
    val profitPerDriverDesc = profitPerDriver.toList().sortedByDescending { it.second }
    val profitDesc = profitPerDriverDesc.map { it.second }

    //FIXME use "fold" collector
    var profitSum = 0.0
    var numDriversProfit80 = 0
    for (profit in profitDesc) {
        profitSum += profit
        if (profitSum <= profit80) numDriversProfit80++ else break
    }

    return (numDriversProfit80 <= numDrivers20)
}