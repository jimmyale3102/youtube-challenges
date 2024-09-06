package dev.alejo.youtubechallenges

/*
 * Escribe un programa que muestre por consola (con un print) los
 * números de 1 a 100 (ambos incluidos y con un salto de línea entre
 * cada impresión), sustituyendo los siguientes:
 * - Múltiplos de 3 por la palabra "fizz".
 * - Múltiplos de 5 por la palabra "buzz".
 * - Múltiplos de 3 y de 5 a la vez por la palabra "fizzbuzz".
 */

fun main() {
    printFizzBuzz()
}

private fun printFizzBuzz() {
    (1..100).forEach { number ->
        when {
            number.isMultipleOfThree() && number.isMultipleOfFive() -> {
                print("fizzbuzz")
            }
            number.isMultipleOfFive() -> {
                print("buzz")
            }
            number.isMultipleOfThree() -> {
                print("fizz")
            }
            else -> {
                print(number)
            }
        }
        println()
    }
}

fun Int.isMultipleOfThree() = this % 3 == 0

fun Int.isMultipleOfFive() = this % 5 == 0