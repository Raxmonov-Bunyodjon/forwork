import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    println("Qiymat kiriting 1chi")
    var a = scanner.nextDouble()
    println("Qiymat kiriting 2chi")
    var b = scanner.nextDouble()
    println("Qiymat amalini kiriting! (Masalan: +, -, *, / ")
    var amal = scanner.next()

    when (amal) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        "/" -> println(a / b)
        else -> println("Xato amal kiritildi")
    }
}