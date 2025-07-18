import java.util.Scanner
fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    while (true) {
        println("Tug`ilgan kunizni kiriting:")
        val kun = scanner.nextInt()
        println("Tug`ilgan oyizni kiriting: masalan 2, 3, 8, 11")
        val oy = scanner.nextInt()

        if ((kun >= 20 && oy == 1) || (kun <= 18 && oy == 2)) {
            println("Sizning burjingiz: Qovg`a ")
        } else if (((kun >= 19 && oy == 2) || (kun <= 20 && oy == 3))) {
            println("Sizning burjingiz: Baliq ")
        } else if (((kun >= 21 && oy == 3) || (kun <= 19 && oy == 4))) {
            println("Sizning burjingiz: Qo'y ")
        } else if (((kun >= 20 && oy == 4) || (kun <= 20 && oy == 5))) {
            println("Sizning burjingiz: Buzoq ")
        } else if (((kun >= 21 && oy == 5) || (kun <= 21 && oy == 6))) {
            println("Sizning burjingiz: Egizaklar ")
        } else if (((kun >= 22 && oy == 6) || (kun <= 22 && oy == 7))) {
            println("Sizning burjingiz: Qisqichbaqa ")
        } else if (((kun >= 23 && oy == 7) || (kun <= 22 && oy == 8))) {
            println("Sizning burjingiz: Arslon ")
        }else if (((kun >= 23 && oy == 8) || (kun <= 22 && oy == 9))) {
            println("Sizning burjingiz: Parizod ")
        }else if (((kun >= 23 && oy == 9) || (kun <= 22 && oy == 10))) {
            println("Sizning burjingiz: Tarozi ")
        }else if (((kun >= 23 && oy == 10) || (kun <= 22 && oy == 11))) {
            println("Sizning burjingiz: Chayon ")
        }else if (((kun >= 23 && oy == 11) || (kun <= 21 && oy == 12))) {
            println("Sizning burjingiz: O'qotar ")
        }else if (((kun >= 22 && oy == 12) || (kun <= 19 && oy == 1))) {
            println("Sizning burjingiz: Echki ")
        }else{
            println("Nato'g'ri qiymat kiritdinggiz to`g`ri qiymat kiriting!")
    } }
}