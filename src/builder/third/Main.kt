package builder.third

fun main() {
    val leg: FlightLeg = FlightLeg.Companion.FlightLegBuilder()
        .from("Las Vegas")
        .to("Los Angeles")
        .price(50.0)
        .delayed(true)
        .build()

    println(leg)
}