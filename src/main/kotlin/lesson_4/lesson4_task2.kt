package org.example.lesson_4
const val MIN_CARGO_WEIGHT = 35
const val MAX_CARGO_WEIGHT = 100
const val MAX_CARGO_VOLUME = 100

fun main() {
    var cargoWeight = 20
    var cargoVolume = 80
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average':" +
            " ${MIN_CARGO_WEIGHT < cargoWeight && cargoWeight <= MAX_CARGO_WEIGHT && cargoVolume < MAX_CARGO_VOLUME}")

    cargoWeight = 50
    cargoVolume = 100
    println("Груз с весом $cargoWeight кг и объемом $cargoVolume л соответствует категории 'Average':" +
            " ${MIN_CARGO_WEIGHT < cargoWeight && cargoWeight <= MAX_CARGO_WEIGHT && cargoVolume < MAX_CARGO_VOLUME}")
}