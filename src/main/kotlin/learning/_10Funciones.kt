package learning

fun main() {
    val frase = "Hola Mundo Inmundo!"
    imprimirFrase(randomCase(frase))
}

fun imprimirFrase(frase: String): Unit {
    println("Tu frase es: $frase")
}

fun randomCase(frase: String): String {
    val numAleatorio = (0..99).random()
    return if (numAleatorio.rem(2) == 0) {
        frase.uppercase();
    } else {
        frase.lowercase()
    }
}