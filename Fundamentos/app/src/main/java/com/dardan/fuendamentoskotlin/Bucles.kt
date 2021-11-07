package com.dardan.fuendamentoskotlin

fun main(){
    newTopic("Bucles")
    showPersons("Angel", "Mary", "Fany")
    showPersons("Angel", "Mary","Darwin", "Daniel", "Carla")
}

fun showPersons(p1: String, p2: String, p3: String){
    println(p1)
    println(p2)
    println(p3)
}

fun showPersons(vararg  persons: String){
    newTopic("FOR")
    for(person in persons) println(person)

    newTopic("WHILE")
    var index = 0
    while (index < persons.size){
        println(persons[index])
        index++
    }
}