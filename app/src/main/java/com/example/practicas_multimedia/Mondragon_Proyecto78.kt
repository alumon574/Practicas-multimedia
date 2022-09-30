package com.example.practicas_multimedia

fun ordenarTres78(n1:Int,n2:Int,n3:Int){
    println("Los numeros tienen este orden de menor a mayor:")
    when {
        n1<n2 && n1<n3 -> if (n2<n3){
            println("$n1<$n2<$n3")
        }
        else println("$n1<$n3<$n2")
        n2<n3 -> if (n1<n3)
            println("$n2<$n1<$n3")
        else println("$n2<$n3<$n1")

        else -> if (n1<n2){
            println("$n3<$n1<$n2")
        }
        else println("$n3<$n2<$n1")
    }

}

fun main() {
    println("Escribe primer numero:")
    val n1 = readLine()!!.toInt()
    println("Segundo numero:")
    val n2 = readLine()!!.toInt()
    println("Tercer numero:")
    val n3 = readLine()!!.toInt()
    ordenarTres78(n1,n2,n3)
}