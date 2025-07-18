import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Son kiriting noldan katta 3ta: ")
    for (i in 1..3){
        var N = scanner.nextInt()
        println(Fact(N))
    }
}
fun Fact(N: Int): Long{
    return if (N <= 1) 1
    else N * Fact(N - 1)
}
