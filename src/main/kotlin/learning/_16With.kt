package learning

fun main() {
    val colores = listOf("Azul", "Amarillo", "Rojo", "Verde")
    with(colores){
        println("Nuestros colores son: $this")
        println("Esta lista tiene una cantidad de $size")
    }
}