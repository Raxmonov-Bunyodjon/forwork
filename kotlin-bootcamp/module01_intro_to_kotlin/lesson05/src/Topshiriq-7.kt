import java.util.Scanner

fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)
        while (true) {
            println("Sonlarni kiriting (100-999), chiqish uchun 0 ni bosing:")
            val son = scanner.nextInt()
            val birliklar = arrayOf("", "bir", "ikki", "uch", "to‘rt", "besh", "olti", "yetti", "sakkiz", "to‘qqiz")
            val onliklar = arrayOf("", "o‘n", "yigirma", "o‘ttiz", "qirq", "ellik", "oltmish", "yetmish", "sakson", "to‘qson")

            if (son==0){
                println("Dastur yakunlash.")
                break
            }

            if (son in 100..999) {
                val yuz = son / 100
                val on = (son / 10) % 10
                val bir = son % 10

                val natija = "${birliklar[yuz]} yuz ${onliklar[on]} ${birliklar[bir]}"
                println(natija.trim())
            } else {
                println("Faqat 100 dan 999 gacha bo‘lgan son kiriting.")
            }
            }
}