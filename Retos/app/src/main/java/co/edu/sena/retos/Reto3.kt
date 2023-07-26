package co.edu.sena.retos

class Reto3 {
}
fun main() {
    var op: String = "si"
    var carros: MutableList<String> = mutableListOf()

    do {
        println("Bienvenido")
        println("\n 1.Insertar nuevos autos\n 2.Mostrar Todos los datos de la lista\n 3.Buscar Un Carro en particular\n 4.Modificar un vehiculo Existente\n 5.Eliminar Un Vehiculo Existente\n 6.Salir")
        print("inserte la opcion:")
        val opcion: Int = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                println("Insertar nuevos autos")
                val nuevoCarro = readLine()!!.toString()
                carros.add(nuevoCarro)
            }
            2 -> {
                println("Mostrar Todos los datos de la lista")
                println(carros)
            }
            3 -> {
                println("Buscar Un Carro en particular")
                val carroABuscar = readLine()!!.toString()
                if (carros.contains(carroABuscar)) {
                    println("El carro $carroABuscar está en la lista.")
                } else {
                    println("El carro $carroABuscar no se encuentra en la lista.")
                }
            }
            4 -> {
                println("Modificar un vehiculo Existente")
                val indice = readLine()!!.toInt()
                if (indice >= 0 && indice < carros.size) {
                    println("Ingrese el nuevo nombre para el carro:")
                    val nuevoNombre = readLine()!!.toString()
                    carros[indice] = nuevoNombre
                } else {
                    println("Índice inválido.")
                }
            }
            5 -> {
                println("Eliminar Un Vehiculo Existente")
                val indice = readLine()!!.toInt()
                if (indice >= 0 && indice < carros.size)
                {
                    carros.removeAt(indice)
                    println("Carro eliminado.")
                } else {
                    println("Índice inválido.")
                }
            }
            6 -> {
                println("Saliendo del programa.")
                op = "no"
            }
            else -> println("Opcion Invalida Vuelva a escoger la Opcion")
        }

    } while (op == "si")
}
