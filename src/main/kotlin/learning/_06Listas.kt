package learning

fun main(args: Array<String>) {
    //Lista inmutable
    val listaNombres = listOf<String>("Samuel", "Eliana", "Eliana", "Hernán")
    listaNombres.also { println(it) }

    //Listas Mutables
    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    listaVacia.add("Juan")
    listaVacia.add("Cristina")
    listaVacia.add("Eliza")
    listaVacia.also { println(it) }

    val valor = listaVacia.get(0)
    println(valor)
    val valorConOperador = listaVacia[0]
    println(valor)
    val primero = listaVacia.first()
    val primeroConCondicion = listaVacia.first()
    val primeroONull = listaVacia.firstOrNull() // Regresa null si no encuentra algo
    val ultimo = listaVacia.last()

    val remove = listaVacia.removeAt(1)
    listaVacia.also { println(it) }

    val removeIf = listaVacia.removeIf { c -> c.length > 4 }
//    println(listaVacia)
    listaVacia.also { println(it) }

    // Arrays
    val myArray = arrayOf(1, 2, 3, 4, 5).also {
        println(it)
    }
    println("My Arrays as list: ${myArray.toList()}")

//    for ((index, item)listaVacia.withIndex()) {
//        println("La posición $index contiene $item")
//    }

    for ((index, value) in myArray.withIndex()) {
        println("the element at $index is $value")
    }
    myArray.toList().forEachIndexed { index, element ->
                println("El indice $index contiene el valor $element!")
    }
    for (i in myArray.indices) {
        print(myArray[i])
    }

    val mutableList: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")
    val newListEmpty: MutableList<String> = mutableListOf()
    mutableList.forEach {
        newListEmpty.add(it+":")
    }
    print(newListEmpty)
}