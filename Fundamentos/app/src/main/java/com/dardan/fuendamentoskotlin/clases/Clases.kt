package com.dardan.fuendamentoskotlin.clases

import com.dardan.fuendamentoskotlin.newTopic
import kotlin.math.ln

fun main(){
    newTopic("Clases")
    val phone: Phone = Phone(98765432)
    phone.call()
    phone.showNumber()
    //println(phone.number)
    newTopic("Herencia")
    val smartphone = Smartphone(987654321, true)
    smartphone.call()

    newTopic("Sobreescritura")
    smartphone.showNumber()
    println("Privado? ${smartphone.isPrivate}")
}