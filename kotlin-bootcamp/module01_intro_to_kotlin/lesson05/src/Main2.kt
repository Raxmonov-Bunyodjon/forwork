import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var son = scanner.nextInt()

    if (son>0) {
        println("$son Sonimiz musbat son")
    } else {
        println("$son Sonimiz manfiy son")
    }
}