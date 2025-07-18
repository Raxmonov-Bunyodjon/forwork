fun main(args: Array<String>) {
//    val array = arrayOf<String>(
//    "Jalol", //0
//    "Usmon", //1
//    "Doston", //2
//    )
//    array[0] = "Abdulloh"
//    val array = intArrayOf(1,2,3,3,4,5,5,6,7,-2,-3,-2,-5,-8)
//    val count = array.count()
//    val max = array.maxOrNull()
//    val min = array.minOrNull()
//    val sum = array.sum()
//    println("Arrayni elementlari adadi: $count ta")
//    println("Max number of the array: $max ta")
//    println("Min number of the array: $min ta")
//    println("Sum of the array: $sum ta")
//    val array = intArrayOf(1,2,3,3,4,5,5,6,7,-2,-3,-2,-5,-8)
//    array.sort()
//    for (item in array){
//        println(item)
//    }

//    val array = IntArray(10) { it + 1 }
//
//    println(array.first())
//    println(array.last())
//    println(array.lastIndex)
//    println(array.indexOf(5))

    var jurnal = arrayOf<String>("Ali", "Usmon", "Umar", "Abdulloh", "Usmon")
    jurnal = jurnal + "Abdulaziz"
    jurnal.sortDescending()
    for (name in jurnal){
        println(name)
    }

}