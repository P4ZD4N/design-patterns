package adapter.second

fun main() {
    val user = User("Wiktor", "Chudy", "32131212")
    val libraryAPIv2 = LibraryAPIv2Impl()
    val apiAdapter = APIAdapter(libraryAPIv2, user)
    val connector = BookConnector(user, apiAdapter)
    connector.checkAvailability("Harry Potter i Zakon Feniksa")
}