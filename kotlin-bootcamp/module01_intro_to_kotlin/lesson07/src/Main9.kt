fun main(args: Array<String>) {


    myprint(b = 5, a = 6)
}

fun myprint(a: Int = 10, b: Int = 10) {
    println(a * b)
}