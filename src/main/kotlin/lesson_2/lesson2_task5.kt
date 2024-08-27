package org.example.lesson_2

import kotlin.math.pow

fun main() {
    val depositAmount = 70000
    val interestRate = 16.7
    val depositInYears = 20

    val depositFinalAmount = depositAmount * (1 + interestRate / 100 ).pow(depositInYears)
    println("%.3f".format(depositFinalAmount))
}
