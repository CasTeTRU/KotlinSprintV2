package org.example.lesson_5

fun main() {
    val userName = "Zaphod"
    val userPassword = "PanGalactic"

    println("Введите имя пользователя:")
    val spokenUserName = readLine().toString()

    if (spokenUserName == userName) {
        println("Введите пароль:")
        val spokenUserPassword = readLine().toString()

        if (spokenUserPassword == userPassword) {
            println("Добро пожаловать в систему!")
        } else {
            println("Некорректный пароль!")
        }
    } else {
        println("Пользователь не найден. Пройдите процедуру регистрации!")
    }
}
