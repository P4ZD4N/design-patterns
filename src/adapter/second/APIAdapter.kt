package adapter.second

import java.time.LocalDate

class APIAdapter(private val libraryAPIv2: LibraryAPIv2, private val user: User) : LibraryAPI {
    override fun isAvailable(bookTitle: String): Boolean {
        return libraryAPIv2.numberOfAvailableCopies(bookTitle) > 0
    }

    override fun dueDate(bookTitle: String, pesel: String): LocalDate {
        return libraryAPIv2.dueDate(bookTitle, user.firstName, user.lastName, user.dateOfBirth)
    }

    override fun reserve(bookTitle: String, pesel: String): Boolean {
        return libraryAPIv2.reserve(bookTitle, user.firstName, user.lastName, user.dateOfBirth)
    }
}