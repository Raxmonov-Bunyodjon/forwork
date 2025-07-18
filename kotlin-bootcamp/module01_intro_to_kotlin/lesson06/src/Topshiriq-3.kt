import java.util.Scanner
import kotlin.math.pow

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Son kiriting darajasi uchun (Son>0)!: ")
    var son_daraja = scanner.nextInt()
    println("Endi haqiqiy son kiriting sonni asosi uchun:")
    var son_asos = scanner.nextDouble()
    println("${son_asos} Sonning 1 dan $son_daraja gacha bo'lgan barcha darajalari")

    for (i in 1..son_daraja) {
        println("$son_asos ning ${i} si = ${son_asos.pow(i)}")
    }
}
