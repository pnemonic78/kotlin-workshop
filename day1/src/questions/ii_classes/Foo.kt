package questions.ii_classes

val foo1 = run {
    println("Calculating the answer...")
    42
}

val foo2: Int
    get() {
        println("Calculating the answer...")
        return 42
    }

fun main(args: Array<String>) {
    println("$foo1 $foo1 $foo2 $foo2")
    for (i in 1..2) {
        println(foo1)
        println(foo2)
    }
}