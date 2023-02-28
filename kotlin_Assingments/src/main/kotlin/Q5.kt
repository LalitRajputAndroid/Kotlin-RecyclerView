//Kotlin Program to Check Whether a Number is Even or Odd
fun main(){
    print("Enter a number : ")
    var a = readln()!!.toInt()

    if (a%2==0){
        println("Even")
    }
    else
        println("odd")
}