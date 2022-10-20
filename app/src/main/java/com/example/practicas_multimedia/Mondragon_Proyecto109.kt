package com.example.practicas_multimedia

class Persona {
    var nombre: String = ""
    var edad: Int = 0

    fun crear109(nombre: String, edad: Int) {
        this.nombre = nombre
        this.edad = edad
    }
    fun imprimir109(){
        println("Se llama $nombre y tiene $edad años")
    }
    fun esMayor109(){
        if (edad>=18)
            println("$nombre es mayor de edad")
        else
            println("$nombre es menor de edad")
    }
}

fun main() {
    val p1 = Persona()
    p1.crear109("Pepe",15)
    p1.imprimir109()
    p1.esMayor109()
    val p2 = Persona()
    p2.crear109("Juan",15)
    p2.imprimir109()
    p2.esMayor109()
}