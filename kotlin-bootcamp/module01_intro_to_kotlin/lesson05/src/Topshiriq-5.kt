import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    while(true){
        println("Hafta kunlarini chiqaruchi dastur 1-7 gacha bo`lgan son kiriting:")
        val son = scanner.nextInt()

        when (son){
            1->println("Dushanba")
            2->println("Seshanba")
            3->println("Chorshanba")
            4->println("Payshanba")
            5->println("Juma")
            6->println("Shanba")
            7->println("Yakshanba")
            else -> println("Manfiy son va nol kiritmang! 1<=son<=7 shu oraliqdagi sonni kiriting iltimos!")
        }}
    }