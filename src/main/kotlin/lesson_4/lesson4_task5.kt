package org.example.lesson_4

fun main() {
    println("Корабль имеет повреждения? Отвечай: true/false")
    var isShipDamaged:Boolean = readln().toBoolean()
    println("Введи число членов экипажа:")
    var crewNumber:Int = readln().toInt()
    println("Введи число ящиков провизии на борту:")
    var provisionBoxes = readln().toInt()
    println("Погода благоприятная? Отвечай: true/false")
    var isWeatherIsGood = readln().toBoolean()
    println("$isShipDamaged,$crewNumber,$provisionBoxes,$isWeatherIsGood")

    val isShipReady = !isShipDamaged && (55 <= crewNumber <= 70) && provisionBoxes > 50 && $isWeatherIsGood
    println()
}