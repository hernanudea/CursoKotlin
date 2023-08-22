package learning

fun main() {

    // Set inmutable
    val vocalesRepetidas = setOf("a","a", "A", "i", "u", "o", "e" )
    println(vocalesRepetidas)

    // Set mutable
    val numerosFavoritos = mutableSetOf(1,2, 3, 3, 3, 4, 5, 7)

    // Agregar elementos
    numerosFavoritos.add(8)
    numerosFavoritos.add(9)
    println(numerosFavoritos)

    // remover elemento
    numerosFavoritos.remove(7) //elimina por valor
    println(numerosFavoritos)

    //Buscar dado una condición
    val valorDelSetList = numerosFavoritos.filter { num -> num > 2}
    val valorDelSet = numerosFavoritos.first() { num -> num > 2}
    println("valorDelSetList: $valorDelSetList.")
    println("valorDelSet: $valorDelSet.")


}