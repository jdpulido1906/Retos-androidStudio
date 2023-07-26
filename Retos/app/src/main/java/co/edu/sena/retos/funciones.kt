package co.edu.sena.retos

fun main() {

    /* val temperature = 20
    var isHot= if(temperature > 40 ) true else false
        println(isHot)*/

    /*  println("Ingrese su edad:")
    val edad: Int = readLine()!!.toInt()

    val edad2= if(edad>=18) true else false

    println(edad2)

    if (edad<18){
        println("Palacasa")
    } else
    {
        println("Bienvenido")
    }
*/

    /* fun printhello(){
        println("hello world")
    }

    printhello()*/ // Llamar la función


    println("BIENVENIDO A CHAMBEAR :D")
    println("Si desea ingresar a nuestro sistema oprima 1")
    var ap: Int = readLine()!!.toInt()

    while (ap == 1) {
        println(
            "Elige la opción que deseas: \n 1. Calcular area de un circulo \n" +
                    " 2. Calcular perimetro del circulo \n" +
                    "3. Calcular area del triangulo \n" +
                    "4. Calcular perimetro  del triángulo \n" +
                    "5. Calcular area  del rectangulo \n" +
                    "6. Calcular perimetro  del rectangulo \n" +
                    "7. Salir"
        )

        val opcion: Int = readLine()!!.toInt()

        when (opcion) {
            1 -> {
                fun area() {
                    println("Ingrese si el radio del circulo.")
                    val radio: Int = readLine()!!.toInt()
                    val fin = 3.1416 * radio * radio
                    println(fin)
                }
                area()
            }

            2 -> {
                fun perimetro() {
                    println("Ingrese si el diametro del circulo.")
                    val diametro: Int = readLine()!!.toInt()

                    val fin = 3.1416 * diametro
                    println(fin)
                }
                perimetro()
            }

            3 -> {

                fun area(base: Double, altura: Double): Double {
                    return base * altura / 2
                }

                println("Ingrese el área del triángulo.")
                val base: Double = readLine()!!.toDouble()

                println("Ingrese la altura del triángulo.")
                val altura: Double = readLine()!!.toDouble()

                val area = area(base, altura)

                println("El área del triángulo es $area")

            }


            4 -> {
                fun perimetro(lado1: Double, lado2: Double, lado3: Double): Double {
                    return lado1 + lado2 + lado3
                }
                println("Ingrese el primer lado del triángulo .")
                val lado1: Double = readLine()!!.toDouble()

                println("Ingrese el segundo lado  del triángulo .")
                val lado2: Double = readLine()!!.toDouble()

                println("Ingrese el tercer lado del triángulo .")
                val lado3: Double = readLine()!!.toDouble()

                val perimetro2 = perimetro(lado1, lado2, lado3)

                println("El perimetro  del triángulo es: $perimetro2")


            }

            5 -> {
                fun rectangulo(largo: Double, ancho: Double): Double {
                    return largo * ancho
                }
                println("Ingrese el largo del rectangulo.")
                val largo: Double = readLine()!!.toDouble()

                println("Ingrese el ancho del rectangulo.")
                val ancho: Double = readLine()!!.toDouble()

                val area = rectangulo(largo, ancho)

                println("El area del rectangulo es: $area")


            }




            6 -> {
                fun rectangulo(longitud: Double, ancho: Double): Double {
                    return 2 * longitud + 2 * ancho
                }
                println("Ingrese la longitud del rectangulo.")
                val longitud: Double = readLine()!!.toDouble()

                println("Ingrese el ancho del rectangulo.")
                val ancho: Double = readLine()!!.toDouble()

                val perimetro = rectangulo(longitud, ancho)

                println("El perimetro del rectangulo es: $perimetro")
            }

            7 -> {
                println("Gracias por usar la chamba :D")
                ap = 0
            }
        }
    }
}