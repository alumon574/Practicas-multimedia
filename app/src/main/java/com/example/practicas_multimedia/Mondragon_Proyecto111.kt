package com.example.practicas_multimedia

class Alumno{
    var nombre = ""
    var nota = 0

    fun crear111(){
        println("Escribe nombre del alumno:")
        nombre= readLine()!!
        println("Escribe la nota:")
        nota= readLine()!!.toInt()
    }

    fun imprimir111(){
        println("Alumno: $nombre Nota: $nota")
    }

    fun mostrarEstado(){
        if (nota>=4)
            println("$nombre se encuentra en estado regular")
        else
            println("$nombre no esta regular")
    }
}

fun main() {
    val alu1 = Alumno()
    alu1.crear111()
    alu1.imprimir111()
    alu1.mostrarEstado()

    val alu2 = Alumno()
    alu2.crear111()
    alu2.imprimir111()
    alu2.mostrarEstado()
}