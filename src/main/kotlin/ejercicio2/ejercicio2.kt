package ejercicio2

class Str{
    fun revert(palabra:String):String{
        return palabra.reversed()
    }
    fun isPalindrome(palabra:String):Boolean{
        return palabra == palabra.reversed()
    }
    fun vowels(palabra:String):Int{
        val vowels: String = "aeiouAEIOUáéíóúÁÉÍÓÚ"
        return palabra.count {char -> vowels.contains(char) }
    }
    fun words(palabra:String):Int{
        return 1+ palabra.count {char -> char.isWhitespace() }
    }
}

fun main(args: Array<String>) {
    val str = Str()
    println(str.revert("hola"))
    println(str.isPalindrome("hola"))
    println(str.isPalindrome("neuquen"))
    println(str.vowels("neuquen"))
    println(str.vowels("Ácido clorhídrico"))
    println(str.words("construcción de interfaces de usuario"))

}