package org.example.lesson_1

fun main() {

    val secondsInSpace = 6489
    val hoursInSpace = secondsInSpace / 3600        //целые часы
    val minutesLeft = secondsInSpace % 3600 / 60    //остаток минут
    val secondsLeft = secondsInSpace % 60           //остаток секунд

//Отображаем часы,минуты,секунды двумя цифрами
   println("${hoursInSpace.toString().padStart(2, '0')}:${minutesLeft.toString().padStart(2, '0')}:${secondsLeft.toString().padStart(2, '0')}")
}