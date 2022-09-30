package com.example.practicas_multimedia

fun media82(n1:Int,n2:Int,n3:Int):Int{
    return (n1+n2+n3)/3
}

fun main() {
    println("Escribe primer numero")
    val n1 = readLine()!!.toInt()
    println("Escribe segundo numero")
    val n2 = readLine()!!.toInt()
    println("Escribe tercer numero")
    val n3 = readLine()!!.toInt()
    println("Media = ${media82(n1,n2,n3)}")
}