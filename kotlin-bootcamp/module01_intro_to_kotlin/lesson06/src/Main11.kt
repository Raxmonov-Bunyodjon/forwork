fun main(args: Array<String>) {

    for (i in 1..10) {
        println("Oldin $i")
        if (i == 5) {
            continue
        }
        println("Keyin $i")
    }
}