import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var son1 = scanner.nextInt()
    var son2 = scanner.nextInt()

    var sum = sumNumbers(son1,son2)
    println(sum)
}

fun sumNumbers(a: Int, b: Int): Int{
    return a+b
}