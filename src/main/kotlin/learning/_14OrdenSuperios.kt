package learning

fun main() {
    val largoDelValorInicial = superFuncion(valorInicial = "Hola!") { valor ->
        valor.length
    }
    println(largoDelValorInicial)

    val lambda = funtionInception("Matias")
    val valorlambda = lambda()
    println(valorlambda)
}

fun superFuncion(valorInicial: String, block: (String) -> Int): Int {
    return block(valorInicial)
}

// si queremos devolver una lambda
fun funtionInception(nombre: String): () -> String {
    return {
        "Hola desde la la Lambda $nombre"
    }
}
