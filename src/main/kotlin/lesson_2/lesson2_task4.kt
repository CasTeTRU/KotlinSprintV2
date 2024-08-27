package org.example.lesson_2
const val OVERALL_PERCENT = 100

fun main() {
    val crystalOre: Short = 7
    val ironOre:Short = 11
    val buffAmountInPercent = 20

    println("Кристаллической руды под баффом добыто дополнительно: "
            +  (crystalOre * buffAmountInPercent / OVERALL_PERCENT))
    println("Железной руды под баффом добыто дополнительно: "
            +  (ironOre * buffAmountInPercent / OVERALL_PERCENT))
}
