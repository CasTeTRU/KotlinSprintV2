package org.example.lesson_2

fun main() {
    val firstPupilScore = 3.0
    val secondPupilScore = 4.0
    val thirdPupilScore = 3.0
    val fourthPupilScore = 5.0
    val numberOfPupils = 4

    val averageScore: Double = (firstPupilScore + secondPupilScore
            + thirdPupilScore + fourthPupilScore) / numberOfPupils

    println(averageScore)
}