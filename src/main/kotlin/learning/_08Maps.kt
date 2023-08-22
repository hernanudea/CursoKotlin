package learning

fun main() {

    // map inmutable
    val edadSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    print("inmutable => \t")
    println(edadSuperHeroes)

    // map mutable
    val mutableMap = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 23,
        "Capitan America" to 99
    )
    print("mutable => \t")
    println(mutableMap)

    // Agregar un nuevo par
    mutableMap.put("Wolderine", 45)
    mutableMap["Storm"] = 30
    println(mutableMap)

    // Obtener un valor dado la clave
    val edadIranman = mutableMap["Ironman"]
    println("Edad Iraonman: $edadIranman.")

//    Eliminar elemento
    val edadEliminada = mutableMap.remove("Wolderine")
    println(edadEliminada)

    // Todas las claves o todos los valores
    print("Claves => \t"); println(mutableMap.keys)
    print("Valores => \t"); println(mutableMap.values)
}