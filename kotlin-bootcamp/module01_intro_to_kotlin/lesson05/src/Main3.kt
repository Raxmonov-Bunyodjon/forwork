import java.util.Scanner

fun main(args: Array<String>) {
    while (true) {
    val scanner = Scanner(System.`in`)
    var son = scanner.nextInt()

    if (son>0){
        print("Musbat son")
    } else if (son<0){
        println("Manfiy son")
    } else {
        println("Kiritilgan sonimiz 0 ga teng")
    } }
}