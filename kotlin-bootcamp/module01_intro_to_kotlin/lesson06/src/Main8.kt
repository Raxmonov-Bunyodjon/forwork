import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var son = scanner.nextInt()
    var sum = 0
    while (son != 0) {
        var a = son % 10
        son /= 10
        sum += a
    }
    println(sum)
}