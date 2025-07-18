import java.util.Scanner
fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    while (true) {
        println("Oy raqamini kiriting (1-12), chiqish uchun 0 ni bosing:")
        val son = scanner.nextInt()
        if (son==0){
            println("Dastur yakunlash.")
            break
        }

        when (son) {
            1 -> println("Yanvar oyi-31kun")
            2 -> println("Fevral oyi-28kun")
            3 -> println("Mart oyi-31kun")
            4 -> println("Aprel oyi-30kun")
            5 -> println("May oyi-31kun")
            6 -> println("Iyun oyi-30kun")
            7 -> println("Iyul oyi-31kun")
            8 -> println("Avgust oyi-31kun")
            9 -> println("Sentabr oyi-30kun")
            10 -> println("Oktabr oyi-31kun")
            11 -> println("Noyabr oyi-30kun")
            12 -> println("Dekabr oyi-31kun")
            else -> println("Noto‘g‘ri qiymat! Faqat 1 dan 12 gacha bo‘lgan sonni kiriting.")
        }
    }
}
