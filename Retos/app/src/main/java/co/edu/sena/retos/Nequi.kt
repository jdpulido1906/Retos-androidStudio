package co.edu.sena.retos

class Nequi(
    val numeroCelular: String = "3212345678",
    val pin: String = "0723"
) {
    private var saldoDisponible: Int = 4500

    fun iniciarSesion() {
        println("Bienvenido a Nequi")
        println("Ingresa tu número de celular:")
        val numeroCelularUsuario = readLine() ?: ""
        println("Ingresa tu clave de 4 dígitos:")
        val pinUsuario = readLine() ?: ""

        if (numeroCelularUsuario == numeroCelular && pinUsuario == pin) {
            println("¡Acceso permitido!")
            mostrarSaldo()
            mostrarOpciones()
        } else {
            println("¡Upps! Parece que tus datos de acceso no son correctos. Tienes tres intentos más.")
            for (i in 1..3) {
                println("Ingresa tu número de celular:")
                val nuevamenteNumero = readLine() ?: ""
                println("Ingresa tu clave de 4 dígitos:")
                val nuevamentePin = readLine() ?: ""

                if (nuevamenteNumero == numeroCelular && nuevamentePin == pin) {
                    println("¡Bienvenido al sistema!")
                    mostrarSaldo()
                    mostrarOpciones()
                    return
                } else {
                    println("¡Upps! Parece que tus datos de acceso no son correctos. Tienes ${3 - i} intentos más.")
                }
            }
            println("Has excedido el número máximo de intentos. Hasta luego.")
        }
    }

    private fun mostrarSaldo() {
        println("Saldo disponible: $saldoDisponible")
    }

    fun mostrarOpciones() {
        var continuar = true

        while (continuar) {
            println("\nElige una opción:")
            println("1. Sacar")
            println("2. Enviar")
            println("3. Recargar")
            println("4. Salir")
            val opcion = readLine()?.toInt()

            when (opcion) {
                1 -> sacar()
                2 -> enviar()
                3 -> recargar()
                4 -> {
                    println("Gracias por usar Nequi.")
                    continuar = false
                }
                else -> println("Opción inválida. Inténtalo de nuevo.")
            }
        }
    }

    fun sacar() {
        println("Elige una opción:")
        println("1. Cajero")
        println("2. Punto físico")
        val opcion = readLine()?.toInt()

        if (opcion == 1 || opcion == 2) {
            if (saldoDisponible < 2000) {
                println("No te alcanza para hacer el retiro.")
            } else {
                println("Ingresa el valor que deseas retirar:")
                val valorRetiro = readLine()?.toInt()

                if (valorRetiro != null && valorRetiro in 1..saldoDisponible) {
                    saldoDisponible -= valorRetiro
                    val codigoRetiro = (100000..999999).random()
                    println("Retiro exitoso este es tu Código de retiro: $codigoRetiro")
                    mostrarSaldo()
                } else {
                    println("Valor inválido. Inténtalo de nuevo.")
                }
            }
        } else {
            println("Opción inválida. Inténtalo de nuevo.")
        }
    }

    fun enviar() {
        println("Ingresa el número de teléfono al que deseas enviar dinero:")
        val numeroDestino = readLine()
        println("Ingresa el valor que deseas enviar:")
        val valorEnvio = readLine()?.toInt()

        if (valorEnvio != null && valorEnvio <= saldoDisponible && valorEnvio > 0) {
            saldoDisponible -= valorEnvio
            println("Envío exitoso. Has enviado $valorEnvio a $numeroDestino.")
            mostrarSaldo()
        } else {
            println("Valor inválido o saldo insuficiente. Inténtalo de nuevo.")
        }
    }


   fun recargar() {
       print("cuanto  desea  recargar:")
        val valorRecarga = readLine()?.toInt()

        if (valorRecarga != null) {

            println("Vas a recargar: $valorRecarga")
            println("¿Estás seguro que deseas realizar la recarga? Sí o No")
            val confirmacion = readLine()

            if (confirmacion == "si") {
                saldoDisponible += valorRecarga
                println("Recarga exitosa. Has recargado $valorRecarga.")
                mostrarSaldo()
            } else {
                println("Recarga cancelada.")
            }
        } else {
            println("Valor inválido. Inténtalo de nuevo.")
        }
    }

}

fun main() {
    val nequi = Nequi()
    nequi.iniciarSesion()
}
