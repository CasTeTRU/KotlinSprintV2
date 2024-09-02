package org.example.lesson_5

fun main() {
    val firstWinningNumber = 0
    val secondWinningNumber = 42

    println("Угадай первое число:")
    val firstGuessedNumber = readLine()!!.toInt()
    println("Угадай второе число:")
    val secondGuessedNumber = readLine()!!.toInt()

    if ((firstGuessedNumber == firstWinningNumber || firstGuessedNumber == secondWinningNumber)
        && (secondGuessedNumber == secondWinningNumber || secondGuessedNumber == firstWinningNumber)){
        println("Поздравляем! Вы выиграли главный приз!") }
    else if ((firstGuessedNumber == firstWinningNumber || firstGuessedNumber == secondWinningNumber)
            || (secondGuessedNumber == secondWinningNumber || secondGuessedNumber == firstWinningNumber)){
        println("Вы выиграли утешительный приз!")}
    else {
        println("Неудача!")
    }

    println("Загаданные числа были $firstWinningNumber и $secondWinningNumber")
}

