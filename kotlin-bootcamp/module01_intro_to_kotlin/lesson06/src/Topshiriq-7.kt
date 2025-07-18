import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    println("Son kiriting (Fibonachchi ketma-ketligida bormi yo‘qmi tekshiramiz): (son>1)")
    var sonN = scanner.nextInt()

    var a = 0
    var b = 1
    var fib = 0

    var topildi = false

    while (fib <= sonN) {
        if (fib == sonN) {
            topildi = true
            break
        }
        fib = a + b
        a = b
        b = fib
    }

    if (topildi) {
        println("✅ $sonN — bu Fibonachchi ketma-ketligidagi son.")
    } else {
        println("❌ $sonN — bu Fibonachchi sonlari ichida yo‘q.")
    }
}