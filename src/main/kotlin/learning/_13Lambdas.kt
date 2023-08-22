package learning

fun main() {
    // Declarando una lambda
    val myLambda: (String) -> Int =
        { valor -> valor.length }

    // Podemos usar it, pero si tenemos dos nos podemos confundir
    val myLambda2: (String) -> Int =
        { it.length }


    println(myLambda("Hola Mundo"))
    println(myLambda2("Hola Mundo"))

    val saludos = listOf("Hello", "Hola", "Ciau")

    // De esta manera no tenemos que especificar el parámetro que recibe la lambda
    val longitudSaludos = saludos.map(myLambda2)
    println(longitudSaludos)
}