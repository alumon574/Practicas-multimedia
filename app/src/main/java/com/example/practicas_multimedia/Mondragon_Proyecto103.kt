package com.example.practicas_multimedia

fun main() {
    var sumaTotal = 0
    var sumaMayores36 = 0
    var sumaMayores50 = 0
    val array = IntArray(8)
    for (i in array.indices){
        println("Escribe numero:")
        array[i]= readLine()!!.toInt()
    }
    for (i in array.indices){
        if (array[i]>36)
            sumaMayores36+=array[i]
        if (array[i]>50)
            sumaMayores50+=array[i]
        sumaTotal+=array[i]
    }
    println("Valor total del array = $sumaTotal")
    println("Valor sumado de los numeros mayores a 36 = $sumaMayores36")
    println("Valor sumado de los numeros mayores a 50 = $sumaMayores50")
}