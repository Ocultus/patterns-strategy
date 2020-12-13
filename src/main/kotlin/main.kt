fun main() {
    val enc = Encryptor()
    val englishStr = "SeCrEt MessAGE"
    val rusStr = "СеКрЕтНоЕ ПоСлАнИе"
    val englishOutput = enc.caesarCipher(englishStr, 3)
    print("$englishStr-> $englishOutput\n")
    enc.caesarCipher = fun(str: String, key: Int): String {
        return str.map { when (it.toInt()) {
                in 1040..1072 -> ((it.toInt() + key - 'А'.toInt()) % 32 + 'А'.toInt()).toChar()
                in 1072..1103 -> ((it.toInt() + key - 'а'.toInt()) % 32 + 'а'.toInt()).toChar()
                else -> it
            }
        }.joinToString("")
    }
    val rusOutput = enc.caesarCipher(rusStr, 5)
    print("$rusStr-> $rusOutput")
}