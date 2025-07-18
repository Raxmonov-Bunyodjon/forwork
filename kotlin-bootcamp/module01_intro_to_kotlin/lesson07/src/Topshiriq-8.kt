import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Matn kiriting: ")
    var matnY = scanner.next()
    var natija = matnyulduzcha(matnY)
    println("Yakuniy natija: $natija")
}

fun matnyulduzcha(matnY: String): String {
    return if (matnY.length == 1) matnY
    else matnY[0] + "*" + matnyulduzcha(matnY.substring(1))
}
