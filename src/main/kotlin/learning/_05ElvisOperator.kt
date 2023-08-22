package learning

fun main() {
    var name:String? = null
    val nroCaracters :Int = name?.length ?: 0
    
    println("Numero Carácteres: $nroCaracters")
}