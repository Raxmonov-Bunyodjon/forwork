fun main(args: Array<String>) {

    println("Matn kiriting (kamida 2ta belgi): ")
    var matn = readLine()

    if (!matn.isNullOrEmpty() && matn.length >= 2) {
        val oxirgi = matn.takeLast(2)
        repeat(3) {
            println("Oxirgi belgi: $oxirgi")
        }
    } else {
        println("Matn kiriting (kamida 2ta): ")
    }
}
