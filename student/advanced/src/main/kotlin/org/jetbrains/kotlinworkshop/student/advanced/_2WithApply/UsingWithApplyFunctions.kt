package org.jetbrains.kotlinworkshop.student.advanced._2WithApply

class BreakfastMenuItem {
    var name: String? = null
    var price: Double? = null
    var calories: Int? = null
}

fun initializeMenuItem(): BreakfastMenuItem {
    val menuItem = BreakfastMenuItem()
    menuItem.name = "Belgian Waffles"
    menuItem.price = 5.95
    menuItem.calories = 650
    return menuItem
}

fun initializeMenuItem1(): BreakfastMenuItem {
    val menuItem = BreakfastMenuItem()
    with(menuItem) {
        name = "Belgian Waffles"
        price = 5.95
        calories = 650
    }
    return menuItem
}

fun initializeMenuItem2(): BreakfastMenuItem {
    val menuItem = BreakfastMenuItem()
    return menuItem.apply {
        name = "Belgian Waffles"
        price = 5.95
        calories = 650
    }
}