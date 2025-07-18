import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    println("Yil kirting kiritilgan yilizda necha kun borligini ko'rsataman:")
    var yil = scanner.nextInt()
    val oddiy_yil = 365
    val kabisa_yil = 366

    if (yil % 4 == 0 && yil%100!=0){
        println("Siz kiritgan yil Kabisa yili va $kabisa_yil kundan iborat")
    }else if (yil % 400 == 0){
        println("Siz kiritgan yil Kabisa yili va $kabisa_yil kundan iborat")
    }else {
        println("Siz kiritgan yil Oddiy yil va $oddiy_yil kundan iborat")
    }
}