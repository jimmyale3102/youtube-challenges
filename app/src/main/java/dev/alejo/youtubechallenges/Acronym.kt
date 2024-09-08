package dev.alejo.youtubechallenges

/**
 * Acronym
 *
 * Convert a phrase to its acronym.
 * Techies love their TLA (Three Letter Acronyms)!
 * Help generate some jargon by writing a program that converts a long name like Portable
 * Network Graphics to its acronym (PNG).
 * Punctuation is handled as follows: hyphens are word separators (like whitespace); all other
 * punctuation can be removed from the input.
 * For example:
 *
 * As Soon As Possible	-> ASAP
 * Liquid-crystal display -> LCD
 * Thank George It's Friday! -> TGIF
 */

fun main() {
    val acronym = Acronym.getAcronym("Suscribete si te gusta")
    print(acronym)
}

object Acronym {
    fun getAcronym(phrase: String): String = phrase
        .split(" ", "-", "_")
        .filter { it.isNotBlank() }
        .joinToString("")
        { it[0].uppercase() }
}