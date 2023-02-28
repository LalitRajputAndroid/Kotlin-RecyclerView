//Kotlin Program to Compute Quotient and Remainder
package kotlinAssigments

import java.util.Scanner

class Q5 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val num1: Double
            val num2: Double

            val sc = Scanner(System.`in`)
            print("Enter num1 : ")
            num1 = sc.nextDouble()

            print("Enter num2 : ")
            num2 = sc.nextDouble()

            val divi = num1 / num2

            println("Divition : $divi")
        }
    }
}