package org.example.lesson_4

fun main() {
    val totalAmountOfTables = 13
    val reservedTablesToday = 13
    val reservedTablesTomorrow = 9

    println("[Доступность столиков на сегодня: ${reservedTablesToday < totalAmountOfTables}]" +
            "\n[Доступность столиков на завтра: ${reservedTablesTomorrow < totalAmountOfTables}]")
}