package learning

fun main() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Xiomi mi a3")
        .also { lista -> println("El valor original de la lista es $lista") }
        .asReversed()
    println(moviles)

}