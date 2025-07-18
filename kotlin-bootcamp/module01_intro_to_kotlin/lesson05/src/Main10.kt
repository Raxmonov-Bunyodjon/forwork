import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var a = scanner.nextInt()

    when(a){
        in 1..10 -> println("Bir xonali")
        in 10..99 -> println("Ikki xonali")
        in 100..999 -> println("Uch xonali")
        else -> println("Uch xonali sondan katta sonlar")

    }
}