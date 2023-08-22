package learning

fun main() {
    // Parámetros nombrados
    imprimirNombre(nombre = "Hernan", apellido = "Velasquez")
    imprimirNombreValoresDefecto(nombre = "Hernan", apellido = "Velasquez")
}

// Función con parametros nombrados en su llamado
fun imprimirNombre(nombre: String, apellido: String) {
    println("Mi nombre es $nombre y mi apellido es $apellido")
}

// Función con parametros con valores por defecto en su llamado
fun imprimirNombreValoresDefecto(nombre: String, segundoNombre: String = "", apellido: String) {
    println("Mi nombre es  completo es $nombre $segundoNombre $apellido")
}