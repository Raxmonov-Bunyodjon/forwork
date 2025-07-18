fun main(args: Array<String>) {

    first@for (i in 1..10){
        for (j in 1..10){
            if (j == 5){
                break@first
            }
            println("$i -> $j")
        }
    }
}