import java.util.Scanner

fun main(args: Array<String>) {

    val scanner = Scanner(System.`in`)
    var firstName = scanner.next()
    var lastName = scanner.next()

    var a = getFullName(firstName, lastName)
    println(a)
}

fun getFullName(fname: String, lname: String) = "$fname $lname"

