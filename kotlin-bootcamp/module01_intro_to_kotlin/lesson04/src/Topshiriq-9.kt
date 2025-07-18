fun main(args: Array<String>) {

    println("Matn kiriting (kamida 2ta belgi): ")
    var matn = readLine()
    println("Matnni kiritilgan indexdan boshlab qirqib olish uchun son kiriting (Manfiy qiymat kiritmang!): ")
    var index_number = readLine()!!.toInt()

    if (!matn.isNullOrEmpty() && matn.length >= 2 && index_number >= 0 && matn.length > index_number) {
        val qoldiq_matn = matn.drop(index_number)
        println("Berilgan indexdan boshlab yoziladigan matn  $qoldiq_matn")

    }
    else {
        println("Matn indexdan kamroq ko`proq matn kiriting manfiy index qabul qilinmaydi: (kamida 2ta): ")
    }
}