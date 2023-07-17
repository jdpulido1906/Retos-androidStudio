package com.SantiagoBurgos05.my_mobil_app

class Condicionales {
}
fun main(){
   /* println("Ingrese el primer numero")
    var num1: Int= readLine()!!.toInt()
    println("Ingrese el primer numero")
    var num2: Int= readLine()!!.toInt()

    if (num1 > num2){
        println("$num1 es mayor a $num2")

    }else if(num1==num2){
        println("$num1 y $num2 son iguales")

    }else{
        println("$num1 es menor a $num2")
    }*/

    /*RANGOS
    println("Ingresa un numero del 1 al 20")
    val number: Int= readLine()!!.toInt()
    if (number in 1..20){
        println("Perfecto!! $number está en el rango requerido")
    }else{
        println("Te dije un numero del 1 al 20!!")
    }*/

    //GENERAR NUMEROS RANDOM
    var results: Int= (1..50).random()
    println("El numero aleatorio es: $results")
    //CONDICIONAL WHEN
    when(results){
        0-> println("no hay resultados")
        1,2,3,4,5->println("hay menos de 5 resultados")
        in 6..50->println("hay entre 5 y 50 resultados")
        else->println("Esos son bastantes resultados")
    }
}