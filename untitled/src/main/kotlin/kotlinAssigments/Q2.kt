//Kotlin Program to Print an Integer (Entered by the User)
package kotlinAssigments

import java.util.Scanner

class Q2 {

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {

            val sc = Scanner(System.`in`)
            print("Enter your number : ")
            val num = sc.nextInt()

            println("Your number is :$num")

        }
    }
}