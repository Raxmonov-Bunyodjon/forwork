import java.util.Scanner
import kotlin.math.max

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)
    try {
        println("Birinchi sonni kiriting:")
        var birinchi_son = scanner.nextDouble()
        println("Ikkinchi sonni kiriting:")
        var ikkinchi_son = scanner.nextDouble()
        println("Uchinchi sonni kiriting:")
        var uchinchi_son = scanner.nextDouble()
        var kattasi = maxOf(birinchi_son, ikkinchi_son, uchinchi_son)
        println("Uchta sondan kattasi: $kattasi")
    }  catch (e: Exception) {
        println("Iltimos, faqat bir chiroyliroq son kiriting!:D")
    }
}