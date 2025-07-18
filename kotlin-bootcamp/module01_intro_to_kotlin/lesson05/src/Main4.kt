import java.util.Scanner

fun main(args: Array<String>) {
    while (true) {
    val scanner = Scanner(System.`in`)
    var son = scanner.nextInt()

    if (son < 0) {
        println("Manfiy son")
    } else {
        if (son % 2 == 0) {
            println("Juft son")
        } else {
            println("Toq son")
        }
    }
}}