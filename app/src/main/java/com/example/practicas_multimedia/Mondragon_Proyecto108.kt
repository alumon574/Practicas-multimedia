package com.example.practicas_multimedia

fun cargar108(): IntArray {
    println("¿Cuantos numeros tendrá el array?")
    val array = IntArray(readLine()!!.toInt())
    for (i in array.indices) {
        print("Ingrese elemento:")
        array[i] = readLine()!!.toInt()
    }
    return array
}

fun imprimir108(vector: IntArray) {
    println("Listado completo del array")
    for (elemento in vector)
        println(elemento)
}

fun mayor108(vector: IntArray): Int {
    var may = vector[0]
    for (elemento in vector)
        if (elemento > may)
            may = elemento
    return may
}

fun repite108(vector: IntArray, buscar: Int): Boolean {
    var cant = 0
    for (elemento in vector)
        if (elemento == buscar)
            cant++
    if (cant > 1)
        return true
    else
        return false
}

fun main() {
    var array = cargar108()
    imprimir108(array)
    println("El numero mayor es ${mayor108(array)}")
    if (repite108(array, mayor108(array)))
        println("Se repite el mayor en el array")
    else
        println("No se repite el mayor en el array")
}