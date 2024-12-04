package org.example.lesson_5
const val AGE_OF_MAJORITY = 18
const val CURRENT_YEAR = 2024

fun main() {
    println("Введи год своего рождения:")
    val yearOfBirth = readln().toInt()

    val resultText = if (CURRENT_YEAR - yearOfBirth >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else return

    println(resultText)
}