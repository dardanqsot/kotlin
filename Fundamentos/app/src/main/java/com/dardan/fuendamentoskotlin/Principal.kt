package com.dardan.fuendamentoskotlin

const val separator = "================" //el uso de const solo puede ser en forma global es decir no se puede usar dentro de funciones
fun main(){
    //print("Hola Kotlin")
    newTopic("Hola Kotlin")

    newTopic("Variables y constantes")
    //val a = 2
    val a = "Hola" //CONTANTE
    println(a)

    var b: Int //VARIABLE
    b = 5
    println("b = $b")

    var objNull: Any?
    //objNull = null
    objNull = "HI"
    print(objNull)
}

fun newTopic(topic: String){
/*
    println()
    print("=============")
    print(topic)
    print("=============")
    println()
*/
    //print("\n============= $topic =============\n") //interpolar variables en un string
    print("\n$separator $topic $separator\n")

}
