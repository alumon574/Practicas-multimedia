package com.example.practicas_multimedia

fun main() {
    val name1 = "Ataulfo"
    val name2 = "Romualdo"
    println("El nombre mas largo tiene ${comparar91(name1,name2)} caracteres")
}

fun comparar91(name1:String,name2:String):Int = if (name1.length>name2.length) name1.length else name2.length