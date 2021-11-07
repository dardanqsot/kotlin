package com.dardan.fuendamentoskotlin.clases

open class Phone(protected val number: Int) { //se usa open para permitir a la clase ser heradada por otras clases

    fun call(){
        println("Llamando...")
    }

    open fun showNumber(){
        println("Mi número es: $number")
    }
}