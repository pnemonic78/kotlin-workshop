package org.jetbrains.kotlinworkshop.student.advanced._1BreakingSafety

import java.util.*

class MyClass {
    // Change the implementation of 'myProperty' to make it return different values each time.
    // You may add additional properties if you need.
    val random = Random()
    var prevProperty: Int = 0
    val myProperty: Int
        get() {
            var nextProperty: Int = random.nextInt()
            while (prevProperty == nextProperty) {
                nextProperty = random.nextInt()
            }
            prevProperty = nextProperty
            return nextProperty
        }
}