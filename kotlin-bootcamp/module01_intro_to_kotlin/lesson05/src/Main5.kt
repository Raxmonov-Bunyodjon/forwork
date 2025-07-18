import jdk.internal.foreign.abi.riscv64.RISCV64Architecture.Regs.x1
import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var a = scanner.nextDouble()
    var b = scanner.nextDouble()
    var c = scanner.nextDouble()
    var D = b.pow(2) - 4 * a * c

    if (D > 0) {
        var x1 = (-b - sqrt(D)) / (2 * a)
        var x2 = (-b + sqrt(D)) / (2 * a)
        println("x1: $x1")
        println("x2: $x2")
    } else if (D == 0.0) {
        var x = -b / (2 * a)
        println("x1: $x")
    } else {
        println("Tenglamaning ildizi yo`q")
    }
}