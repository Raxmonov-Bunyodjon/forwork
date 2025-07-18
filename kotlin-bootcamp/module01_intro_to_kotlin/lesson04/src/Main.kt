import kotlin.math.E
import kotlin.math.PI
import kotlin.math.abs
import kotlin.math.ceil
import kotlin.math.floor
import kotlin.math.ln
import kotlin.math.max
import kotlin.math.min
import kotlin.math.nextDown
import kotlin.math.nextTowards
import kotlin.math.nextUp
import kotlin.math.pow
import kotlin.math.round
import kotlin.math.sign
import kotlin.math.sin

fun main(args: Array<String>) {

    println(E)
    println(PI)
    println(sign(5.5))
    println(sign(-5.8))
    //            |-5| = 5    |5| = 5
    println(abs(-6.6))
    println(sin(PI / 6))

    println(ceil(6.1))
    println(floor(9.6))
    println(ln(E))
    println(max(6,7))
    println(min(7, 4))
    println(8.1.nextDown())
    println(8.1.nextUp())
    println(8.1.nextTowards(7.0))

    println(2.0.pow(10.0))

    var a = 2.0
    var b = 5.0
    println(a.pow(b))
    println(round(5.7))
    println(round(5.4))
}