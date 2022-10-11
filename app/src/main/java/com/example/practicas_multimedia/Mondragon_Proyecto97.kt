package com.example.practicas_multimedia

fun main() {
    muestraMayor97()
}

fun muestraMayor97(){
    fun mayor(n1:Int,n2:Int) = if (n1>n2) n1 else n2

    for (i in 1..5){
        println("Escribe primer numero:")
        val n1 = readLine()!!.toInt()
        println("Escribe segundo numero:")
        val n2 = readLine()!!.toInt()
        println("El mayor entre $n1 y $n2 es ${mayor(n1,n2)}")
    }
}