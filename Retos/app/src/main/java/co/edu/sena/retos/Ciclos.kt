package co.edu.sena.retos

class Ciclos {
}
fun main() {
    /*for (i in 1..5) print(i)
    println()

    for (i in 5 downTo 1) print(i)
    println()

    for (i in 1..5 step 2) print(i)
    */
    // Pedir 6 numeros a un usuario y decirle si el numero es par o impar
    /*var pa: Int =0
    var imp:Int=0
    var sumaImpares:Int =0
    var sumapares:Int =0
    for (i in 1..6) {

        var num1: Int = readLine()!!.toInt()
        println("INGRESE UN NÚMERO")

        if (num1 % 2 == 0) {

            println("el numero que ingreso es par")
            pa += 1
            sumapares=sumapares+num1
        } else {

            println("el numero que ingreso es impar")
            imp +=1
            sumaImpares=sumaImpares+num1
        }
        println("los numeros pares ingresados han sido $i y suman $sumapares")
        println("los numeros  impares ingresados han sido $imp y suman $sumaImpares ")
       */

    //for (i in 'a'..'f') println(i



//CICLO WHILE
    /* var j:Int=0
    var imp: Int =0
    var sumaImpares:Int =0
    var sumapares:Int =0
    var c="si"

    while(c =="si") {
        println("INGRESE UN NÚMERO")
        var num1: Int = readLine()!!.toInt()


        if (num1 % 2 == 0) {

            println("el numero que ingreso es par")
           j +=1
            sumapares=sumapares+num1
        } else {

            println("el numero que ingreso es impar")
            imp +=1
            sumaImpares=sumaImpares+num1
        }
        println("Desea Ingresar Otro Numero?")
        c= readLine()!!.toString()

    }
    println("los numeros pares ingresados han sido $j y suman $sumapares")
    println("los numeros  impares ingresados han sido $imp y suman $sumaImpares ")
    }*/




//CICLOS DO WHILE
    var j: Int = 0
    var imp: Int = 0
    var sumaImpares: Int = 0
    var sumapares: Int = 0
    var c: String = "si"

    do {
        println("INGRESE UN NÚMERO")
        var num1: Int = readLine()!!.toInt()

        if (num1 % 2 == 0) {
            println("el numero que ingreso es par")
            j += 1
            sumapares = sumapares + num1
        } else {
            println("el numero que ingreso es impar")
            imp += 1
            sumaImpares = sumaImpares + num1
        }

        println("Desea Ingresar Otro Numero?")
        c = readLine()!!.toString()

    } while (c == "si")

    println("los numeros pares ingresados han sido $j y suman $sumapares")
    println("los numeros  impares ingresados han sido $imp y suman $sumaImpares")
}



