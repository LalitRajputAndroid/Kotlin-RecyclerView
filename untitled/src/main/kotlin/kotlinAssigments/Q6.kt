//Kotlin Program to Check Whether a Number is Even or Odd
package kotlinAssigments

import java.util.Scanner

class Q6 {

    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            var num : Int

            val sc = Scanner(System.`in`)
            println("Enter a year : ")
            num = sc.nextInt()

            if (num==0){
                println("E")
            }else{
                println("O")
            }
        }
    }
}