package com.example.practicas_multimedia

fun main() {
    val num1 = readLine()!!.toInt()
    val cuadrado= num1*num1
    val cubo = num1*num1*num1
    val numFinal=if (num1%2==0){
        println("El cuadrado es $cuadrado")
    }else{
        println("El cubo es $cubo")
    }
}