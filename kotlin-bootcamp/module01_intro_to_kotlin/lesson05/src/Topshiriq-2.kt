import java.util.Scanner

fun main(args: Array<String>) {
    println("OX va OY koordinata o'qlarida yotmaydigan nuqta berilgan.\nNuqta joylashgan koordinata choragi aniqlansin.")
    val scanner = Scanner(System.`in`)
    println("OX qiymatni kiriting")
    var ox = scanner.nextDouble()
    println("OY qiymatni kiriting")
    var oy = scanner.nextDouble()

    if (ox > 0 && oy > 0) {
        println("OX va OY Koordinatalari I-chorakda joylashgan: Qandaydir nuqta>> (${ox.toInt()},${oy.toInt()})")
    } else if (ox < 0 && oy > 0) {
        println("OX va OY Koordinatalari II-chorakda joylashgan: Qandaydir nuqta>>  (${ox.toInt()},${oy.toInt()})")
    }else if (ox < 0 && oy < 0) {
        println("OX va OY Koordinatalari III-chorakda joylashgan: Qandaydir nuqta>>  (${ox.toInt()},${oy.toInt()})")
    }else if (ox > 0 && oy < 0) {
        println("OX va OY Koordinatalari IV-chorakda joylashgan: Qandaydir nuqta>>  (${ox.toInt()},${oy.toInt()})")
    }else {
        println("Nol qiymat kiritib bo`lmaydi!\nQayta urinib ko`ring bro")
    }
}