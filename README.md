# Curso de Kotlin desde Cero

Created: August 9, 2023 1:57 PM
Last Edited Time: August 19, 2023 1:35 PM
Type: Kotlin, Movil
Status: In Progress
Created By: Hernán Velásquez
Last Edited By: Hernán Velásquez
Platform: Platzi
Topic: Kotlin
Mode: Priority
Instructor: Giuseppe Vetri

# ****Curso de Kotlin desde Cero****

## Tabla de Contenido

# **Introducción a Kotlin**

## ****Introducción al Curso de Kotlin****

### Documentación oficial del Curso

[slides-del-curso-de-kotlin-desde-cero_09493967-a482-460f-82ba-f422ff23bfe0.pdf](assest_md/slides-del-curso-de-kotlin-desde-cero_09493967-a482-460f-82ba-f422ff23bfe0.pdf)

## ****Qué es la Java Virtual Machine****

Una virtual machine es una virtualización o simulación de un sistema operativo o de los procesos que ocurren dentro de este. En nuestro caso, la Java Virtual Machine pertenece al segundo tipo y se encarga de simular los procesos que ocurren dentro de un sistema operativo. A este tipo de máquinas virtuales se les llama Process Virtual Machines.

### ¿Qué ventaja nos da?

Nos ayuda a manejar los punteros y las referencias de memoria que en otros tipos de lenguaje como C o C++ hay que manejar manualmente. Para esto se utiliza un proceso llamado garbage collection. Este proceso se encarga de revisar qué referencia de memoria no se está utilizando para eliminarla y as í reducir la cantidad memoria que puede consumir un programa.

### ¿Cómo funciona la JVM?

La JVM funciona como un punto medio entre el código que nosotros escribimos y lo que entiende el sistema operativo del ordenador. Dependiendo del sistema operativo que uses puede variar. La JVM nos ayuda a que nuestro código se ejecute en Linux, Windows y MacOS. Nuestro código es convertido por la JVM a un lenguaje que puede entender el sistema operativo llamado Java Bytecode.

En palabras más simples, nosotros ingresamos código de Kotlin y se transforma en Bytecode. Este proceso puede ocurrir con otros lenguajes como Java, esto hace que nuestro código de Kotlin pueda ser utilizado desde Java y el código de Java pueda ser utilizado en Kotlin.

## ****Qué es Kotlin****

Kotlin es un lenguaje de programación estático de código abierto que admite la programación funcional y orientada a objetos. Proporciona una sintaxis y conceptos similares a los de otros lenguajes, como C#, Java y Scala, entre muchos otros. No pretende ser único, sino que se inspira en décadas de desarrollo del lenguaje. Cuenta con variantes que se orientan a la JVM (Kotlin/JVM), JavaScript (Kotlin/JS) y el código nativo (Kotlin/Native).

![Untitled](assest_md/Untitled.png)

# **Configuración del entorno**

## ****Instalación de IntelliJ****

[Toolbox App](https://www.jetbrains.com/es-es/toolbox-app/)

## ****Kotlin con Visual Studio Code****

Aunque en este curso vayamos a trabajar con **IntelliJ**, ya que es el standard en la industria para trabajar con **Kotlin**, puede que si estás empezando a programar no tengas todav ía un ordenador lo suficientemente potente para ejecutar **IntelliJ** o simplemente prefieras usar **Visual Studio Code**.

En esta gu ía podrás configurar tu **Visual Studio Code** para utilizar **Kotlin**.

### Bajar **Visual Studio Code**

Para utilizar **Visual Studio Code** debes ir al siguiente enlace y descargar la versión dependiendo de tu sistema operativo:

[Download Visual Studio Code - Mac, Linux, Windows](https://code.visualstudio.com/Download)

### Instalar el plugin de Kotlin y Code Runner

Ahora que ya has descargado **Visual Studio Code**, tendrás que instalar el plugin de **Kotlin** y **Code Runner** para esto tienes que ir al **marketplace** y descargarlos.

- [Enlace del Marketplace de visual studio code.](https://marketplace.visualstudio.com/items?itemName=mathiasfrohlich.Kotlin)
- [Enlace del Marketplace de visual studio code para instalar el code runner](https://marketplace.visualstudio.com/items?itemName=formulahendry.code-runner)

Ahora puedes hacer clic derecho y ejecutar el código o presionar el botón de play en la esquina superior derecha.

Aqu í te dejo un ejemplo de cómo se ver ía.

![https://static.platzi.com/media/user_upload/kotlin%20con%20visual%20studio-6cceab9d-728d-4566-8d40-5cec004161f6.jpg](https://static.platzi.com/media/user_upload/kotlin%20con%20visual%20studio-6cceab9d-728d-4566-8d40-5cec004161f6.jpg)

# **Hola mundo Kotlin**

## ****Hola mundo con Kotlin****

**Carpetas y ficheros**

Si inician con un **punto** "." guardan información de nuestro proyecto.

- *`.gradle`* es un sistema de compilación de Android
- *`build`*carpeta que almacena el código compilado por Gradle
- *`src`* carpeta más importante donde se encuentra nuestro código
- `main.kt`fichero que sirve como punto de entrada para el desarrollo de nuestra app
- *`test`* carpeta de tests necesarios para la app
- `build.gradle.kts`fichero que contiene la configuración de como funciona el proyecto, versiones,  dependencias, etc.
- `gradle.properties` fichero que permite declarar propiedades del proyecto.
- *`seetings.gradle.kts`*fichero para especificar propiedades del proyecto.

## ****Variables en Kotlin****

- `var` : Son variables de lectura y escritura. Podemos definir el tipo as í; `var valor: int`, pero también podemos dejar que lo infiera cuando le asignamos un valor, `var nombre = "Hernan".
- `val`: Son variables de solo lectura, dichas variables una vez asignado el valor no puede ser cambiado posteriormente.
- `const val`:  son constantes, estas se definen fuera de la función y se escriben con la palabra reservada `const` seguida de la palabra reservada `val`.

En Kotlin no se puede cambiar el tipo de dato con que se a definido una variable, si la variable se definió con el tipo de dato String solo podremos actualizar dicho valor por otro String, por ejemplo no podemos pasar de un String a un numero.

```kotlin
const val PI = 3.1416
fun main(args: Array<String>) {
    println("Hello World!")
    var dinero =  10
    println(dinero)
    dinero = 5
    println(dinero)
    val nombre : String = "Samuel"
    println(nombre)
    println(PI)
    println("Hola " + nombre)
}
```

[Basic syntax | Kotlin](https://kotlinlang.org/docs/basic-syntax.html#variables)

## ****Kotlin y sus tipos de variables****

- `Byte`: Para enteros de hasta 8bits. Ej. **`var** edad: Byte = 30`
- `Short`: Para enteros de hasta 16bits. Ej. **`val** diasAno: Byte = 3650`
- `Int`: Para enteros de hasta 32bits. Ej. **`val** diasSiglo: Int = 36526`
- `Long`: Para enteros de hasta 64bits. Ej. **`val** distanciaLunaMetros: Long = 384400000L`
- `Float`: Para decimales de hasta 32bits. Ej. **`var** peso: Float = 86.7F`
- `Double`: Para decimales de hasta 64bits. Ej. **`var** temperatura: Double = 12.23`
- `Char`: Para almacenar caracteres de forma individual. Ej. **`var** letraDNI: Char = 'D'`
- `Boolean`: Para almacenar los valores lógicos **`true`** y **`false`**. Ej. `**val** esUnaVariable: Boolean = **true**`
- `String`: Permite almacenar cadenas de caracteres. Ej. **`var** nombre: String = "Hernan"`
- `Arrays`: Permite almacenar listas de objetos. Ej. **`val** misColoresFavoritos = arrayOf("naranja", "azul", "rojo", "negro")`

Podemos hacer interpolación de String, para esto podemos usar:

- `${}` -> poner expresiones
- `$` -> poner valores

```kotlin
const val PI = 3.1416
fun main(args: Array<String>)
    val boolean: Boolean = false;
    val numeroLargo: Long = 3L
    val puntoFlotante: Double = 2.7182
    val flotante: Float = 50.2f
    val samuName = "Samuel"
    val samuLastname = "Velasquez"

    val fullName = "Mi hijo mejor se llama $samuName $samuLastname!"
    println(fullName)
}
```

![Untitled](assest_md/Untitled%201.png)

![Untitled](assest_md/Untitled%202.png)

![Untitled](assest_md/Untitled%203.png)

[Basic types | Kotlin](https://kotlinlang.org/docs/basic-types.html)

[Tipos Primitivos En Kotlin - Develou](https://www.develou.com/tipos-primitivos-en-kotlin/)

## ****Modificadores y tipos de datos en Kotlin****

### ¿Qué es un tipo de dato?

Enteros, cadenas de texto, booleanos. El tipo de valor que van a tener nuestras variables

### **¿Qué es un dato primitivo**

Tipos de datos originales de un lenguaje de programación. En Kotlin lo son los enteros, booleanos y cadenas de texto

### **¿Qué es un objeto?**

Es una combinación de variables, funciones y otros objetos.

**En Kotlin todo es un objeto**, se convierten los datos primitivos a un objeto para obtener algunas ventajas como:

- Crear funciones especificas para el objeto que ayuden a no reescribir el código.
- Sobrescribir operadores como la suma o multiplicación.
- Extender el lenguaje para crear nuevas funciones que permitan repetir código
- Kotlin tiene que compilar el código y hacerlo interoperable con JAVA
    - Un entero que puede ser nulo, pero no se convertirá a primitivo
    - Un entero que no puede ser nulo, se convertirá en a primitivo

## ****Operaciones con los tipos de datos en Kotlin****

En **Kotlin** las operaciones son traducidas a funciones interiormente por el compilador. La operación `val tercerValor = primerValor + segundoValor` es lo mismo que decir `tercerValor = primerValor.plus(segundoValor)`.

En la siguiente tabla te voy a dejar las operaciones que vas a poder realizar con los distintos tipos de datos y si te encuentras con alguno que no permita realizar esa operación puedes crearla por tu cuenta. Recuerda que **Kotlin** te permite extender el lenguaje para aprovechar estas funcionalidades.

## Operaciones más utilizadas

| Expresión | Función | Operator Fun |
| --- | --- | --- |
| a + b | c = a + b | public operator fun plus(other: Int): Int |
| a - b | c = a - b | public operator fun minus(other: Int): Int |
| a * b | c = a * b | public operator fun times(other: Int): Int |
| a / b | a = a / b | public operator fun div(other: Int): Int |
| a % b | c = a % b | public operator fun rem(other: Int): Int |
| a++ | c = a++ | public operator fun inc(): Int |
| a- - | c = a- -  | public operator fun dec(): Int |
| a > b | c = a > b | public override operator fun compareTo(other: Int): Int |
| a < b | c = a < b | public override operator fun compareTo(other: Int): Int |
| a >= b | c = a >= b | public override operator fun compareTo(other: Int): Int |
| a <= b | c = a <= b | public override operator fun compareTo(other: Int): Int |
| a != b | c = a != b | public open operator fun equals(other: Any?): Boolean |

Dependiendo del tipo de dato que tengas podrás utilizar todos o solamente algunas de estas operaciones, por ejemplo si tienes una variable del tipo de dato **String** no vas a poder dividirla, a menos que tú crees esa función. Sin embargo, s í vas a poder sumar dos variables del tipo de dato **String** para obtener el valor de dicha suma.

Con esto espero que hayas obtenido una idea sobre cómo funcionan las operaciones, queda de parte de ti si prefieres utilizar la versión larga del **operator fun** o el operador directamente.

Ten en cuenta que si las **operator fun** se inventaron para que puedas reducir tu código a operaciones con s ímbolos ¿por algo será, no?

## ****Kotlin y la programación funcional****

### **Paradigma imperativo:**

Se centra en describir como funciona un programa.

### **Paradigma de programación funcional**

Se centra en que tiene que hacer un programa y no en como se hace.

### Caracter ísticas de Kotlin

- **Es inmutable:** Recordemos que un elemento es mutable cuando puede cambiar de estado, será inmutable cuando no lo haga.
- **Las funciones son objetos:** Las funciones pueden almacenarse en variables, pasarse como parámetros y tratarse como cualquier otro objeto
- **Utiliza funciones puras:** Reciben siempre los mismos parámetros y devuelven siempre el mismo resultado.

## ****Estructuras de control: `if`**

Es un mecanismo que nos proporciona el lenguaje para evaluar condiciones que son true o false y as í decidir que bloque de código se va a ejecutar.

Para evaluar las condiciones con la sentencia `if` debemos aprender el concepto de operador condicional, este operador nos van a servir para evaluar condiciones, los operadores condicional son:

- `>` mayor que.
- `<` menor que.
- `>=` mayor o igual que.
- `<=` menor o igual que
- `==` igualdad.
- `!=` desigualdad.

```kotlin
fun main(args: Array<String>) {
    val name = "Maria"

    if (name.isNotEmpty()) {
        println("El largo de la variable nombre es: ${name.length}!")
    } else {
        println("Error: La variable está vacia!")
    }

}
```

Podemos escribir un `if` en usa sola l ínea.

```kotlin
if (name.isNotEmpty()) println("El largo de la variable nombre es: ${name.length}!") else println("Error: La variable está vacia!")
```

Podemos hacer una asignación por medio de un `if`:

```kotlin
val mensaje: String = if (name.length > 4) {
     "Tu nombre es largo"
} else {
     "Tu nombre es corto"
}
```

Con un `else if`, seria as í:

```kotlin
val mensaje: String = if (name.isEmpty()) {
        "NO puede ser una cadena vacia"
    } else if (name.length > 4) {
        "Tu nombre es largo"
    } else {
        "Tu nombre es corto"
    }
```

[Conditions and loops | Kotlin](https://kotlinlang.org/docs/control-flow.html#if-expression)

## ****Estructuras de Control: `when`**

```kotlin
fun main(args: Array<String>) {
    print("Ingresa un valor entre 1 y 7 según el d ía de la semana:")
    val day = readLine()?.toInt()

//Con varios valores
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
```

- Cuando son varias l íneas podemos usar llaves `{}`
- Cuando usamos asignación, debemos obligatoriamente usar un `else`, debemos cubrir todas las posibilidades.

[Conditions and loops | Kotlin](https://kotlinlang.org/docs/control-flow.html#when-expression)

# **Conceptos básicos de Kotlin**

## ****Bucles: While y Do While****

Bucles `while`, ejecutan un bloque de código mientras la condición se cumpla

```kotlin
var contador = 10

    //Ciclo while
    while (contador > 0) {
        println("El contador vale $contador!")
        contador--
    }
```

Con `do while`, se garantiza la ejecución por lo menos de una vez, ya que el ciclo ejecuta el código y luego evalúa la condición.

```kotlin
do {
        println("Generando numeroaleatorio...")
        val nAleatorio = (0..100).random()
        println("El número generado es: $nAleatorio.")
    } while (nAleatorio > 50)
```

## ****Ciclos****

Podemos escribir un `for` as í, para iterar una lista

```kotlin
val fruitList = listOf("Manzana", "Pera", "Mango", "Pi帽a", "Banano")

    for (fruit in fruitList) {
        println("Voy a comer un(a) $fruit")
    }
```

Sintaxis comprimida, podemos escribirlo en una sola l ínea:

```kotlin
val fruitList = listOf("Manzana", "Pera", "Mango", "Pi帽a", "Banano")

for (fruit in fruitList) println("Voy a comer un(a) $fruit")
```

Usando `forEach`:

```kotlin
fruitList.forEach { fruit -> println("Voy a comer una fruta nueva, es un(a) $fruit") }
```

Usando el `forEach`, `map` y `filter` de la programación funcional:

```kotlin
// forEach
fruitList.forEach { fruit -> println("Voy a comer una fruta nueva, es un(a) $fruit") }

//map
val numberCaracters: List<Int> = fruitList.map { f -> f.length }
println(numberCaracters)

// filter
val filterList = fruitList
		.filter { f -> f.length > 5 }
    .filter { f -> f.contains("z") }
println(filterList)
```

[Map-specific operations | Kotlin](https://kotlinlang.org/docs/map-operations.html#plus-and-minus-operators)

[Iterators | Kotlin](https://kotlinlang.org/docs/iterators.html#mutable-iterators)

[Conditions and loops | Kotlin](https://kotlinlang.org/docs/control-flow.html#when-expression)

## ****Null-Safety en Kotlin****

![Untitled](assest_md/Untitled%204.png)

![Untitled](assest_md/Untitled%205.png)

## ****Valores nulos, Double bang y cómo solucionarlos****

Los nulls son una herramienta que puede ser bien utilizada o mal utilizada. Para declarar una variable nullable, debemos poner el signo `?` después del tipo:

```kotlin
var name: String? = "Matias"
println("Nombre: $name")
name = null
println("Nombre: $name")
```

Podemos usar el signo ? para ejecutar solo si no es null

```kotlin
var name : String? = null

val l1 = name?.length // no produce error
val l2 = name.length // si produce error
```

![Untitled](assest_md/Untitled%206.png)

![Untitled](assest_md/Untitled%207.png)

![Untitled](assest_md/Untitled%208.png)

Cuando ejecutamos código escrito en Java, podemos ver algo como `Integer!`, quiere decir que Kotlin no puede validar si es nullable, entonces debemos tener cuidado.

![Untitled](assest_md/Untitled%209.png)

## ****Try Catch****

Podemos usar un bloque `try` `catch` igual que en Java

```kotlin
var name: String? = null
try {
    name!!.length
} catch (exception: Exception) {
    println("Se ha presentado un erros")
} finally {
    println("Bloque finally")
}
println("salimos del catch")
```

Lanzando nuestras propias excepciones:

```kotlin
try {
    throw NullPointerException("Ha ocurrido un NullPointerException!")
} catch (e: Exception) {
    println(e.message)
}
```

Podemos usar un `try` para realizar una **asignación**:

```kotlin
var n1 = 10
var n2 = 0
val result = try { n1 / n2} catch (e: Exception) {0}
println("Resultado: $result")
```

## ****Elvis operator****

Operador `?:` que nos sirven para devolver un valor cuando un elemento es null.

```kotlin
fun main() {
    var name:String? = null
    val nroCaracters :Int = name?.length ?: 0
    
    println("Numero Carácteres: $nroCaracters")
}
```

[Null safety | Kotlin](https://kotlinlang.org/docs/null-safety.html#elvis-operator)

# **Collections en Kotlin**

## ****Listas****

Las colecciones se pueden clasificar en dos grandes grupos, las **mutables** e **inmutables**. Es decir, las que se pueden editar (mutables) y las que son solo de lectura (inmutable).

### Listas inmutables

La declaración de una lista inmutable ser ía as í.

```kotlin
val readOnly: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

val listaNombres = listOf<String>("Samuel", "Eliana", "Eliana", "Hernán")
listaNombres.also { println(it) }
```

Existen varias funciones útiles para trabajar con ellas.

```kotlin
val readOnly: List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")
readOnly.size //Muestra el tama帽o de la lista
readOnly.get(3) //Devuelve el valor de la posición 3
readOnly.first() //Devuelve el primer valor
readOnly.last() //Devuelve el último valor
println(readOnly) //[Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, Domingo]
```

Como pueden ver podemos trabajar completamente con ellas, a excepción de a帽adir más elementos.

También podemos filtrar usando el patrón iterator, que es un mecanismo para acceder a los elementos de la lista, por ejemplo .first() o .last()

```kotlin
val a = readOnly.filter {it == "Lunes" || it == "Juernes" }
```

El `.filter` nos permite filtrar en la lista a través de una o varias condiciones que pongamos. Para ello llamamos a `it` (iterator) y buscaremos en la lista, si contiene la palabra 芦Lunes禄 o 芦Juernes芦. En este caso solo pintará 芦Lunes芦.

### Listas mutables

Ahora hablemos de las listas mutables, que poseen todo lo anterior, pero también nos da la posibilidad de ir rellenando la lista a medida que lo necesitemos, el único inconveniente es que más ineficiente con la memoria.

```kotlin
var mutableList: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")
    println(readOnly) //[Lunes, Martes, Miércoles, Jueves, Viernes, Sábado]
    mutableList.add("domingo")

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
listaVacia.also { println(it) }
```

La definición es muy similar, a través de la función mutableListOf. Ahora si nos fijamos he a帽adido de lunes a sábado que será lo que pintará, luego, usando mutableList.add he a帽adido el domingo.

Por defecto los valores se irán a帽adiendo en la última posición, pero podemos a帽adir el  índice en el que queramos escribir nuestro valor.

```kotlin
mutableList.add(0, "Semana: ")
```

Con esto, si pintásemos la lista nos mostrar ía lo siguiente.

```kotlin
[Semana: , Lunes, Martes, Miércoles, Jueves, Viernes, Sábado, domingo]
```

Ahora tenemos que tener cuidado con una lista mutable por el simple hecho de que podr ía estar vac ía o contener un null. Un null es un valor nulo en una de sus posiciones, que, si accedemos a él e intentamos operar, la aplicación se romperá, nos saltará un crash. Para ello, tenemos algunas funciones que nos permitirán trabajar como una lista inmutable, pero con seguridad.

```kotlin
var mutableList: MutableList<String> =mutableListOf()
   mutableList.none() // Nos devuelve un true si está vac ía la lista
   mutableList.firstOrNull() // Nos devolverá el primer campo, y si no hay, un null.
   mutableList.elementAtOrNull(2) // El elemento del  índice 2, si no hay, devolverá un null
   mutableList.lastOrNull() // 脷ltimo valor de la lista o null
```

En este ejemplo he instanciado una lista sin valor alguno, por lo que está vac ía. Con todos esos métodos recuperaremos un null (menos el primero que dará true) y la aplicación seguirá corriendo, si por lo contrario hubiera puesto un `.first()` nos hubiese dado una exception.

Debemos tener mucho cuidado a la hora de trabajar con datos que puedan mutar.

### Recorriendo listas

Esta ser ía la forma más sencilla, y nos devolver ía el contenido de cada uno de los valores de la lista.

```kotlin
for (item in mutableList) {
      print(item)
  }
```

Si necesitamos saber también la posición de cada uno de los valores podemos usar la función `.withIndex` o `.forEachIndexed`  que nos permite generar 2 variables, la primera será la posición y la segunda el contenido.

```kotlin
for ((index, value) in myArray.withIndex()) {
	println("the element at $index is $value")
}

// Otra forma
myArray.toList().forEachIndexed { index, element ->
                println("El indice $index contiene el valor $element!")
    }

// Otra Parecida
for (i in myArray.indices) {
	print(myArray[i])
}
```

Para el último ejemplo, usaremos `.forEach`, una función que hará que por cada posición haga una cosa, por ejemplo pintar el valor como el `for` anterior. A diferencia de ellos, no tenemos una variable con el contenido (véase  índice e item) sino que accedemos a él con el `iterator`, en este caso simplemente habr ía que poner `it`.

En este ejemplo imaginemos que queremos a帽adir a los d ías de la semana dos puntos 芦:禄 as í que vamos a crear una nueva lista (mutable) e iremos rellenando la lista a través del `forEach`.

```kotlin
val mutableList: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado")
val newListEmpty: MutableList<String> = mutableListOf()

mutableList.forEach {
	newListEmpty.add(it + ":")
}
print(newListEmpty)
```

[Cap ítulo 10 "?Listas en Kotlin - Curso Kotlin Para ANDROID](https://jlhoblx.cluster028.hosting.ovh.net/capitulo-10-listas-en-kotlin/)

[Iterators | Kotlin](https://kotlinlang.org/docs/iterators.html#list-iterators)

## Como ordenar listas con las funciones que tiene Kotlin

Algunos de los métodos para ordenar en listas:

```kotlin
val numerosLoteria = listOf(11, 22, 43, 56, 78, 66, 30)
numerosLoteria.also { println(it) }
    
    // Orden por defecto
var numerosSorted = numerosLoteria.sorted()
numerosSorted.also { println(it) }
    
    // Orden desendente
numerosSorted = numerosSorted.sortedDescending()
numerosSorted.also { println(it) }

    // Orden con condición
val ordenarPorMultiplos = numerosLoteria.sortedBy { num -> num < 50 }
ordenarPorMultiplos.also { println(it) }

    // OrdenAleatorio
val numerosAleatorios = numerosLoteria.shuffled()
numerosAleatorios.also { println(it) }

	  // Reverse
val numerosEnReversa = numerosLoteria.reversed()
println(numerosEnReversa)

    // Usando map
val mensajedeNumeros = numerosLoteria.map { numero ->
   "Tu numero de loteria es $numero"
}
println(mensajedeNumeros)

    // filter
val numerosFiltrados = numerosLoteria.filter { n -> n > 20 }
println(numerosFiltrados)
```

<aside>
馃挕 En las expresiones lambda podemos usar `it`, para iterar sobre cada elemento

</aside>

[Ordering | Kotlin](https://kotlinlang.org/docs/collection-ordering.html#random-order)

## Maps

Elementos `clave : valor`, también tenemos mutables e inmutables.

```kotlin
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
```

[Map-specific operations | Kotlin](https://kotlinlang.org/docs/map-operations.html)

## Sets

Los sets son listas que no permiten elementos duplicados:

```kotlin
fun main() {

    // Set inmutable
    val vocalesRepetidas = setOf("a","a", "A", "i", "u", "o", "e" )
    println(vocalesRepetidas)

    // Set mutable
    val numerosFavoritos = mutableSetOf(1,2, 3, 3, 3, 4, 5, 7)

    // Agregar elementos
    numerosFavoritos.add(8)
    numerosFavoritos.add(9)
    println(numerosFavoritos)

    // remover elemento
    numerosFavoritos.remove(7) //elimina por valor
    println(numerosFavoritos)

    //Buscar dado una condición
    val valorDelSetList = numerosFavoritos.filter { num -> num > 2}
    val valorDelSet = numerosFavoritos.first() { num -> num > 2}
    println("valorDelSetList: $valorDelSetList.")
    println("valorDelSet: $valorDelSet.")
}
```
Se eliminan los elementos por su valor

# **Libera el potencial de las funciones**

## ****¿Qué son las funciones?****

Una función es un código que se ejecuta cada vez que lo llamamos.

**Sintaxis de una función**

Las funciones más básicas se componen de 4 partes.

- Palabra reservada fun.
- Nombre de la función.
- Parámetros: Son las variables que le damos a la función para que las use en el código que ejecuta internamente.
- Tipo de retorno: Puede tener o no un valor de retorno.
- Código: Son las instrucciones que se van a ejecutar al llamar a la función.

Ejemplo de función:

![https://static.platzi.com/media/user_upload/ejemplo-funcion-c53ba9d2-3278-47e4-91c7-85894fb98cc5.jpg](https://static.platzi.com/media/user_upload/ejemplo-funcion-c53ba9d2-3278-47e4-91c7-85894fb98cc5.jpg)

Cuando queremos devolver algo de nuestra función usamos la keyword **return**.

Caso contrario cuando no queremos devolver nada de nuestra función, Kotlin regresar ía **Unit**.

Ejemplo de función que no devuelve nada, no tiene ningún tipo de retorno.

![https://static.platzi.com/media/user_upload/funcion%20sin%20retorno-f8b5644b-410b-48ca-927c-43c66a1a4971.jpg](https://static.platzi.com/media/user_upload/funcion%20sin%20retorno-f8b5644b-410b-48ca-927c-43c66a1a4971.jpg)

## ****Funciones y funciones de extensión****

Uso de funciones, creación, parámetros y retorno:

```kotlin
fun main() {
    val frase = "Hola Mundo Inmundo!"
    imprimirFrase(randomCase(frase))
}

fun imprimirFrase(frase: String): Unit {
    println("Tu frase es: $frase")
}

fun randomCase(frase: String): String {
    val numAleatorio = (0..99).random()
    return if (numAleatorio.rem(2) == 0) {
        frase.uppercase();
    } else {
        frase.lowercase()
    }
}
```

Las **funciones de extensión** es a帽adir métodos a las clases sin tocar la clase.

Para esto debemos seguir los siguientes pasos:

1. quitamos el parámetro que se recibe.
2. cambiamos el nombre de la función, anteponiendo el nombre del objeto. Ej: `String.nombreFuncion`
3. Dentro de la función, hacemos referencia al parámetro con la palabra reservada `this`.
4. Invocamos la función en un objeto de su tipo, como si de una función mas se tratara. Ej: `"淓sto es un string"?nombreFuncion()`

```kotlin
fun main() {
    val frase = "Hola Mundo Inmundo!".randomCase().imprimirFrase()
}

fun String.imprimirFrase(): Unit {
    println("Tu frase es: $this")
}

fun String.randomCase(): String {
    val numAleatorio = (0..99).random()
    return if (numAleatorio.rem(2) == 0) {
        this.uppercase();
    } else {
        this.lowercase()
    }
}
```

## ****Tipos de parámetros en las funciones****

Podemos llamar los métodos y especificar el nombre de las parámetros as í:

```kotlin
fun main() {
    // Parámetros nombrados
    imprimirNombre(nombre = "Hernan", apellido = "Velasquez")
}

// Función con parametros nombrados en su llamado
fun imprimirNombre(nombre: String, apellido: String) {
    println("Mi nombre es $nombre y mi apellido es $apellido")
}
```

Esto nos abre la posibilidad de entregarle menos parámetros durante el llamado, ya que estos parámetros tienen un valor por defecto en la definición del método.

```kotlin
fun main() {
    imprimirNombreValoresDefecto(nombre = "Hernan", apellido = "Velasquez")
}

// Función con parámetros con valores por defecto en su llamado
fun imprimirNombreValoresDefecto(nombre: String, segundoNombre: String = "", apellido: String) {
    println("Mi nombre es  completo es $nombre $segundoNombre $apellido")
}
```

## ****Lambdas****

Las funciones lambda ("渓ambdas"? son una forma sencilla de crear funciones ad-hoc (para un fin determinado). Las lambdas se pueden denotar de forma muy concisa en muchos casos gracias a la inferencia de tipos y la variable `it` impl ícita.

```kotlin
fun main() {
   // Declarando una lambda
   val myLambda: (String) -> Int =
        { valor -> valor.length }

    // Podemos usar it, pero si tenemos dos nos podemos confundir
    val myLambda2: (String) -> Int =
        { it.length }

    // LLamando las lambdas
    println(myLambda("Hola Mundo"))
    println(myLambda2("Hola Mundo"))

    val saludos = listOf("Hello", "Hola", "Ciau")
    
    // De esta manera no tenemos que especificar el parámetro que recibe la lambda
    val longitudSaludos = saludos.map(myLambda2)
    println(longitudSaludos)
}
```

## ****High Order functions****

Una de las caracter ísticas del paradigma de la programación funcional son las funciones de orden superior.

Las funciones de orden superior son funciones que pueden recibir como parámetros otras funciones y/o devolverlas como resultados.

```kotlin
fun main() {
    val largoDelValorInicial = superFuncion(valorInicial = "Hola!") { valor ->
        valor.length
    }
    println(largoDelValorInicial)

    val lambda = funtionInception("Matias")
    val valorlambda = lambda()
    println(valorlambda)
}

//recibos una lambda como parámetro
fun superFuncion(valorInicial: String, block: (String) -> Int): Int {
    return block(valorInicial)
}

// si queremos devolver una lambda
fun funtionInception(nombre: String): () -> String {
    return {
        "Hola desde la la Lambda $nombre"
    }
}
```

# **Scope functions**

## ****Let****

`?.let` nos permite correr el código para un valor que no es nulo, es decir, solo se ejecuta esta porción de código cuando la variable no es null.

```kotlin
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
```

## ****With****

La función **`with**` nos ayuda a acceder directamente a las propiedades de la variable o a la misma variable utilizando `this`.

```kotlin
fun main() {
    val colores = listOf("Azul", "Amarillo", "Rojo", "Verde")
    with(colores){
        println("Nuestros colores son: $this")
        println("Esta lista tiene una cantidad de $size")
    }
}
```

## ****Run****

Nos permite ejecutar una serie de operaciones después de declarar una variable:

```kotlin
fun main() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Xiomi mi a3")
        .run {
            removeIf { movil -> movil.contains("Google") }
        }
    println(moviles)
}
```

[Run - Funciones Estándar - Kotlin para Android en Espa帽ol](https://kotlin.desarrollador-android.com/modismos-y-patrones/funciones-estandar/run/)

## ****Apply****

Permite realizar operaciones sobre una variable y luego devolver el valor. Permite convertir los tipos nullables a tipos no nullables.

```kotlin
fun main() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Xiomi mi a3")
        .apply {
            removeIf { movil -> movil.contains("Google") }
        }
    println(moviles)

    //si asignamos un null, no se ejecuta el codigo dentro de apply
    val colores :MutableList<String>? = mutableListOf("Amarillo", "Azul")
    colores?.apply {
        println("Nuestros colores son $this")
        println("La cantidad de colores es: $size")
    }
}
```

## ****Also****

Permite obtener una variable, luego ejecutar un código con esa variable y finalmente retornarla como parámetro para que pueda ser usada por una función mas adelante.

Esta devuelve `it`, las anteriores devolv ían `this`.

```kotlin
fun main() {
    val moviles = mutableListOf("Google Pixel 2XL", "Google Pixel 4a", "Xiomi mi a3")
        .also { lista -> println("El valor original de la lista es $lista") }
        .asReversed()
    println(moviles)

}
```

`apply` y `also` devuelve el objeto contexto directamente.

`let`, `run`, y `with` retorna el último valor de la lambda.

# **Proyecto: Bola 8 mágica**

## ****Creando el menú de nuestra bola mágica****

# Otra documentación

[Curso programación Android en Kotlin - Curso Kotlin Para ANDROID](https://cursokotlin.com/curso-programacion-kotlin-android/)