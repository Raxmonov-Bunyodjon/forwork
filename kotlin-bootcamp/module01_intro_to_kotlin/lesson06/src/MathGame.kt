import java.util.Scanner
import kotlin.random.Random
import kotlin.random.nextInt

fun main(args: Array<String>) {

    //15+18 \
    val scanner = Scanner(System.`in`)
    val random = Random
    while (true) {
        var number1 = random.nextInt(100)
        var number2 = random.nextInt(100)
        var amal = random.nextInt(4)
        var result: Int = 0

        when (amal) {
            0 -> {
                result = number1 + number2
                println("$number1+$number2=")
            }

            1 -> {
                result = number1 - number2
                println("$number1-$number2=")
            }

            2 -> {
                result = number1 * number2
                println("$number1*$number2=")
            }

            3 -> {
                result = number1 / number2
                println("$number1/$number2=")
            }
        }

        var myResult = scanner.nextInt()
        if (result == myResult) {
            println("Siz to`g`ri topdingiz")
        } else {
            println("Siz notog`ri topdingiz")
        }
    }
}