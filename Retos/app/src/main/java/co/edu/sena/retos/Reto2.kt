fun main() {
    val compra = 60000
    var op: String

    do {
        val bolita = (1..4).random()
        println("Bolita obtenida: $bolita")

        when (bolita) {
            1 -> {
                val descuento = compra * 0.1
                val totalAPagar = compra - descuento
                println("¡Has ganado un 10% de descuento!")
                println("Descuento: $descuento")
                println("Total a pagar: $totalAPagar")
            }
            2 -> {
                val descuento = compra * 0.3
                val totalAPagar = compra - descuento
                println("¡Has ganado un 30% de descuento!")
                println("Descuento: $descuento")
                println("Total a pagar: $totalAPagar")
            }
            3 -> {
                val descuento = compra * 0.5
                val totalAPagar = compra - descuento
                println("¡Has ganado un 50% de descuento!")
                println("Descuento: $descuento")
                println("Total a pagar: $totalAPagar")
            }
            4 -> {
                println("¡Felicidades! Has ganado tu compra gratis.")
                println("Total a pagar: $0")
            }
            else -> println("No has obtenido ningún descuento en esta ocasión. Inténtalo de nuevo.")
        }

        println("Desea volver a jugar? (si/no): ")
        op = readLine()!!.toString()
    } while (op == "si")
}
