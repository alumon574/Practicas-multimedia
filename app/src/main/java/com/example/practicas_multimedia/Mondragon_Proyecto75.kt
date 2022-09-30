package com.example.practicas_multimedia

fun muestraMayor75(n1:Int,n2:Int,n3:Int){
    println("El mayor es: ")
    when{
        n1>n2 && n1>n3 -> println(n1)
        n2>n1&& n2>n3 -> println(n2)
        n3>n1 && n3>n2 -> println(n3)
        else -> print("Algun numero esta repetido")
    }    }


fun main() {
    println("Escribe el primer numero a comparar:")
    val n1 = readLine()!!.toInt()
    println("Escribe el segundo numero")
    val n2 = readLine()!!.toInt()
    println("Escribe el ultimo numero")
    val n3 = readLine()!!.toInt()
    muestraMayor75(n1,n2,n3)
}