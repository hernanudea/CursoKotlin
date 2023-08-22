package learning

fun main() {

    var name : String? = null

    val l1 = name?.length // no produce error
//    val l2 = name.length // si produce error


    var name2: String? = "Matias"
    println("Nombre: $name2")
    name2 = null
    println("Nombre: $name2")
}

