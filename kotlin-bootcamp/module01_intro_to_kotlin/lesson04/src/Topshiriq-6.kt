fun main(args: Array<String>) {

    println("Matn kiriting (kamida 3ta belgi): ")
    var matn = readLine()

    if (!matn.isNullOrEmpty() && matn.length >= 3) {
        val oxirgi_boshi_olingan = matn.dropLast(1).drop(1)
        println("Boshidagi va oxiridagi bitta elementni olingan matn ko`rinishi: $oxirgi_boshi_olingan")

    } else {
        println("Matn kiriting (kamida 3ta): ")
    }
}
