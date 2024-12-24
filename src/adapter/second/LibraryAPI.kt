package adapter.second

import java.time.LocalDate

interface LibraryAPI {
    fun isAvailable(bookTitle: String): Boolean
    fun dueDate(bookTitle: String, pesel: String): LocalDate
    fun reserve(bookTitle: String, pesel: String): Boolean
}