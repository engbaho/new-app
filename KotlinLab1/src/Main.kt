public fun main() {
    val charbel=Student(name="charbel" ,id=101,gpa = null)
    val joe=Student(name="joe" ,id=111,gpa = 4.0)
    val lynn=Student(name="lynn" ,id=121,gpa = 1.6)
    val students = listOf(charbel, joe, lynn)
    val averageGpa = AverageCalculator.calculateAverage(students)
    println("Average GPA: $averageGpa")

}