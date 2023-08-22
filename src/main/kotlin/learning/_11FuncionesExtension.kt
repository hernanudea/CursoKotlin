package learning

fun main() {
    val frase = "Hola Mundo Inmundo!".randomCase().imprimirFrase()
}

fun String.imprimirFrase(): Unit {
    println("Tu frase es: $this")
}

fun String.randomCase(): String {
    val numAleatorio = (0..99).random()
    return if (numAleatorio.rem(2) == 0) {
        this.uppercase();
    } else {
        this.lowercase()
    }


}