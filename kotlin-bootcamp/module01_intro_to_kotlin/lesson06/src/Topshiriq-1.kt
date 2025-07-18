import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Butun son kiriting (son>0):")
    var n_son = scanner.nextInt()
    var natija = 0.0
    for (i in 1..n_son ) {
        natija += 1.0/i
    }
    println("Garmonik yig`indisi: %.2f".format(natija))
}