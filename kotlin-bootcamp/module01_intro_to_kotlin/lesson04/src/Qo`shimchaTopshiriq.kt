import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {
    var scanner = Scanner(System.`in`)
    try {
        while (true){
        println("Uchburchakning birinchi tomonini kiriting: ")
        var a_tomon = scanner.nextDouble()
        println("Uchburchakning ikkinchi tomonini kiriting: ")
        var b_tomon = scanner.nextDouble()
        println("Uchburchakning uchinchi tomonini kiriting: ")
        var c_tomon = scanner.nextDouble()
        if ((a_tomon>0 && b_tomon>0 && c_tomon>0)&&(a_tomon+b_tomon>c_tomon && a_tomon+c_tomon>b_tomon && b_tomon+c_tomon>a_tomon)){
            println("Uchburchak tomonlar tekshirildi uchburchak bo`lish shartidan o`tildi")}else {
            println("Bu uchburchak emas!")
            continue

        }
            if (a_tomon!=b_tomon && a_tomon!=c_tomon && b_tomon!=c_tomon){
                println("Bu uchburchak turi turli tomonli")
        } else if (a_tomon==b_tomon && c_tomon==b_tomon && a_tomon==c_tomon){
                println("Bu uchburchak turi teng tomonli uchburchak")
        }else if ((a_tomon==b_tomon && a_tomon+b_tomon>c_tomon)|| (a_tomon==c_tomon && a_tomon+c_tomon>b_tomon)|| (b_tomon==c_tomon && b_tomon+c_tomon>a_tomon)){
                println("Bu uchburchak turi teng yonli uchburchak")
        } }
    }  catch (e: Exception) {
        println("Iltimos, faqat musbat son kiriting!")
    }
}




