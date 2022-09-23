package com.example.practicas_multimedia

fun main() {

    var numCuenta = 0
    var saldoActual = 0
    var sumaSaldos = 0
    do {
        println("Escribe numero cuenta:")
        numCuenta = readLine()!!.toInt()
        if (numCuenta > 0) {
            println("Escribe el saldo de la cuenta")
            saldoActual = readLine()!!.toInt()
            sumaSaldos += saldoActual
            var estadoCuenta = if (saldoActual > 0) "Acreedor" else if (saldoActual < 0) "Deudor" else "Nulo"

            println("Numero de cuenta = $numCuenta")
            println("Saldo de cuenta = $saldoActual")
            println(estadoCuenta)

        }

    } while (numCuenta != 0)
    println("Suma de saldos = $sumaSaldos")
}