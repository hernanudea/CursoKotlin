package learning

fun main() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Xiomi mi a3")
        .apply {
            removeIf { movil -> movil.contains("Google") }
        }
    println(moviles)

    //si asignamos un null, no se ejecuta el codigo dentro de apply
    val colores :MutableList<String>? = mutableListOf("Amarillo", "Azul")
    colores?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es: $size")
    }


}