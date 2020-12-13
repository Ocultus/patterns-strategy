class Encryptor {
    var caesarCipher = fun (str: String, key : Int): String {
        return str.map {
            when(it.toInt()){
                in 65..91 -> ((it.toInt() + key - 65) % 26 + 65).toChar()
                in 97..123 -> ((it.toInt() + key - 97) % 26 + 97).toChar()
                else -> it
            }
        }.joinToString("")
    }
}