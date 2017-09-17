package org.jetbrains.kotlinworkshop.student.advanced._4CreatingDsl

@DslMarker
annotation class BreakfastMenuMarker

@BreakfastMenuMarker
class BreakfastMenuItem {
    var name: String? = null
    var price: Double? = null
    var calories: Int? = null
}

@BreakfastMenuMarker
class BreakfastMenu {
    val items = mutableListOf<BreakfastMenuItem>()
}

fun BreakfastMenu.item(init: BreakfastMenuItem.() -> Unit) {
    val item = BreakfastMenuItem()
    item.init()
    items.add(item)
}

fun breakfastMenu(init: BreakfastMenu.() -> Unit): BreakfastMenu {
    return BreakfastMenu().apply {
        init()
    }
}