fun main(args: Array<String>) {

    println("Boshlang'ich 2ta avtomabilni orasidagi masofani kiriting kmda:")
    var input_bosh_masofa = readLine()?.toIntOrNull()
    println("Birinchi avtomabilni tezligini kiriting km/soatda:")
    var input_avto1 = readLine()?.toIntOrNull()
    println("Ikkinchi avtomabilni tezligini kiriting km/soatda:")
    var input_avto2 = readLine()?.toIntOrNull()
    println("Uzoqlashishga ketgan malum bir vaqtni kiritinga soatda:")
    var input_vaqt = readLine()?.toIntOrNull()

    if (input_bosh_masofa != null && input_avto1 != null && input_avto2 != null && input_vaqt != null) {
        val oxirgi_orasidagi_masofa = input_bosh_masofa + (input_avto1 + input_avto2) * input_vaqt
        println("Ular orasidagi oxirgi masofa: $oxirgi_orasidagi_masofa km")
    } else {
        println("Iltimos, faqat son kiriting (butun raqamlar).")
    }

}