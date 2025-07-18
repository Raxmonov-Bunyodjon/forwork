import java.util.Scanner
import kotlin.math.abs

fun main(args: Array<String>) {
    println("Sonlar o'qida uchta A, B, C nuqtalar berilgan.\nA nuqtaga eng yaqin nuqta va ular orasidagi masofa topilsin.")
    val scanner = Scanner(System.`in`)
    println("A qiymatni kiriting")
    var a = scanner.nextDouble()
    println("B qiymatni kiriting")
    var b = scanner.nextDouble()
    println("C qiymatni kiriting")
    var c = scanner.nextDouble()
    var bir_case = abs(a-b)
    var ikki_case = abs(a-c)

    if (bir_case>ikki_case){
        println("A nuqtaga yaqin nuta C\nVa ular orasidagi eng qisqa masofa $ikki_case")
    }else {
        println("A nuqtaga yaqin nuta B\nVa ular orasidagi eng qisqa masofa $bir_case")
    }
}