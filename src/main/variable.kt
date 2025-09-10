package main


const val APP = "BELAJAR KOTLIN"
const val VERSION = "1.0"

fun main() {

    // var = immutable
    // val = mutable


    var firstName: String? = "arif"
    val lastName = "rizal"

    firstName = null

    print(firstName + " " + lastName)
    println("welcome to $APP version $VERSION")



}