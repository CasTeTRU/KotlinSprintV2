package org.example.lesson_2

fun main() {
    val crystalOre: Short = 7
    val ironOre:Short = 11
    val buffAmount = 0.2
    println("Кристаллической руды под баффом добыто дополнительно: " +  (crystalOre * buffAmount).toInt())
    println("Железной руды под баффом добыто дополнительно: " +  (ironOre * buffAmount).toInt())
}
