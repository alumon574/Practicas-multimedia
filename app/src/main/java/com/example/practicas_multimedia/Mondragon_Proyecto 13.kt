package com.example.practicas_multimedia

fun main() {
    val nota1 = readLine()!!.toInt()
    val nota2= readLine()!!.toInt()
    val nota3 = readLine()!!.toInt()
    if (nota1 >10 || nota2 >10 || nota3 > 10)
        println("nota no valida")

    val media = (nota1+nota2+nota3)/3
    if (media>=7)
        println("Promocionado")

}