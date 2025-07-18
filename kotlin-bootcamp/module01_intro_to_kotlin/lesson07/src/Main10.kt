fun main(args: Array<String>) {

    var a = sum(10,20,30,40)
    println(a)
}

fun sum(vararg numbers: Int): Int{
    var sum = 0
    numbers.forEach {t ->
        sum+=t
    }
    return sum
}