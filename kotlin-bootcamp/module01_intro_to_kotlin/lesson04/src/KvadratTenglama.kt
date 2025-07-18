import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    //ax2 + bx + c = 0
    //a, b, c
    //D = b2 - 4ac
    while (true) {
        var scanner = Scanner(System.`in`)
        println("a sonni kiriting: ")
        var a = scanner.nextDouble()
        println("b sonni kiriting: ")
        var b = scanner.nextDouble()
        println("c sonni kiriting: ")
        var c = scanner.nextDouble()

        var D = b.pow(2) - 4 * a * c

        var x1 = (-b - sqrt(D)) / (2 * a)
        var x2 = (-b + sqrt(D)) / (2 * a)

        println("Kvadrat tenglamani birichi ildizi x1: $x1")
        println("Kvadrat tenglamani ikkinchi ildizi x2: $x2")
    }
}