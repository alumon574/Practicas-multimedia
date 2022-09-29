package com.example.practicas_multimedia


fun inicio(){
    println("Escribe 2 valores\n" +
            "Los valores se sumaran\n" +
            "---------------")
}

fun sumar(){
    println("Escribe el primer numero")
    val num1 = readLine()!!.toInt()
    println("Escribe el segundo numero")
    val num2 = readLine()!!.toInt()
    val suma = num1 + num2
    println("La suma da $suma")
}

fun terminar(){
    println("---------------------")
    println("Fin del programa")
}

fun main() {
    inicio()
    sumar()
    terminar()
}