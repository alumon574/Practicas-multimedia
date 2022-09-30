package com.example.practicas_multimedia

fun nameLength81(nombre:String):Int{
    return nombre.length
}

fun main() {
    println("Escribe el primer nombre")
    val nombre1 = nameLength81(readLine()!!)
    println("Escribe el segundo nombre")
    val nombre2 = nameLength81(readLine()!!)
    if (nombre1>nombre2)
        println("El primer nombre es mas largo con $nombre1 caracteres")
    if (nombre2>nombre1)
        println("El segundo nombre es mas largo con $nombre2 caracteres")
    if (nombre1==nombre2)
        println("Misma cantidad de caracteres")
}