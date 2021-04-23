package com.example.kotlindemo

import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class KotlinTest {
    @Test
    fun test(){
        testList()
    }

    fun testList(){
        var list = listOf<String>("a","b","c","d","e","f","g")

        for (item in list){
            println("this is $item")
        }
    }
}