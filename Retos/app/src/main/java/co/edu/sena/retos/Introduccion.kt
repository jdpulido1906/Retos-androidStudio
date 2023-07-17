package com.SantiagoBurgos05.my_mobil_app

class Introduccion {
}
fun main(){
    println("hola mundo")
    //val= valor que no cambia
    //var= valor que puede cambiar

    var name: String="Michel"
    var largo: Long=68768687689698
    var entero: Int=1256416513
    var corto: Short=12345
    var byte: Byte=123
    var doble: Double=1.153546846831356
    var flotante: Float=1.124567F
    var char: Char='1'
    var booleano: Boolean= true

    //castear: realizar conversiones de datos
    var num: Int=10
    println(num.toByte())

    //concatenar (para realizar operaciones usamos corchetes {})
    println("la suma entre $entero y $corto es: ${entero+corto}")

    //para realizar expresiones hay que colocarlas dentro de los corchetes
    var s: String= "cesar"
    println("$s.length es: ${s.length} ")

    /* leer una linea de cadena
    var lastname = readLine()
    var results: Int= readLine()!!.toInt()*/

    //ACTIVIDAD PARA LEER DATOS E IMPRIMIRLOS
    println("Ingrese un numero")
    var num1: Int= readLine()!!.toInt()
    println("Ingrese otro numero")
    var num2: Int= readLine()!!.toInt()
    println("la suma entre $num1 y $num2 es: ${num1+num2}")

    //SEGURIDAD EN KOTLIN(una variable no puede ser simplemente nula, debe llevar ?)
    var nulo:Int?=null

}