package org.example.lesson_1

fun main() {
    val year = 1961
    var hour = 9
    var minute = 7


    // Используем padStart чтобы выводить 09, а не 9.
    // Иначе не даёт присваивать нули в начале целочисленных переменных

    println("$year " +
            "\n${hour.toString().padStart(2, '0')} " +
            "\n${minute.toString().padStart(2, '0')} ")

    hour = 10
    minute = 55

    println("$hour:$minute")
}