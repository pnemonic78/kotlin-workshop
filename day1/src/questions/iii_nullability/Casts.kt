package questions.iii_nullability

fun main(args: Array<String>) {
    val i = null
//    println(i as Int)   // exception
    println(i as Int?)    // null
    println(i as? Int)    // null


    val j: String = ""
//    println(j as Int?)  // exception
    println(j as? Int)  // null
}