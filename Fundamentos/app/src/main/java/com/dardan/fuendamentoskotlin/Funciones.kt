package com.dardan.fuendamentoskotlin

import java.lang.Math.abs

fun main() {
    sayHello()
    contador(5)
    newTopic("Argumentos")
    //println(sum(2,3))
    val a = 2
    val b = 3
    println("$a + $b = ${sum(a,b)}")
    println("$a - $b = ${sub(a,b)}")

    newTopic("Infix")
    val c = -3
    println(c.enableAbs(false))

    newTopic("Sobrecarga de Métodos")
    showProduct("Soda", "10%")
    showProduct("Soda", )
    showProduct("Caramelo","15%" )
    showProduct("Jugo",validity = "15 de marzo" ) //se le conoce como argumentos nombrados
}

private fun sayHello(): Unit {  //Unit = void y el metodo es por defecto void
    println("Hola Kotlin")
}

fun sum(a: Int, b: Int): Int{
    return a + b
}

fun sub(a: Int, b: Int) = a - b

infix fun Int.enableAbs(enable: Boolean) = if(enable) abs(this) else this

fun showProduct(name: String, promo: String = "Sin promoción", validity: String = "agotar existencias"){
    println("$name = $promo hasta $validity")
}

fun contador(cantidad: Int){
    println("Tengo $cantidad manzanas!")
}
