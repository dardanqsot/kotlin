package com.dardan.fuendamentoskotlin.clases

import com.dardan.fuendamentoskotlin.newTopic

fun main(){
    newTopic("Clases")
    val phone: Phone = Phone(98765432)
    phone.call()
    phone.showNumber()
    println(phone.number)
}