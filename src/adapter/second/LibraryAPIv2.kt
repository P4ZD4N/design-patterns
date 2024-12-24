package adapter.second

import java.time.LocalDate

interface LibraryAPIv2 {
    fun numberOfAvailableCopies(bookTitle: String): Int
    fun dueDate(bookTitle: String, firstName: String, lastName: String, dateOfBirth: LocalDate): LocalDate
    fun reserve(bookTitle: String, firstName: String, lastName: String, dateOfBirth: LocalDate): Boolean
}