import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Son kiriting: ")
    var son = scanner.nextInt()
    var natija = sumSonRaqam(son)
    println("Raqamlar yig`indisi: $natija")

}
fun sumSonRaqam(son: Int): Int{
    return if (son == 0) 0
    else (son%10) + sumSonRaqam(son/10)
}

