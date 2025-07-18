fun main(args: Array<String>) {

    var a = arrayOf("Kotlin", "Java", "Python", "JS")

    for ((index, value ) in a.withIndex()){
        println(index)
        println(value)

    }
}