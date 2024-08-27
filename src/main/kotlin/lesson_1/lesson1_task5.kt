package org.example.lesson_1

fun main() {
    val secondsInSpace = 6480
    val secondsInHour = 3600
    val secondsInMinute = 60

    val hoursInSpace = secondsInSpace / secondsInHour
    val minutesLeft = secondsInSpace % secondsInHour / secondsInMinute
    val secondsLeft = secondsInSpace % secondsInMinute
    println("%02d:%02d:%02d".format(hoursInSpace, minutesLeft, secondsLeft))
}