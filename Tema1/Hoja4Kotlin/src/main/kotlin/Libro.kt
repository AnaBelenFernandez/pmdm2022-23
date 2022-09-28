class Libro(val ISBN: String, val titulo: String, val autor: String) {
    /*Diseña una clase llamada Libro con los atributos privados: ISBN, titulo y autor y los métodos:
• Un constructor que inicializa las propiedades con los valores pasados como argumentos
• Al intentar crear el objeto si el ISBN tiene menos de 13 caracteres mostrará un mensaje
indicando el error.
• Métodos selectores y modificadores.
• Un método llamado esEspañol que devuelve verdadero si los caracteres que ocupan las
posiciones 4 y 5 del ISBN son “84”. Ejemplo de ISBN=”9788499640884” es español.
• Un método toString que devuelva el título con todas las letras en mayúsculas y el autor
en minúsculas (salvo la primera letra).
Desde el método main() crear un objeto de tipo Libro mostrar todos sus datos y decir si es español o
no*/
    init {
        if (ISBN.length > 13) {
            println("Error, el ISBN debe tener 13 caracteres")
        }
    }

    fun esEspañol(): Boolean = this.ISBN.substring(3, 5).equals("84")

    override fun toString(): String = "${titulo.uppercase()}  ${autor.substring(0,1).uppercase()}${autor.substring(1).lowercase()}"




}