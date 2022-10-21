package com.example.practicas_multimedia

class Persona112 constructor(var nombre: String, var edad: Int){

    init {
        if (edad<0)
            edad=0
    }

    fun imprimir112(){
        println("Nombre: $nombre y edad: $edad")
    }

    fun mayorEdad(){
        if (edad>=18)
            println("$nombre es mayor de edad")
        else
            println("$nombre no es mayor de edad")
    }
}

fun main() {
    val p1 = Persona112("Pepe", 20)
    p1.imprimir112()
    p1.mayorEdad()
}