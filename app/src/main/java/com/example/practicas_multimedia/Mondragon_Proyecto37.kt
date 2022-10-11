package com.example.practicas_multimedia

fun main() {
    print("Numero de empleados de la empresa:")
    val numEmpleados = readLine()!!.toInt()
    var contador = 1
    var conta1 = 0
    var conta2 = 0
    var gastos = 0.0
    while (contador <= numEmpleados) {
        print("Ingrese el sueldo del empleado:")
        val sueldo = readLine()!!.toDouble()
        if (sueldo <= 300)
            conta1++
        else
            conta2++
        gastos = gastos + sueldo;
        contador = contador + 1
    }
    println("Cantidad de empleados con sueldos entre 100 y 300: $conta1")
    println("Cantidad de empleados con sueldos mayor a 300: $conta2")
    System.out.print("Gastos total de la empresa en sueldos: $gastos")
}