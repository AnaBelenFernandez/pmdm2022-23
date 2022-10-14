fun main(args: Array<String>) {

//operadores unarios
    //var num1:Int=3
    // num1++
    //el incremento se hace en la siguiente línea
    //con el ++ antes, el incremento lo hace en la misma línea
    //println("num1 con incremento  ${++num1}")


    var numeroEnteroByte: Byte = 5
    var numeroEntero: Int = 5
    var numeroFloat: Float = 2.5f
    var caracter: Char = 'a'
    var logico: Boolean = true
    //para distinguir var de val a val(constante) se le asigna un nombre en mayúsculas(convención)
    //conversión de tipos
    var edad: Int = numeroFloat.toInt()
    //inferencia de tipos
    var codigo = 45
    //ha inferido que es un int
    codigo = numeroFloat.toInt()
    var res = 'c' in 'a'..'f'
    println(res)
    println("El número entero es $numeroEntero y el byte es $numeroEnteroByte")
    var num1 = 5.0
    var num2 = 3.48
    var num3 = 0
    var prom = (num1 + num2 + num3) / 3
    println(prom)
    println("%.2f".format(prom))
    if (prom > 3.5) println("aprobado")
    var estacion = 6
    //puedo asignar a una variable el resultado de una estructura de control
    var resultado=when (estacion) {
        in 1..3 -> "invierno"
        in 6..8 -> "verano"
        else-> "Es otra estación"
    }
    println(resultado)
    //var i=0
    //do{
       // println("$i")
       // i++
    //}while (i<=10)
    //rango de números
    //para no pintar el último número
    for (i in 0 .. 10 ){
        print("$i ")
        if(i==4) print("Encontró el 4")
        break;
    }
    //con el down to es como i--
    for (i in 10 downTo  0 step 2){
        println("$i")
    }
for (i in 'a'..'h'){
    println("$i")
}
var arraydeEnteros:Array<String>
arraydeEnteros= arrayOf("Ana","Pedro","Jose")
    for (i in arraydeEnteros.withIndex()){
        println("Valor: $i Posicion : ${arraydeEnteros[0]}")
        //sacar el indice

    }


}


