package org.example.lesson_2

fun main() {
    val employeeAmount = 50
    val employeeSalary = 30000
    val internAmount = 30
    val internSalary = 20000

    val employeeSalaryBudget = employeeAmount * employeeSalary  //Расходы на выплату зарплаты постоянных сотрудников

    val overallSalaryBudget = employeeSalaryBudget + (internAmount * internSalary) //Общие расходы по ЗП после прихода стажеров

    val mediumSalary = overallSalaryBudget / (employeeAmount + internAmount) //Средняя ЗП одного сотрудника после устройства стажеров

    println(employeeSalaryBudget)
    println(overallSalaryBudget)
    println(mediumSalary)

}
