import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    while (true) {
        println("Matn kiriting: ")
        var matn = scanner.next()
        var natija = polindrom(matn)
        println("Polindrommi? $natija")
    }
}

fun polindrom(matn: String): Boolean {
    return if (matn.length <= 1) true
    else if (matn[0] != matn[matn.length - 1]) false
    else polindrom(matn.substring(1, matn.length - 1))
}