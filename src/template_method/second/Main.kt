package template_method.second

fun main() {

    val myTypicalWeekDay = MyTypicalWeekDay()
    val myFriendDay = MyFriendTypicalWeekDay()

    println("My day:")
    myTypicalWeekDay.everyDayIsExactlyTheSame(TypeOfTransport.CAR)

    println()
    println("My friend's day: ")
    myFriendDay.everyDayIsExactlyTheSame(TypeOfTransport.TRAM)
}