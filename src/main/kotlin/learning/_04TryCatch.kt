package learning

fun main() {
    var name: String? = null
    try {
        name!!.length
    } catch (exception: Exception) {
        println("Se ha presentado un erros")
    } finally {
        println("Bloque finally")
    }
    println("salimos del catch")

    //lanzar exception
    try {
        throw NullPointerException("Ha ocurrido un NullPointerException!")
    } catch (e: Exception) {
        println(e.message)
    }

//    try con asignación
    var n1 = 10
    var n2 = 0
    val result = try { n1 / n2} catch (e: Exception) {0}
    println("Resultado: $result")
}