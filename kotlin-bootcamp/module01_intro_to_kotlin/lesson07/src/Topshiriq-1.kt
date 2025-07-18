import java.util.Scanner

fun main(args: Array<String>) {

    var natija = InvertDidit()
    println("Teskari son: $natija")
}

fun InvertDidit(): Int{
    val scanner = Scanner(System.`in`)
    println("Butun son kiriting:")
    var son = scanner.nextInt()
    val reversed = son.toString().reversed().toInt()

    return reversed
}