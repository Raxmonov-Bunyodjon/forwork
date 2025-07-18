fun main(args: Array<String>) {

    println("Matn kiriting (kamida 2ta belgi): ")
    var matn = readLine()

    if (!matn.isNullOrEmpty() && matn.length >= 2) {
        val start = (matn.length - 2)/2
        val natija = matn.substring(start, start + 2)

        println("O'rtadagi 2ta begi: $natija")

    } else {
        println("Matn kiriting (kamida 2ta): ")
    }
}