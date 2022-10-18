package com.example.practicas_multimedia

fun main() {
    val array1 = IntArray(4)
    val array2 = IntArray(4)
    val array3 = IntArray(4)
    println("Rellena el primer array (4 elementos):")
    for (i in array1.indices)
        array1[i]= readLine()!!.toInt()
    println("Rellena el segundo array (4 elementos):")
    for (i in array2.indices)
        array2[i]= readLine()!!.toInt()
    for (i in array3.indices)
        array3[i]= array1[i] + array2[i]

    println("Array resultante:")
    for (i in array3.indices)
        println(array3[i])
}