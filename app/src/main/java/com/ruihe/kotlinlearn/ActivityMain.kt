package com.ruihe.kotlinlearn

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ActivityMain : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        printList()

        println(describe(1))
        println(describe("Hello"))
        println(describe(100L))
        println(describe("55"))
        filter()

        range()

    }

    fun pareInt(str: String): Long? {
        return str.toLongOrNull()
    }

    //打印集合
    private fun printList() {
        val items = listOf("张三", "李四", "王二")
        for (item in items) {
            println("item Value:$item")
        }

        for (index in items.indices) {
            println("${items[index]} index is: $index")
        }

        //过滤
        items.filter { it.startsWith("王") }
                .forEach { println("过滤结果: $it") }
    }

    // when的用法
    private fun describe(obj: Any): String =
            when (obj) {
                1 -> "One"
                "Hello" -> "Hello"
                is Long -> "Long"
                else -> "unknown"
            }

    // 区间和步长
    private fun range() {
        for (x in 1..10 step 2) {
            println("range Value By Step:$x")
        }

        for (x in 9 downTo 1 step 3) {
            println("range downTo Value By Step:$x")
        }

    }


    //过滤集合
    private fun filter() {
        val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
        fruits.filter { it.startsWith("a") }
                .sortedBy { it }
                .map { it.toUpperCase() }
                .forEach { println("filter:$it") }
    }


}
