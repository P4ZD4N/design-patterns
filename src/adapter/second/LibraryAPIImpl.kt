package adapter.second

import java.time.LocalDate

class LibraryAPIImpl : LibraryAPI {
    override fun isAvailable(bookTitle: String): Boolean {
        println("Checking availability...")
        return true
    }

    override fun dueDate(bookTitle: String, pesel: String): LocalDate {
        println("Checking due date for ${bookTitle}...")
        return LocalDate.now()
    }

    override fun reserve(bookTitle: String, pesel: String): Boolean {
        println("Reserving...")
        return true
    }
}