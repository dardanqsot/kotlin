package com.dardan.fuendamentoskotlin.clases

class Phone(val number: Int) {

    fun call(){
        println("Llamando...")
    }

    fun showNumber(){
        println("Mi número es: $number")
    }
}