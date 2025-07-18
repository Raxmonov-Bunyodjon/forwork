import kotlin.math.sqrt
fun main(args: Array<String>) {
    println("Doirani yuzini kiriting:")
    var input = readLine()?.toDoubleOrNull()

    if (input != null && input>0) {
        var pi = 3.14
        var radius = sqrt(input/pi)
        var radiusKesilgan = (radius*100).toInt()/100.0
        var diametr = (radiusKesilgan * 2 * 100).toInt()/100.0

        println("Radius: $radiusKesilgan")
        println("Diametr: $diametr")
    } else {
        println("Noto'g'ri  qiymat kiritildi.")
    }
}