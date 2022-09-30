package com.example.practicas_multimedia

fun verPerimetro76(lado:Int){
    val perimetro = lado*4
    println("El perimetro es igual a $perimetro")
}

fun verSuperficie76(lado:Int){
    val superficie=lado*lado
    println("La superficie es igual a $superficie")
}

fun main() {
    println("Escribe el lado del cuadrado:")
    val lado = readLine()!!.toInt()
    println("¿Quieres calcular el perimetro o la superficie del cuadrado?\n" +
            "Escribe el nombre de la operacion deseada en minuscula:")

    val operacion= readLine()!!
    when (operacion){
        "perimetro" -> verPerimetro76(lado)
        "superficie" -> verSuperficie76(lado)
    }
}