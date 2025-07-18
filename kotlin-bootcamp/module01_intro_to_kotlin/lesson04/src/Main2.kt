import java.util.Scanner
import kotlin.math.max

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)
    var a = scanner.nextDouble()
    var b = scanner.nextDouble()
    var max = max(a,b)
    print(max)
}