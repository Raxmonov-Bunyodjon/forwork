fun main(args: Array<String>) {

    first@ for (i in 'A'..'D') {
        for (j in 1..5) {

            if (j == 2 || j == 4) {
                continue@first
            }
            println("$i -> $j")
        }
    }
}