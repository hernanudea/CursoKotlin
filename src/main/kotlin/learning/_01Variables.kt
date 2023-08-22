package learning

fun main(args: Array<String>) {
    print("Ingresa un valor entre 1 y 7 según el día de la semana:")
    val day = readLine()?.toInt()

    when (day) {
        1 -> println("Lunes")
        2 -> println("Martes")
        3 -> println("Miercoles")
        4 -> println("Jueves")
        5 -> println("Viernes")
        6, 7  -> println("Fin de semana")
        else -> println("NO es un valor valido")
    }
    //Usando rangos
    when (day) {
        in 1..5 -> println("Dia laboral")
        in 6..7  -> println("Fin de semana")
        else -> println("Ingresa otro valor")
    }

    //Asignando un valor
    val isLaboral = when (day) {
        in 1..5 -> "Si"
        in 6..7  -> "No"
        else -> println("Ingresa otro valor")
    }
    println("Dia laboral? $isLaboral")
}