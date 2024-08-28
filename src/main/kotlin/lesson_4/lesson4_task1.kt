package org.example.lesson_4
const val TOTAL_AMOUNT_OF_TABLES = 13

fun main() {
      val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    println("[Доступность столиков на сегодня: ${reservedTablesToday < TOTAL_AMOUNT_OF_TABLES}]" +
            "\n[Доступность столиков на завтра: ${reservedTablesTomorrow < TOTAL_AMOUNT_OF_TABLES}]")
}