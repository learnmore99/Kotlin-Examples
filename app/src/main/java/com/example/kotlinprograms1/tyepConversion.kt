package com.example.kotlinprograms1

fun main()
{
    val numInt: Int = 10
    val numShort: Short = 14
    val numFloat: Float = 10.00f
    val numDouble: Double = 123.444
    val numIntToString = numInt.toString()
    val numIntToFloat = numInt.toFloat()
    println("Value of numInt before type conversion is $numInt and after conversion is $numIntToString")
    println("Value of numInt before type conversion is $numInt and after conversion is $numIntToFloat")
}