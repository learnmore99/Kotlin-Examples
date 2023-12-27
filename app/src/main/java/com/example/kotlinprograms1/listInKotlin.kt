package com.example.kotlinprograms1
fun main(){
    val immutable_List = listOf("A","B","C") // Declaration of the immutable list
    val mutable_List = mutableListOf("A","B","C") // Declaration of the mutable list
    println(mutable_List.add("D")) // adding element in the mutable list
    println(mutable_List.add(4,"A")) // updating element at index
    println(mutable_List.remove("A")) // Removing an element in List
    println(mutable_List)
    println(mutable_List.removeAt(2)) // Removing an element in List at particular Index
    println(mutable_List.isEmpty()) // Check if the list is empty or not
    println("immutable List : $immutable_List")
    println("mutable List : $mutable_List")
}