package builder.third

class FlightLeg private constructor(flightLegBuilder: FlightLegBuilder) {

    private var from: String = ""
    private var to: String = ""
    private var delayed: Boolean = true
    private var price: Double = 0.0

    init {
        from = flightLegBuilder.from
        to = flightLegBuilder.to
        delayed = flightLegBuilder.delayed
        price = flightLegBuilder.price
    }

    companion object {

        class FlightLegBuilder {
            var from: String = ""
            var to: String = ""
            var delayed: Boolean = true
            var price: Double = 0.0

            fun from(from: String): FlightLegBuilder {
                this.from = from;
                return this;
            }

            fun to(to: String): FlightLegBuilder {
                this.to = to;
                return this;
            }

            fun delayed(delayed: Boolean): FlightLegBuilder {
                this.delayed = delayed;
                return this;
            }

            fun price(price: Double): FlightLegBuilder {
                this.price = price;
                return this;
            }

            fun build(): FlightLeg {
                if (from.isEmpty() || to.isEmpty()) throw IllegalArgumentException("From and To fields must be provided.")
                if (price <= 0) throw IllegalArgumentException("Price must be greater than 0.")
                return FlightLeg(this)
            }
        }
    }

    override fun toString(): String {
        return "FlightLeg(from='$from', to='$to', delayed='$delayed', price='$price')"
    }
}