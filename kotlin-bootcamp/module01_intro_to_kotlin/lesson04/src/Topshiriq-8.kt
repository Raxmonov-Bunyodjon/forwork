fun main(args: Array<String>) {

    println("Matn kiriting (kamida 2ta belgi): ")
    var matn = readLine()

    if (!matn.isNullOrEmpty() && matn.length >= 2) {
        val oldingi = matn[matn.length - 2]
        val oxirgi = matn[matn.length - 1]
        val boshQismi = matn.dropLast(2)
        val after = boshQismi + oxirgi + oldingi

        println("Oxiridagi element bilan oxiridan bitta oldigi element almashishidan keyingi holat: $after")

    } else {
        println("Matn kiriting (kamida 2ta): ")
    }
}