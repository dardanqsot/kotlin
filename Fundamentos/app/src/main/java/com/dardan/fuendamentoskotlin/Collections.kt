package com.dardan.fuendamentoskotlin

import com.dardan.fuendamentoskotlin.clases.Group
import com.dardan.fuendamentoskotlin.clases.User

fun main() {
    newTopic("Colecciones")
    newTopic("Solo Lectura")
    val frutaList = listOf<String>("Manzana", "Banana", "Uva", "Durazno")
    println(frutaList.get((0..frutaList.size-1).random()))
    println("Index de Uva es ${frutaList.indexOf("Uva")}")

    newTopic("Mutable List")
    val myUser = User(0,"Darwin", "Quispe", Group.FAMILY.ordinal)
    val bro = myUser.copy(1, "Daniel")
    val friend = bro.copy(2, group = Group.FRIEND.ordinal)

    val usersList = mutableListOf(myUser, bro)
    println(usersList)
    usersList.add(friend)
    println(usersList)
    //usersList.removeAt(1)
    usersList.remove(bro)
    println(usersList)

    val userSelectedList = mutableListOf<User>()
    println(userSelectedList)
    //userSelectedList.addAll(usersList)
    userSelectedList.add(myUser)
    println(userSelectedList)
    userSelectedList.set(0,bro)
    println(userSelectedList)
    userSelectedList.add(myUser)
    userSelectedList.add(myUser)
    println(userSelectedList)
}