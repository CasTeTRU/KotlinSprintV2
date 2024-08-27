package org.example.lesson_5

fun main() {
    val currentYear = 2024
    println("Введи год своего рождения:")
    val yearOfBirth = readLine()!!.toInt()
    val resultText = if (currentYear - yearOfBirth >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else ""
    println(resultText)
}

const val AGE_OF_MAJORITY = 18