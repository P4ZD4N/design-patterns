package adapter.second

import java.time.LocalDate

class User(val firstName: String, val lastName: String, val pesel: String) {
    val dateOfBirth: LocalDate = LocalDate.now()
}