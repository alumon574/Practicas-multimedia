package com.example.practicas_multimedia

class Triangulo114(var lado1:Int,var lado2:Int, var lado3:Int){

    constructor():this(0,0,0){
        println("Escribe el primer lado:")
        lado1= readLine()!!.toInt()
        println("Escribe el segundo lado:")
        lado2= readLine()!!.toInt()
        println("Escribe el tercer lado:")
        lado3= readLine()!!.toInt()
    }

    fun ladoMayor(){
        println("Lado mayor")
        when{
            lado1 > lado2 && lado1>lado3 -> println(lado1)
            lado2 > lado3 -> println(lado2)
            else -> println(lado3)
        }
    }

    fun esEquilatero() {
        if (lado1 == lado2 && lado1 == lado3)
            println("Es un triángulo equilátero")
        else
            println("No es un triángulo equilátero")
    }
}

fun main() {
    val t1 = Triangulo114()
    t1.ladoMayor()
    t1.esEquilatero()
    val t2 = Triangulo114(2,2,2)
    t2.ladoMayor()
    t2.esEquilatero()
}