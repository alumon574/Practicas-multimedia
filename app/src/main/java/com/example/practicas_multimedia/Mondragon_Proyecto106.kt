package com.example.practicas_multimedia

fun cargar106():IntArray {
    println("¿Cuantos sueldos vas a introducir?")
    val sueldos=IntArray(readLine()!!.toInt())
    for (i in sueldos.indices) {
        println("Escribe sueldo:")
        sueldos[i]= readLine()!!.toInt()
    }
    return sueldos
}

fun imprimir106(sueldos:IntArray){
    println("Listado de sueldos")
    for (sueldo in sueldos)
        println(sueldo)
}
fun main() {
    val sueldos = cargar106()
    imprimir106(sueldos)
}