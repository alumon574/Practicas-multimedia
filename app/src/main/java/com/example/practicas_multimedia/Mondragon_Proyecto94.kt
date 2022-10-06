package com.example.practicas_multimedia

fun main() {
    sueldo94("Pedro",8.50,8)
    sueldo94(pagoHora = 10.00, horas =7, nombre = "joao")
}

fun sueldo94(nombre:String, pagoHora:Double, horas:Int){
    val sueldo=pagoHora*horas
    println("Si $nombre ha trabajado $horas horas a $pagoHora euros por hora, en total ha cobrado: $sueldo ")
}