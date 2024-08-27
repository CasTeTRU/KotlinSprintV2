package org.example.lesson_5

fun main() {
    val winningNumbers = (1..3).map { (0..42).random() }.toSet()

    println("Введи первое число:")
    val firstGuessedNumbers = readLine()!!.toInt()
    println("Введи второе число:")
    val secondGuessedNumbers = readLine()!!.toInt()
    println("Введи третье число:")
    val thirdGuessedNumbers = readLine()!!.toInt()

    val guessedNumbers = setOf (firstGuessedNumbers, secondGuessedNumbers, thirdGuessedNumbers)

    val numberOfRightGuesses = winningNumbers.intersect(guessedNumbers).size

    val outputText = when (numberOfRightGuesses) {
        3 -> "Вы угадали все числа и выиграли джекпот"
        2 -> "Вы угадали два числа и получаете крупный приз"
        1 -> "Вы угадали одно число и получаете утешительный приз"
        else -> "Вы не угадали ни одного числа"
    }
    println("$outputText\nВыигрышные числа: $winningNumbers")
}
