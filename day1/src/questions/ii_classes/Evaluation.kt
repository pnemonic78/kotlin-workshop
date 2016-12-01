package questions.ii_classes

class Evaluation1(val positions: Int, val letters: Int)
data class Evaluation2(val positions: Int, val letters: Int)

fun test1() {
    val e1 = Evaluation1(1, 3)
    val e2 = Evaluation1(1, 3)
    println(e1 == e2) // false
}

fun test2() {
    val e1 = Evaluation2(1, 3)
    val e2 = Evaluation2(1, 3)
    println(e1 == e2) // true
}

fun main(args: Array<String>) {
    test1()
    test2()
}
