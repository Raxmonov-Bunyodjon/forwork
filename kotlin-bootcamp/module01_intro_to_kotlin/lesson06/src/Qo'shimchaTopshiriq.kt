import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Matn kiriting: ")
    var matn = scanner.next()
    println("Son kiriting (Son>0) bo`lsin: ")
    var son_n = scanner.nextInt()
    var natija = ""
    for (harf in matn) {
        natija += harf.toString().repeat(son_n)
    }
    println("Matn harflari n karraga ko`paydi: $natija")
}