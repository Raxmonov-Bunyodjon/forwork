//fun main(args: Array<String>) {
//
//    val sonlar = arrayOf(1,2,3,4,5)
//    println(sonlar[0]) //1
//    println("Uzunligi: ${sonlar.size}") //5
//
//}
//fun main(args: Array<String>) {
//    //5 ta sonli massiv yarat va ularning o‘rtacha qiymatini hisobla.
//    val sonlar = Array(5) {0}
//    println("Iltimos, 5ta butun son kiriting:")
//
//    for (i in 0 until 5) {
//        print("${i+1}-sonni kiriting: ")
//        val son = readLine()?.toIntOrNull()
//        if (son != null) {
//            sonlar[i] = son
//        } else {
//            println("Notog`ri qiymat, 0 qo`shildi.")
//            sonlar[i]=0
//        }
//    }
//    val summa = sonlar.sum()
//    val ortacha = summa.toDouble() / sonlar.size
//
//    println("\nKiritilgan massiv: ${sonlar.joinToString()}")
//    println("Yig'indisi: $summa")
//    println("O'rtacha qiymati: $ortacha")
//}
fun main(args: kotlin.Array<String>) {
    //Foydalanuvchidan 5 ta ism olib massivga saqla va ekranga chiqar.
    val ismlar = Array(5) {""}
    println("Iltimos, 5ta ism kiriting:")

    for (i in 0 until 5) {
        print("${i+1}-Ism kiriting: ")
        val ism = readLine()
        if (ism != null ) {
            ismlar[i] = ism
        } else {
            println("Notog`ri qiymat, bo`sh qoldiriladi.")
        }
    }
    println("\nKiritilgan ismlar:")
    for (ism in ismlar) {
        println(ism)
    }


}