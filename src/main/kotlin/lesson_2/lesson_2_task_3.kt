package lesson_2

fun main(){
    val workers = 50
    val intern = 30
    val salaryWorkers = 30000
    val salaryIntern = 20000
    val totalSalaryWorkers = (workers * salaryWorkers)
    val totalSalaryIntern = (intern * salaryIntern)
    val totalSalaryExpenses = (totalSalaryWorkers + totalSalaryIntern)
    val averageEmployeesSalary = totalSalaryExpenses / (intern + workers)

    println(totalSalaryWorkers)
    println(totalSalaryExpenses)
    println(averageEmployeesSalary)
}