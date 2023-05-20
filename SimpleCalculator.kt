import java.util.Scanner

/*
Please Enter First Number : [9000]
Please Enter Math Operation (+ - * /) : [+]
Please Enter Second Number : [8000]

Output : 9000 + 8000 = 17000
Thank you !!!
*/
fun main () {

val scanner = Scanner(System.`in`)
var number1 = 0
    var math = "+"
var number2 = 0

print("Please Enter First Number : ")
number1 = scanner.nextInt()


print("Please Enter Math Operation ( + - * /) : ")
    //math = (scanner.nextInt()to String).toString()
    math = scanner.next();

print("Please Enter Second Number : ")
number2 = scanner.nextInt()

    var result = 0; // number1 + number2
    var isValidCalc = true;

    if("+" == math) {
        result = number1 + number2
    } else if("*" == math) {
        result = number1 * number2
    } else if("/" == math) {
        result = number1 / number2
    } else if("-" == math) {
        result = number1 - number2
    } else {
        println("INVALID OPERATION !!!!!!")
    }

    if(isValidCalc == true) {
        println("Output : $number1 $math $number2 = $result")
    }

    println("Thank You !!!")
}




