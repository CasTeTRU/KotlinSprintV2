package org.example.lesson_4

fun main() {
    val isWeatherSunny:Boolean = true
    val isTentOpen:Boolean = true
    val airHumidity:Int = 20
    val yearSeason:String = "зима"
    println("Благоприятные ли условия сейчас для роста бобовых?:" +
            " ${isWeatherSunny && isTentOpen && airHumidity == 20 && yearSeason !== "зима"}")
}