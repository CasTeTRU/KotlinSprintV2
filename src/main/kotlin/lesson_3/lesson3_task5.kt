package org.example.lesson_3

fun main() {
    val recievedChessMove = "D2-D4;0"

    val convertedDataToList: List<String> = recievedChessMove.split("-", ";")
    val startingSquare = convertedDataToList[0]
    val endingSquare = convertedDataToList[1]
    val turnNumber = convertedDataToList[2]

    println("Стартовая клетка: $startingSquare\n" +
            "Конечная клетка: $endingSquare\n" +
            "Номер хода: $turnNumber")
}
