package com.example.practicas_multimedia

fun cargar107():IntArray {
    println("Cuantos numeros va a tener el arrray:")
    val array = IntArray(readLine()!!.toInt())
    for (i in array.indices){
        println("Escribe un numero")
        array[i]= readLine()!!.toInt()
    }
    return array
}
fun imprimir107(array: IntArray){
    println("Array completo:")
    for (i in array.indices)
        println(array[i])
}
fun sumar107(array: IntArray):Int {
    var suma = 0
    for (i in array)
        suma+=i
    return suma
}

fun main() {
    var array = cargar107()
    imprimir107(array)
    println("La suma de los elementos del array es: ${sumar107(array)}")
}