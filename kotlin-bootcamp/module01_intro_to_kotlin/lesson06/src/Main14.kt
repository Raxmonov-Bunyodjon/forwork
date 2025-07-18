import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var sum = 0
    while (true) {
        var a = scanner.nextInt()

        if (a==0){
            break
        }

        sum += a
    }
    println(sum)
}