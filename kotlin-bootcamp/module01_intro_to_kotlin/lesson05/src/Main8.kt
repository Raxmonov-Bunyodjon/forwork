import java.util.Scanner

fun main(args: Array<String>) {
    while (true) {
    val scanner = Scanner(System.`in`)

    var son = scanner.nextInt()

    when(son){
        1 -> println("Dushanba")
        2 -> println("Seshanba")
        3 -> println("Chorshanba")
        4 -> println("Payshanba")
        5 -> println("Juma")
        6 -> println("Shanba")
        7 -> println("Yakshanba")
        else -> println("Bunday hafta kuni mavjut emas!")
    }
}}