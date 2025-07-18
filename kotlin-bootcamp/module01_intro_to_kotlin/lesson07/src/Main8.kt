fun main(args: Array<String>) {

    foo(5, '&')
}

fun foo(length:Int = 15, character:Char = '=') {
    for  (i in 1..length){
        println(character)
    }
}
