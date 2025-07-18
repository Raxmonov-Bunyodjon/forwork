fun main(args: Array<String>) {

    println("Burcha gradusni kiriting (0<burchak<360):")
    var input_burchak = readLine()?.toIntOrNull()

    if (input_burchak != null) {
        var pi = 3.14
        var radian = input_burchak*(pi/180)
        var natija = (radian*100).toInt()/100.0
        println("Radian: $natija")
    }
    else {
        println("Noto'g'ri  qiymat kiritildi.")
    }
}