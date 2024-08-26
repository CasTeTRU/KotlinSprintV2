package org.example.lesson_4

fun main() {
    var cargoWeight = 20
    var cargoVolume = 80
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average':" +
            " ${35 < cargoWeight && cargoWeight <= 100 && cargoVolume < 100}")

    cargoWeight = 50
    cargoVolume = 100
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average':" +
            " ${35 < cargoWeight && cargoWeight <= 100 && cargoVolume < 100}")
}