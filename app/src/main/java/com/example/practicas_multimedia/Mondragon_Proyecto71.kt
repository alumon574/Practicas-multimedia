package com.example.practicas_multimedia

    fun sumar71(){
        println("Escribe el primer numero")
        val num1 = readLine()!!.toInt()
        println("Escribe el segundo numero")
        val num2 = readLine()!!.toInt()
        val suma = num1 + num2
        println("La suma da $suma")
    }

fun separador71(){
    println("---------------")
}


    fun main() {
        for (i in 1..5) {
            sumar71()
            separador71()
        }
    }