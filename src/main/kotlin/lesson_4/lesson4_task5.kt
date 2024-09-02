package org.example.lesson_4

fun main() {
    val minCrewNumber = 55
    val optimalCrewNumber = 70
    val minProvisionBoxes = 50

    println("Корабль имеет повреждения? Отвечай: true/false")
    val isShipDamaged:Boolean = readln().toBoolean()
    println("Введи число членов экипажа:")
    val crewNumber:Int = readln().toInt()
    println("Введи число ящиков провизии на борту:")
    val provisionBoxes = readln().toInt()
    println("Погода благоприятная? Отвечай: true/false")
    val isWeatherIsGood = readln().toBoolean()

    val isShipReady = (!isShipDamaged && crewNumber in minCrewNumber .. optimalCrewNumber && provisionBoxes > minProvisionBoxes)
                       || (isShipDamaged && crewNumber == optimalCrewNumber && provisionBoxes >= minProvisionBoxes && isWeatherIsGood)
    println("Корабль готов к плаванию : $isShipReady")
}