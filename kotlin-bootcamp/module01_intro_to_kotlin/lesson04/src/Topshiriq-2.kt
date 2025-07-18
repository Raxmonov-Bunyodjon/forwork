import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main(args: Array<String>) {

    var scanner = Scanner(System.`in`)
   try {
       println("To'g'ri burchakli uchburchaknig birinchi katetini kiriting: ")
       var a_katet = scanner.nextDouble()
       println("To'g'ri burchakli uchburchaknig ikkinchi katetini kiriting: ")
       var b_katet = scanner.nextDouble()
       var c_gipotenuza = sqrt((a_katet.pow(2.0) + b_katet.pow(2.0)))

       println("To'g'ri burchakli uchburchakning gipotenuzasi: $c_gipotenuza")

   }  catch (e: Exception) {
       println("Iltimos, faqat musbat son kiriting!")
   }
}