package learning

fun main() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Xiomi mi a3")
        .run {
            removeIf { movil -> movil.contains("Google") }
        }
    println(moviles)

}