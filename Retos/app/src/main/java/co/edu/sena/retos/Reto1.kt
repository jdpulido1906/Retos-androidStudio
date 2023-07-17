package co.edu.sena.retos

class Reto1 {
}
fun main() {
    val dado1 = (1..6).random()
    val dado2 = (1..6).random()
    val Total = dado1 + dado2

    println("Resultado del primer dado: $dado1")
    println("Resultado del segundo dado: $dado2")

    when (Total) {
        2 -> println("Ganaste: Un par de unos en los dados!")
        3 -> println("Ganaste: Un total de tres en los dados!")
        7 -> println("Ganaste: Un total de siete en los dados!")
        11 -> println("Ganaste: Un total de once en los dados!")
        12 -> println("Ganaste: Dos en los dados!")
        else -> println("Perdiste. Inténtalo de nuevo.")
    }
}
