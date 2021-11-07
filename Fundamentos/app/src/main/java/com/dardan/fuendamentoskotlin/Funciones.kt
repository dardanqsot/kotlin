package com.dardan.fuendamentoskotlin

fun main(){
    sayHello()

    newTopic("Argumentos")
    //println(sum(2,3))
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")
}

private fun sayHello(): Unit {  //Unit = void y el metodo es por defecto void
    println("Hola Kotlin")
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun sub(a: Int, b: Int) = a - b