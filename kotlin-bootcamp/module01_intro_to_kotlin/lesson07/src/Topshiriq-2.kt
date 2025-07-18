import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Son qiymat kiriting:")
    var input = scanner.nextInt()
    var natija = ishora(input)
    println("Natija: $natija")
}

fun ishora(input: Int): String {
    return when{
        input >0 -> "1"
        input <0 -> "-1"
        else -> "0"
    }
}