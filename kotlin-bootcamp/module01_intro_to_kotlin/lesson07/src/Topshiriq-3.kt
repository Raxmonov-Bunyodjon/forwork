import java.util.Scanner
import kotlin.math.sqrt

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    while (true) {
        //println("Son kiriting: ")
        var K = scanner.nextDouble()
        if (IsSquare(K)) {
            println("true")
        } else {
            println("false")
        }
    }
}

fun IsSquare(K: Double): Boolean {
    var ildiz = sqrt(K)
    return ildiz == ildiz.toInt().toDouble()
}