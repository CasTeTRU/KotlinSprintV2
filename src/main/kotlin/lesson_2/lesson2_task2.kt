package org.example.lesson_2

fun main() {
    val employeeAmount = 50
    val employeeSalary = 30000
    val internAmount = 30
    val internSalary = 20000
    val employeeSalaryBudget = employeeAmount * employeeSalary
    val overallSalaryBudget = employeeSalaryBudget + (internAmount * internSalary)
    val mediumSalary = overallSalaryBudget / (employeeAmount + internAmount)

    println("$employeeSalaryBudget" +
            "\n$overallSalaryBudget" +
            "\n$mediumSalary")
}
