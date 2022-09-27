package com.example.practicas_multimedia

fun main() {
    var sumaSueldos = 0
    for (i in 1..10){
        println("Escribe sueldo:")
        var sueldo = readLine()!!.toInt()
        sumaSueldos+= when{
            sueldo >5000 ->{
                println("Sueldo alto")
                sueldo
            }
            sueldo > 2000 ->{
                println("Sueldo medio")
                0
            }
            else -> {
                println("Sueldo bajo")
                0
            }
        }
    }
    println("Suma de sueldos altos = $sumaSueldos")
}