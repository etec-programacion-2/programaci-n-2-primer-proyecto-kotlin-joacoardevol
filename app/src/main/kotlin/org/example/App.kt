package org.example

fun main() {
    println("Joaco Ardevol y hoy es 22 de abril de 2025")
    println("Hello Kotlin")

    // Mostrar los tipos de datos y el área del rectángulo
    mostrarTiposDeDatos()
    calcularAreaRectangulo()

    // Ejemplo de uso de las nuevas funciones
    val numero = 7
    println("El número $numero es: ${esParOImpar(numero)}")

    val otroNumero = -5
    println("El número $otroNumero es: ${determinarSigno(otroNumero)}")

    // Comprobamos varios números
    esParOImpar(7)
    esParOImpar(12)
    esParOImpar(50)
    esParOImpar(-3)
    esParOImpar(0)

    // Determinamos el tipo de número
    println("${determinarTipoDeNumero(5)}")
    println(determinarTipoDeNumero(-3))
    println(determinarTipoDeNumero(0))

    // Mostrar los números del 1 al 10 usando los tres tipos de loops
    mostrarNumerosConFor()
    println()
    mostrarNumerosConWhile()
    println()
    mostrarNumerosConDoWhile()
}

fun mostrarTiposDeDatos() {
    val nombre: String = "Dano"
    val edad: Int = 16
    val altura: Double = 1.75
    val esEstudiante: Boolean = true

    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $esEstudiante")
}

fun calcularAreaRectangulo() {
    val ancho = 25
    val alto = 5
    val area = ancho * alto
    println("El ancho del rectángulo es $ancho, su altura es $alto y su área es $area")
}

// Función para determinar si un número es par o impar
fun esParOImpar(numero: Int) {
    when (numero % 2) {
        0 -> println("El número $numero es par")
        else -> println("El número $numero es impar")
    }
}

// Función para determinar si un número es positivo, negativo o cero
fun determinarSigno(numero: Int): String {
    return when {
        numero > 0 -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Cero"
    }
}

// Función para determinar si un número es positivo, negativo o cero
fun determinarTipoDeNumero(numero: Int): String {
    return when {
        numero > 0 -> "El número es positivo"
        numero < 0 -> "El número es negativo"
        else -> "El número es cero"
    }
}

// Función que muestra los números del 1 al 10 usando un loop 'for'
fun mostrarNumerosConFor() {
    println("Números del 1 al 10 usando for:")
    for (i in 1..10) {
        println(i)
    }
}

// Función que muestra los números del 1 al 10 usando un loop 'while'
fun mostrarNumerosConWhile() {
    println("Números del 1 al 10 usando while:")
    var i = 1
    while (i <= 10) {
        println(i)
        i++
    }
}

// Función que muestra los números del 1 al 10 usando un loop 'do-while'
fun mostrarNumerosConDoWhile() {
    println("Números del 1 al 10 usando do-while:")
    var i = 1
    do {
        println(i)
        i++
    } while (i <= 10)
}
