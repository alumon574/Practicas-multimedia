package com.example.practicas_multimedia

fun main() {
    val array = IntArray(5)
    cargar105(array)
    ver105(array)
}

fun cargar105(vector:IntArray){
    for (i in vector.indices){
        println("Escribe numero:")
        vector[i]= readLine()!!.toInt()
    }
}

fun ver105(vector: IntArray){
    for (i in vector.indices){
        println(i)
    }
}