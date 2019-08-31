package com.Johnny

fun main() {
    //println("Hello Kotlin")
    //Human().hello()
    var str : String?= "abcde" // String? -> allow str can be assign to null
    str = null
    println(str?.length) // println(str!!.legnth) // handle exception by coder
    println(str?.get(3))
    println(str?.substring(3))


    var h = Human("Johnny",66.5f, 1.7f)

    // 如果string 一定要在前面的話

    var s = Human( weight = 66.5f, height = 1.7f)
    h.hello()
    println(h.bmi())

    val score = 88
    println( score > 60 )


    val c : Char = 'A'
    println( c.toInt() )

    // var --> value 可以被改變
    // val --> valiable 不可以被改變

    val age : Int = 19
    val age2 = 19 //自動揣摩資料型態
    // (x)   age2 = 20 --> val 資料型態被固定

    var name : String ; // 事先定義資料型態
    name = "Johnny"


}

class Human( var name : String= "", var weight : Float, var height : Float ) {
    // 如果第三個值 沒有給的話 就會以初始值最為 此物件的值

    init {
        println("test $weight")
    } // 建構子完成自動執行

//    constructor( name: String, weight: Float, height: Float) : this(weight, height) // 次要建構子

    fun bmi() : Float {
        val bmi = weight / ( height * height)
        return bmi
    }
    fun hello() {
        println("Hello Kotlin")
    }
}