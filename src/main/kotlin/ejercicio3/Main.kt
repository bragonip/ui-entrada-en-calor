package ejercicio3

import java.time.LocalDate

fun main(args: Array<String>) {
    var user = Usuario("Pablo Bragoni","bragonip","pablo.bragoni@gmail.com",LocalDate.of(1989,7,2))
    println(user.edad())
}