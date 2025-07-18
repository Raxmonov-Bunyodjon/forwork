fun main(args: Array<String>) {

    println("Kun boshidan o`tilgan sekun yozing kattaroq: ")
    var sekund = readLine()?.toIntOrNull()
    if (sekund != null) {
        var soat = (sekund/60)/60
        var minut = sekund%60
        var sekund = sekund%60

        println("Soati: $soat Minut: $minut Sekund: $sekund ")

    }

}