package com.Johnny

fun main() {
    //println("Hello Kotlin")
    //Human().hello()
    var h = Human() ;
    h.hello()

    // var --> value 可以被改變
    // val --> valiable 不可以被改變

    val age : Int = 19 ;
    val age2 = 19 ; //自動揣摩資料型態
    // (x)   age2 = 20 --> val 資料型態被固定

    var name : String ; // 事先定義資料型態
    name = "Johnny"


}

class Human() {

    fun hello() {
        println(" Hello Kotlin")
    }
}