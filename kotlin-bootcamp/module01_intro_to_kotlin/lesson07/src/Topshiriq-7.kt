import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Matn kiriting x qatnashgan: ")
    var matnE = scanner.next()
    var natija = moveX(matnE)
    println("Yakuniy natija: $natija")
}

fun moveX(matnE: String): String {
    return if (matnE.isEmpty()) ""
    else if (matnE[0] == 'x') moveX(matnE.substring(1)) + "x"
    else matnE[0] + moveX(matnE.substring(1))
}