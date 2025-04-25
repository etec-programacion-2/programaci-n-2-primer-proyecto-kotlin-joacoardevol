package org.example

fun main() {
    println("Joaco Ardevol y hoy es 22 de abril de 2025")
    println("Hello Kotlin")
    
    tiposDeDatos()
    calcularAreaRectangulo()

    // Ejemplo de uso de las nuevas funciones
    val numero = 7
    println("El número $numero es: ${esParOImpar(numero)}")
    
    val otroNumero = -5
    println("El número $otroNumero es: ${determinarSigno(otroNumero)}")

    // Mostrar los números pares del 2 al 20 usando los tres tipos de loops
    mostrarNumerosPares()
}

fun tiposDeDatos() {
    val nombre: String = "Joaco"
    val edad: Int = 16
    val altura: Double = 1.75
    val esEstudiante: Boolean = true
    
    println("Nombre: $nombre")
    println("Edad: $edad")
    println("Altura: $altura")
    println("Es estudiante: $esEstudiante")
}

fun calcularAreaRectangulo() {
    val base: Double = 5.0
    val altura: Double = 3.0
    val area: Double = base * altura
    
    println("Base: $base")
    println("Altura: $altura")
    println("Área del rectángulo: $area")
}

// Función para determinar si un número es par o impar
fun esParOImpar(numero: Int): String {
    return if (numero % 2 == 0) "Par" else "Impar"
}

// Función para determinar si un número es positivo, negativo o cero
fun determinarSigno(numero: Int): String {
    return when {
        numero > 0 -> "Positivo"
        numero < 0 -> "Negativo"
        else -> "Cero"
    }
}

// Función que muestra los números pares del 2 al 20 usando diferentes tipos de loops
fun mostrarNumerosPares() {
    // Usando un loop 'for'
    println("Usando loop for:")
    for (i in 2..20 step 2) {  // 'step 2' incrementa de 2 en 2
        print("$i ")
    }
    println()

    // Usando un loop 'while'
    println("Usando loop while:")
    var i = 2
    while (i <= 20) {
        print("$i ")
        i += 2
    }
    println()

    // Usando un loop 'do-while' (simulado)
    println("Usando loop do-while:")
    i = 2
    do {
        print("$i ")
        i += 2
    } while (i <= 20)
    println()
}
