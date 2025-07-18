import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Berilgan matnni kiriting: ")
    var shablon = scanner.next().lowercase()
    println("Berilgan matn $shablon qaysi harflar yoki belgilar istalgancha qiymat qabul qilsin: ")
    var joker = scanner.next().lowercase()
    println("Quydagi $shablon matnni nechtaligini topish uchun katttaroq matn kiriting\nhamma qiymatlarni qabul qiluvchi belgi yoki harflar $joker : ")
    var matn = scanner.next().lowercase()

    var sanash = 0

    //shablon uzunligicha qadam tashab aylanamiz
    for (i in 0..matn.length - shablon.length) {
        val kichik_bÒlak = matn.substring(i, i+shablon.length)

        var mos = true

        for (j in shablon.indices) {
            //agar shablondagi harf joker (masalan istalgan belgi), bu joyda har qanday harf bo'lishi mumkin
            if (shablon[j] != joker[0] && shablon[j] != kichik_bÒlak[j]){
                mos = false
                break
            }
        }
        if (mos) sanash++
    }

    println("Topilgan mos keluvchi bo`laklar soni: $sanash")
}



