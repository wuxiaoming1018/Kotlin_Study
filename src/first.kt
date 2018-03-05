/**
 *@author wuxiaoming
 *@date 2017-11-20 14:36
 */

var a = 1
val s1 = "a is $a"
val s2 = "${s1.replace("is", "was")},but now is $a"


fun main(args: Array<String>) {
    println(max(50, 30))
    vars(0, 1, 2, 3, 4, 5, 6, 7)
    println(sum(10, 51))
    println("-------------------------------")
    println(s2)
    println("-------------------------------")
    a = 2
    println(s2)
    println("-------------------------------")
    testNull()
    println("-------------------------------")
    testFor()
    test()
}

fun max(x: Int, y: Int) = if (x > y) {
    x
} else {
    y
}

//函数的边长参数可以用vararg关键字进行标识
fun vars(vararg v: Int) {
    for (i in v) {
//        println("i=$i")
        println("${max(i, i + 1)}")
    }
}

fun sum(x: Int, y: Int) = x + y

fun testNull(): Unit {
    var age: String? = "23"
    var ages = age!!.toInt()
    var age1 = age?.toInt()
    var age2 = age?.toInt() ?: -1
    println("$age,$ages,$age1,$age2")
}

fun testFor(){
    println("\n-------in循环---------")
    for(i in 1..4) print(i)
    println("\n-------step设置步长--------")
    for (i in 0..20 step 3) print(i)
    println("\n-------使用downTo---------")
    for (i in 10 downTo 0 step 2) print(i)
    println("\n-------使用until排除---------")
    for (i in 1 until 9) print(i)
    println("\n----------------")
}

fun test(){
    val a :Int=11
    println(a==a)
    val boxedA:Int?=a
    val anotherBoxedA:Int?=a
    println(boxedA===anotherBoxedA)
    val aa:Int=10
    println(aa==aa)
    val boxedAa:Int?=aa
    val anotherBoxedAa:Int?=aa
    println(boxedAa===anotherBoxedAa)
}