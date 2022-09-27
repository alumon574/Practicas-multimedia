package com.example.practicas_multimedia

fun main() {
    var isosceles = 0
    var equilatero = 0
    var escaleno = 0
    println("Cuantos triangulos vas a introducir?")
    val numTriangulos = readLine()!!.toInt()
    for (i in 1..numTriangulos) {
        println("Escriba primer lado")
        var lado1 = readLine()!!.toInt()
        println("Escriba segundo lado")
        var lado2 = readLine()!!.toInt()
        println("Escriba tercer lado")
        var lado3 = readLine()!!.toInt()
        when{
            lado1==lado2 && lado1==lado3 ->   {println("Equilatero")
            equilatero++}

            lado1==lado2 || lado1==lado3 || lado2==lado3 -> { println("Isosceles")
                isosceles++
            }
            else -> {
                println("Escaleno")

                escaleno++
            }
        }
    }
    println("Cantidades:\n" +
            "Equilateros: $equilatero\n" +
            "Isosceles: $isosceles\n" +
            "Escaleno: $escaleno")
}