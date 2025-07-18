fun main(args: Array<String>) {

    println("Uch xonali sonni kiriting: ")
    var son = readLine()?.toIntOrNull()
    if (son != null && son > 100) {
        var yuzlik = son / 100
        var birlik = son % 10

        var yangiSon = (yuzlik * 100) + (birlik * 10) + (birlik-1)
        println("Yangi son: $yangiSon")
    } else {
        println("Noto'g'ri  qiymat kiritildi.")
    }
}