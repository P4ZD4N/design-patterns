package adapter.second

import java.time.LocalDate

class BookConnector(val user: User, val api: LibraryAPI) {

    fun checkAvailability(title: String): Boolean {
        return api.isAvailable(title)
    }

    fun reserve(title: String, user: User): Boolean {
        return api.reserve(title, user.pesel)
    }

    fun whenToReturn(title: String, user: User): LocalDate {
        return api.dueDate(title, user.pesel)
    }
}