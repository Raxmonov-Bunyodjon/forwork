import java.util.Scanner

fun main(args: Array<String>) {
    while (true) {
        val scanner = Scanner(System.`in`)

        var month = scanner.nextInt()

        when (month) {
            2 -> println("28 yoki 29")
            4, 6, 9, 11 -> println(30)
            else -> println("Bunday oy yo'q")

        }
    }
}



