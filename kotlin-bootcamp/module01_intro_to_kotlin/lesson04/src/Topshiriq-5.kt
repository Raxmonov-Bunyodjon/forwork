fun main(args: Array<String>) {

    println("Matn kiriting (kamida 3ta belgi): ")
    var matn = readLine()

    if (!matn.isNullOrEmpty() && matn.length >= 3) {
        val oxirgi = matn.takeLast(2)
        val qolgan = matn.dropLast(2)
        val yangi_matn = oxirgi + qolgan
            println("Boshiga olingan matn ko`rinishi: $yangi_matn")

    } else {
        println("Matn kiriting (kamida 3ta): ")
    }
}
