package com.example.practicas_multimedia

fun main() {
    println("Primeros 15 multiplos de 4:")
    multiplos95(4,15)
}

fun multiplos95(num:Int,multiplos:Int = 10){
    for (i in num..num*multiplos step num)
        println(i)
}