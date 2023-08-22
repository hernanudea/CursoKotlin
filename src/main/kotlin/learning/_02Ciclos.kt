package learning

fun main() {
    var contador = 10

    //Ciclo while
    while (contador > 0) {
        println("El contador vale $contador!")
        contador--
    }
    printSeparator()
//    Ciclo do, while
    do {
        println("Generando numeroaleatorio...")
        val nAleatorio = (0..100).random()
        println("El número generado es: $nAleatorio.")
    } while (nAleatorio > 50)

    printSeparator()

    val fruitList = listOf("Manzana", "Pera", "Mango", "Piña", "Banano")
    for (fruit in fruitList) {
        println("Voy a comer un(a) $fruit")
    }
    printSeparator()
    for (fruit in fruitList) println("Voy a comer un(a) $fruit")

    printSeparator()
    fruitList.forEach { fruit -> println("Voy a comer una fruta nueva, es un(a) $fruit") }
    val numberCaracters: List<Int> = fruitList.map { f -> f.length }
    println(numberCaracters)

    val filterList = fruitList
        .filter { f -> f.length > 5 }
        .filter { f -> f.contains("z") }
    println(filterList)
}

fun printSeparator() {
    val sep = "#"
    println("\n")
    repeat(30) {
        print(sep)
    }
    println("\n")
}