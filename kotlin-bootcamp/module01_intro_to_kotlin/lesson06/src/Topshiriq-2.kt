import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Matn kiriting: ")
    var matn = scanner.next()
    var natija = ""
    for (harf in matn) {
        natija += "$harf$harf"
    }
    println("Matn harflari 2 karraga ko`paydi: $natija")
}