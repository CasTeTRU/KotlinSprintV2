package org.example.lesson_2

fun main() {
    val departureHour: Short = 9
    val departureMinute: Short = 39
    val travelTime: Short = 457

    val arrivalHour: Int = (departureHour * 60 + departureMinute + travelTime) / 60
    val arrivalMinute: Int = (departureHour * 60 + departureMinute + travelTime) % 60

    println("$arrivalHour:$arrivalMinute")
}
