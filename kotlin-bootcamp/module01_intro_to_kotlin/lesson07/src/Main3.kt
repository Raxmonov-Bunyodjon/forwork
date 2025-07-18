import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    var son1 = scanner.nextInt()
    var son2 = scanner.nextInt()
    addNumbers(son1,son2)
}

fun addNumbers(a:Int, b: Int){
    println(a+b)
}