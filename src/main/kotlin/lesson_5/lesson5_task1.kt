package org.example.lesson_5

fun main() {
    println("Решите пример 2+2:")
    val answer = readln().toInt()
    if (answer == 4) {
        println("Добро пожаловать!")
    } else {
        println("Вход воспрещён!")
    }
}
