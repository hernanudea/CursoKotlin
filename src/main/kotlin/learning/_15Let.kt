package learning

fun main() {
    var nombre: String? = null

    nombre?.let { valor ->
        println("EL valor no es null, es: $valor")
    }

    nombre = "Hernan"
    nombre?.let { valor ->
        println("EL valor no es null, es: $valor")
    }

    println("Fin de script")
}