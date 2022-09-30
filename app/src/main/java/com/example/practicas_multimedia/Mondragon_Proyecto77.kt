package com.example.practicas_multimedia

fun compararClaves77(c1:String,c2:String){
    if (c1==c2)
        println("Las dos claves son iguales")
    else println("Las claves son diferentes")
}

fun main() {
    println("Escribe la primera clave:")
    val c1 = readLine()!!
    println("Escribe la segunda clave:")
    val c2 = readLine()!!

    compararClaves77(c1,c2)
}