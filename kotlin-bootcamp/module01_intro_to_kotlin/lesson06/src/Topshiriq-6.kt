import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Bankga qancha pul qoymoqchisiz: ")
    var bosh_pul = scanner.nextInt()
    println("Har oy joylangan summani oshiruvchi foiz kiriting (0<foiz<25):")
    var foiz = scanner.nextInt()
    //necha oy k butun son
    var k = 0
    var bir_oylik_oshish = (bosh_pul / 100) * foiz
    var yakuni_summa = bosh_pul
    do {
        yakuni_summa+=bir_oylik_oshish
        k++

    } while (yakuni_summa < bosh_pul*2)

    println("$k Oyda ko`paygan pul $yakuni_summa ($k-oy oldin qoyilgan pul $bosh_pul")
    println("Dastur tugatildi!")
}

