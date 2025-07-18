fun main(args: Array<String>) {

    //5! = 1*2*3*4*5 = 120
//    var a = 1
//    for (i in 1..5) {
//        a *= i
//    }
//    println(a)
    println(fact(5))
    println(fact2(5))
}

fun fact(n: Int): Int = if (n==1) n else n*fact(n-1)

tailrec fun fact2(n: Int, run: Int=1): Int = if (n==1) run else fact2(n-1, run*n)
