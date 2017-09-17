package org.jetbrains.kotlinworkshop.student.advanced._6LazyProperty

// Add a custom getter to make the 'lazy' val really lazy.
// It should be initialized by the invocation of 'initializer()'
// at the moment of the first access.
// You can add as many additional properties as you need.
// Do not use delegated properties!

class LazyProperty(val initializer: () -> Int) {
    var lazyWasInitialized: Boolean = false
    val lazy: Int = 0
        get() {
            if (!lazyWasInitialized) {
                field = initializer()
                lazyWasInitialized = true
            }
            return field
        }
}