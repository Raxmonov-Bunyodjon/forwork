import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Son kiriting 1<son<=999 oraliqdagi:")
    var son = scanner.nextInt()

    if (son < 10 && son % 2 == 0 && son>1){
        println("Kiritilgan son bir xonali juft son: $son")
    }else if (son < 10 && son % 2 != 0 && son>1){
        println("Kiritilgan son bir xonali toq son: $son")
    }else if (son >= 10 && son % 2 == 0 && son<100){
        println("Kiritilgan son ikki xonali juft son: $son")
    }else if (son >= 10 && son % 2 != 0 && son<100){
        println("Kiritilgan son ikki xonali toq son: $son")
    }else if (son >= 100 && son % 2 == 0 && son<1000){
        println("Kiritilgan son uch xonali juft son: $son")
    }else if (son >= 100 && son % 2 != 0 && son<1000) {
        println("Kiritilgan son uch xonali toq son: $son")
    }else {
        println("Manfiy son kiritmang va bir sonini bir toq ham emas juft ham emas son!")
    }
}