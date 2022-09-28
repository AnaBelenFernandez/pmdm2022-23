class Pizza(val masa:Masa, val ingrediente1:String, caloriasIngrediente1:Double, ingrediente2:String, caloriasIngrediente2:Double) {
    /*La clase Pizza tendrá un atributo de tipo Masa y dos atributos de tipo Ingrediente.
Crea un constructor de la clase Pizza que reciba un objeto de tipo masa, el nombre del primer
ingrediente, sus calorías, el nombre del segundo ingrediente y sus calorías.
Crear un método getCalorias en la clase Pizza que devuelva el total de calorías (suma de la masa y
de los 2 ingredientes).
Crear un método toString que muestre información de la pizza*/
    var in1:Ingrediente
    var in2:Ingrediente

    init{
        this.in1=Ingrediente(ingrediente1, caloriasIngrediente1)
        this.in2=Ingrediente(ingrediente2, caloriasIngrediente2)
    }
    //método getCalorías
  fun getCalorias():Double= masa.calorias+in1.calorias+in2.calorias
    override fun toString()="Esta pizza tiene dos ingredientes: ${in1.nombre} y ${in2.nombre} y un total de ${this.getCalorias()} calorías"

}