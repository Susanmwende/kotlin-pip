
//Write a program that prompts the user to enter two numbers and prints their sum, difference, product, and quotient.

fun main() {
    var num1 = 50
    var num2 = 30
    var sum = num1 + num2
    var difference = num1 - num2
    var product = num1 * num2
    var result = num1 /num2
    println( sum)
    println(difference)
    println(product)
    println(result)
  //  Write a program that calculates the area of a rectangle. The user should be prompted to enter the length and width of the rectangle.


    var length = 15
    var width = 4
    var area = length * width
    println(area)


 //   Write a program that prompts the user to enter their name, age, and favourite colour, and then prints out a message including all of that information.

    var name = "Susan"
    var age = 20
    var colour = "red"
    var sentence = "my name is ${name} I am ${age} years old and my favourite colour is ${colour} "
    println(sentence)

   println(add(32,34))
  println(addition(arrayOf(20,30,40,50)))


}
//Write a function that takes two integers as parameters and returns their sum.

fun add(num1:Int,num2:Int):Int{
    return (num1+num2)
}
//Write a function that takes an array of integers as a parameter and returns the sum of all the elements.


fun addition(array:Array<Int>):Int{
    return array[0]+array[1]+array[2]+array[3]
}



