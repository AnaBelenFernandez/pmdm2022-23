class Persona(nombre:String, apellidos:String, var edad:Int)
{
    //los constructores se declaran en la clase: lo que no pongas val ni var no son atributos, no accedes con el punto sobre el nombre del objeto
    //no es un atributo de la calse; en este caso tendría dos atributos, edad y nota(nombre y apellidos son parámetros)
    val nota=(0..10).random();
    init{
        if(edad>18){
            println("la nota aleatoria es $nota")
        }
    }
    //declarar más constructores pero sólo se podran poner parámetros, hay que llamar al cosntructor padre con el this
    //constructor(nombre:String,padre:Persona):this(nombre){
        //padre.hijos.add(this)

    //los getters y los setters los crea solos, pero igual los quiero personalizar
    var nombre:String =nombre
            get()=field.uppercase()//aquí pongo en mayúsculas el setter
        set(value){//aquí modifico el setter para añadir la palabra alumno
            field="Alumno:$value"
        }
        //'para crear una clase con los getter, setter, equals y hashcode hay que poner data class
    data class Perro(val nombre:String, val apellidos:String, var edad:Int){
        //esta clase ya tendrdía implícitos toso los métodos que antes teníamos que generar
    }
    //Enumeraciones --> enum class, los campos sin espacios
    enum class Comunidad(val codigo:Int){
        CAntabria(3),
        Andalucia(6),
        ASturias(4),
        PaisVasco(3)
    }
    //en la enumeración se pueden crear constructores(por ejempo para poner un código a la comunidad)
    }
