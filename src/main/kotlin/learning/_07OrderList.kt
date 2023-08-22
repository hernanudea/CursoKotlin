package learning

fun main() {
    val numerosLoteria = listOf(11, 22, 43, 56, 78, 66, 30)
    numerosLoteria.also { println(it) }

    // Orden por defecto
    var numerosSorted = numerosLoteria.sorted()
    numerosSorted.also { println(it) }

    // Orden desendente
    numerosSorted = numerosSorted.sortedDescending()
    numerosSorted.also { println(it) }

    // Orden con condición
    val ordenarPorMultiplos = numerosLoteria.sortedBy { num -> num < 50 }
    ordenarPorMultiplos.also { println(it) }

    // OrdenAleatorio
    val numerosAleatorios = numerosLoteria.shuffled()
    numerosAleatorios.also { println(it) }

//    Reverse
    val numerosEnReversa = numerosLoteria.reversed()
    println(numerosEnReversa)

    // Usando map
    val mensajedeNumeros = numerosLoteria.map { numero ->
        "Tu numero de loteria es $numero"
    }
    println(mensajedeNumeros)

    // filter
    val numerosFiltrados = numerosLoteria.filter { n -> n > 20 }
    println(numerosFiltrados)

}