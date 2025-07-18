import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)
    println("Son kiriting:")
    try {
        var son = scanner.nextDouble()
        var kub_ildiz = son.pow(1.0 / 3.0)

        println("Kiritilgan sonning kub ildizi: $kub_ildiz")
    }    catch (e: Exception) {
        println("Iltimos, faqat musbat son kiriting!")
    }
}