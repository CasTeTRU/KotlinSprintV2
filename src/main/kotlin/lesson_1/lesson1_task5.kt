package org.example.lesson_1

import java.text.DecimalFormat

fun main() {
    val secondsInSpace = 6480
    val secondsInHour = 3600
    val secondsInMinute = 60
    val hoursInSpace = String.format("%02d", secondsInSpace / secondsInHour)
    val minutesLeft = String.format("%02d", secondsInSpace % secondsInHour / secondsInMinute)
    val secondsLeft = String.format("%02d", secondsInSpace % secondsInMinute)
    println("$hoursInSpace:$minutesLeft:$secondsLeft")
}