package com.dardan.fuendamentoskotlin

fun main() {
    newTopic("Colecciones")
    newTopic("Solo Lectura")
    val frutaList = listOf<String>("Manzana", "Banana", "Uva", "Durazno")
    println(frutaList.get((0..frutaList.size-1).random()))
    println("Index de Uva es ${frutaList.indexOf("Uva")}")

}