package strategy.second

class SalePrice : PricingStrategy {

    override fun calculatePrice(price: Int, isSignedUpForNewsletter: Boolean) {

        if (isSignedUpForNewsletter) {
            println("Price with sale: ${price / 2}")
        } else {
            println("User is not signed up to newsletter! Change pricing strategy!")
        }
    }
}