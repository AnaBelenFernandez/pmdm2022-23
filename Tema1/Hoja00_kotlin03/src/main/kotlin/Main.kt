fun main(args: Array<String>) {
    /*  Modifica el ejercicio 4 de la Hoja00_Kotlin_02 para que cada opción de menú sea una función.
        Cada función deberá recibir los parámetros adecuados y devolver el dato cuando corresponda.
        En la opción 1 haz una función de expresión única
        En la opción 2 la función no devuelve nada. Puede escribir directamente por pantalla desde dentro
        de ella*/
    //contar(43)
    //diezMultiplos(43)
    mostrarMediaNotas("DAM", 2.8f, 6.3f, tutor = "David")
}

fun contarCifras(numero: Int) = println("El número de dígitos es ${numero.toString().length}")
fun contar(numero: Int) = numero.toString().length;
fun diezMultiplos(numero: Int) {
    for (i in 1..10)
        println("${numero * i}")
}

fun mostrarMediaNotas(grupo: String, vararg notas: Float, tutor: String = "Ivan") {
    /*Programa tenga una función llamada mostrarMediaNotas que reciba en primer lugar el nombre del
grupo. Luego debe recibir un número no especificado de notas (Float) y, por último, un String con
el nombre del tutor. Este parámetro tiene el valor por defecto “Iván”
La función debe mostrar el nombre del grupo del grupo, su tutor y la media de las notas recibidas.
Probar desde el main a llamar a la función pasando distintos parámetros.*/
    var suma: Float = 0.0f
    for (nota in notas) {
        suma += nota;
    }

    println("El grupo es $grupo, la media es ${suma / notas.size}  y el tutor es $tutor")
}





