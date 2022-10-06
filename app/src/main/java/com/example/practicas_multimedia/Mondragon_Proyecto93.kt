package com.example.practicas_multimedia

fun main() {
    println("1+2 = ${suma93(1, 2)}")
    println("1+2+3 = ${suma93(1, 2, 3)}")
    println("1+2+3+4 = ${suma93(1,2,3,4)}")
    println("1+2+3+4+5 = ${suma93(1,2,3,4,5)}")
}

fun suma93(n1: Int, n2: Int, n3: Int = 0, n4: Int = 0, n5: Int = 0) = n1 + n2 + n3 + n4 + n5