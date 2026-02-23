object AverageCalculator {
    fun calculateAverage(students: List<Student>): Double {
        val gpas=students.mapNotNull {it.gpa}
        if (gpas.isEmpty()) return 0.0
        return gpas.average()

    }
}