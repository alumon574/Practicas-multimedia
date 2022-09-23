package com.example.practicas_multimedia

fun main() {
    println("Escribe un numero de 1 a 10")
    val num = readLine()!!.toInt()
    //val multiplos = IntArray(12) { (it+1) * num }
   // multiplos.forEach { println(it) }

    for (i in num..num*12 step num)
        println(i)
}