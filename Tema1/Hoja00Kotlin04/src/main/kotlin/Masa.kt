
    /*Crearemos una clase Masa que tendrá un tipo (String) que podrá ser fina, normal o con bordes
rellenos (enumeración). Además, tendrá un atributo calorías de tipo Double.
*/
    data class Masa(private val tipoMasa:TipoMasa, val calorias:Double)
    enum class TipoMasa{
        fina,
        normal,
        conbordes
    }


