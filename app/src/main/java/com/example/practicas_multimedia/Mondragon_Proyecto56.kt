package com.example.practicas_multimedia

fun main() {
    println("Escribe el numero de triangulos")
    val numTriangulos = readLine()!!.toInt()
    var equilatero =0
    var isosceles = 0
    var escaleno = 0
    for (i in 1..numTriangulos){
        println("Escriba primer lado")
        var lado1 = readLine()!!.toInt()
        println("Escriba segundo lado")
        var lado2 = readLine()!!.toInt()
        println("Escriba tercer lado")
        var lado3 = readLine()!!.toInt()
        if (lado1==lado2 && lado1==lado3)
            equilatero++
        if (lado1==lado2 || lado1==lado3 || lado2==lado3)
            isosceles++
            else
                escaleno++
    }
    println("Triangulos equilateros = $equilatero\n" +
            "Triangulos isosceles = $isosceles\n" +
            "Triangulos escalenos = $escaleno" )
}