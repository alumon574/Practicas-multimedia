package com.example.practicas_multimedia

fun main() {
    var multi3 = 0
    var multi5 = 0
    var multi9 = 0
    for (i in 1..10000){
        if (i%3==0)
            multi3++
        if (i%5==0)
            multi5++
        if (i%9==0)
            multi9++
    }
    println("Multiplos de 3 = $multi3")
    println("Multiplos de 5 = $multi5")
    println("Multiplos de 9 = $multi9")
}