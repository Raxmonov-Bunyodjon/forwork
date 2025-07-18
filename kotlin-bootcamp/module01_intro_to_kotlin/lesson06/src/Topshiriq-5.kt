import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("A sonni kiriting: ")
    var sonA = scanner.nextInt()
    println("B sonni kiriting: ")
    var sonB = scanner.nextInt()

    var kichik = minOf(sonA, sonB)
    var katta = maxOf(sonA,sonB)

    var tartib = 1
    for (i in kichik..katta) {
        for (j in 1..tartib) {
            print("$i")
        }
        println()
       tartib++
    }
}


