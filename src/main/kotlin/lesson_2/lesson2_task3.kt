package org.example.lesson_2
const val MINUTES_IN_HOUR = 60

fun main() {
    val departureHour: Short = 9
    val departureMinute: Short = 39
    val travelTime: Short = 457

    val arrivalHour: Int = (departureHour * MINUTES_IN_HOUR + departureMinute + travelTime) / MINUTES_IN_HOUR
    val arrivalMinute: Int = (departureHour * MINUTES_IN_HOUR + departureMinute + travelTime) % MINUTES_IN_HOUR

    println("%02d:%02d".format(arrivalHour, arrivalMinute))
}
