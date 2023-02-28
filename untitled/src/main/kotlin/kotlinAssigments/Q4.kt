//Kotlin Program to Multiply two Floating Point Numbers and Program to
//Find ASCII value of a character
package kotlinAssigments

class Q4 {
    companion object{
        @JvmStatic
        fun main(args:Array<String>){

            val num1 = 12.3
            val num2 = 14.1

            val malti = num1+num2

            println("Maltiplication : $malti")

            val ascii = malti.toChar()

            println("ASCII : $ascii")
        }
    }
}