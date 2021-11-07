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

    newTopic("DataClasses")
    val myUser = User(0,"Darwin", "Quispe", Group.FAMILY.ordinal)
    val bro = myUser.copy(1, "Daniel")
    val friend = bro.copy(2, group = Group.FRIEND.ordinal)
    println(myUser.component3())
    println(myUser)
    println(bro)
    println(friend)

    newTopic("Fucnioens de Alcance")
    with(smartphone){
        println("Privado? $isPrivate")
        call()
    }

/*    friend.group = Group.WORK.ordinal
    friend.name = "Juan"
    friend.lastName = "Perez"*/
    friend.apply {
        group = Group.WORK.ordinal
        name = "Juan"
        lastName = "Perez"
    }
    println(friend)
}