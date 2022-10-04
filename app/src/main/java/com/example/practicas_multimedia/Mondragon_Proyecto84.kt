package com.example.practicas_multimedia

fun main() {
    println("Escribe base del triangulo 1:")
    val base1 = readLine()!!.toInt()
    println("Escribe altura del triangulo 1:")
    val altura1 = readLine()!!.toInt()
    println("Escribe base del triangulo 2:")
    val base2 = readLine()!!.toInt()
    println("Escribe altura del triangulo 2:")
    val altura2 = readLine()!!.toInt()
    println("superfifice del primer rectangulo = ${superficie84(base1,altura1)}\n" +
            "superficie del segundo rectangulo = ${superficie84(base2,altura2)}")

    println("La superficie mayor es: ${rectangulos84(base1,altura1,base2,altura2)}")
}

fun superficie84(l1: Int,l2: Int):Int{
    return l1*l2
}

fun rectangulos84(l1:Int,l2:Int,l3:Int,l4:Int):Int{
   val rec1= superficie84(l1,l2)
    val rec2=superficie84(l3,l4)
    if (rec1>rec2) return rec1
    return rec2
}