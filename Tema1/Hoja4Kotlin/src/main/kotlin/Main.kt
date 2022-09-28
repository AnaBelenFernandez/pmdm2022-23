import java.io.File
import java.io.FileReader
import java.io.IOException
import java.nio.file.Path
import java.nio.file.Paths
import kotlin.io.path.readLines


fun main(args: Array<String>) {
    var libro = Libro("123845795323745", "El Quijote", "Cervantes")
    print(libro.toString())
    if (libro.esEspañol()) println("Es Español")
    /*• Crea un objeto de tipo Masa
   • Crea una pizza pasándole la masa anterior y los datos de los dos ingredientes
   • Modifica el ingrediente2 con el método set
   • Obtén el ingrediente1y modifica únicamente sus calorías
   • Muestra los datos de la pizza por pantalla*/
    var masa=Masa(TipoMasa.fina,1000.00)
    var pizza=Pizza(masa,"Pepperoni",200.00,"Aceitunas",300.00)
    println(pizza.toString())

    mayores(leerFichero("dinosaurios.csv"), 1.00);
}

fun mayores(lista:ArrayList<Dinosaurio>, altura:Double):ArrayList<Dinosaurio> {
    val listaMay=lista.sortedByDescending { dinosaurio ->dinosaurio.altura.plus(altura)  }
    println("lista de dinosaurios más altos que $altura" )
    val listaCinco=arrayListOf<Dinosaurio>()
    for (i in 0..4){
        listaCinco.add(listaMay[i])
    }
    for (d in listaCinco){
        println(d.toString())
    }
    return listaCinco}

fun leerFichero(path:String): ArrayList<Dinosaurio> {
    val dinosaurios= arrayListOf<Dinosaurio>()
    var lineas=listOf<String>()
    lineas=File(path).readLines()
    var index=1
    for (i in 1..lineas.size-1 ){
        var caracteristicas=listOf<String>()
        caracteristicas= lineas[i].split(";")
        var Dinosaurio=Dinosaurio(caracteristicas[0],caracteristicas[1],caracteristicas[2].toDouble(), caracteristicas[3].toDouble())
        dinosaurios.add(Dinosaurio)
    }
    return dinosaurios}