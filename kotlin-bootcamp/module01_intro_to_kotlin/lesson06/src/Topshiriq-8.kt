import java.util.Scanner
fun main(args: Array<String>) {

//    A, B, C musbat butun sonlar berilgan. AxB to'rtburchak ichida tomoni C bo'lgan
//    kvadratdan nechtasi sig'ishini aniqlovchi programma tuzilsin. Ko'paytirish va bo'lish
//    amallarini ishlatmang.
    val scanner = Scanner(System.`in`)
    println("To`rtburchakning A tomonini kiriting:")
    var A = scanner.nextInt()
    println("To`rtburchakning B tomonini kiriting:")
    var B = scanner.nextInt()
    println("Kvadratning C tomonini kiriting::")
    var C = scanner.nextInt()

    var A_tomon_boyicha = 0
    var B_tomon_boyicha = 0

    var tempA = A
    while (tempA >= C) {
        A_tomon_boyicha++
        tempA -= C
    }

    var tempB = B
    while (tempB >= C) {
        B_tomon_boyicha++
        tempB -= C
    }

    var jami_kvadrat = 0
    var i = 0
    while (i < A_tomon_boyicha) {
        var j = 0
        while (j < B_tomon_boyicha) {
            jami_kvadrat++
            j++
        }
        i++
    }

    println("To‘rtburchakka sig‘adigan kvadratlar soni: $jami_kvadrat")
}
