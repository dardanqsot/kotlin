package com.dardan.fuendamentoskotlin

fun main(){
    //print("Hola Kotlin")
    newTopic("Hola Kotlin")

    newTopic("Variables y constantes")
    //val a = 2
    val a = "Hola"
    println(a)

    var b: Int
    b = 5
    println("b = $b")
}

fun newTopic(topic: String){
/*
    println()
    print("=============")
    print(topic)
    print("=============")
    println()
*/
    print("\n============= $topic =============\n") //interpolar variables en un string
}
