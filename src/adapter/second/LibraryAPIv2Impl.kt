package adapter.second

import java.time.LocalDate

class LibraryAPIv2Impl : LibraryAPIv2 {
    override fun numberOfAvailableCopies(bookTitle: String): Int {
        println("Checking number of available copies...")
        return 3
    }

    override fun dueDate(bookTitle: String, firstName: String, lastName: String, dateOfBirth: LocalDate): LocalDate {
        println("Checking due date for ${bookTitle}...")
        return LocalDate.now()
    }

    override fun reserve(bookTitle: String, firstName: String, lastName: String, dateOfBirth: LocalDate): Boolean {
        println("Reserving...")
        return true
    }
}