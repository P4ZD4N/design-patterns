package strategy.second

class RegularPrice : PricingStrategy {

    override fun calculatePrice(price: Int, isSignedUpForNewsletter: Boolean) {

        if (isSignedUpForNewsletter) {
            println("User is signed up to newsletter! Change pricing strategy!")
        } else {
            println("Normal price: $price")
        }
    }
}