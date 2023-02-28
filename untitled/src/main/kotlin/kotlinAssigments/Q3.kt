//Kotlin Program to Add Two Integers
package kotlinAssigments

import java.util.Scanner

class Q3 {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            val num1 : Int
            val num2 : Int
            val add : Int

            val sc  = Scanner(System.`in`)
            println("Enter num1 : ")
            num1 = sc.nextInt()

            println("Enter num2 : ")
            num2 = sc.nextInt()

            add = num1+num2

            println("Addition : $add")
        }
    }
}