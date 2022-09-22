package com.example.practicas_multimedia

fun main() {
    do {
        println("Escribe numero entre 0 y 999:")
        var num = readLine()!!.toInt()
        if (num in 0..9) println("1 digito")
        if (num in 10..99) println("2 digitos")
        if (num in 100..999) println("3 digitos")
    } while (num!=0)
}
