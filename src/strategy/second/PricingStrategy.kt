package strategy.second

interface PricingStrategy {

    fun calculatePrice(price: Int, isSignedUpForNewsletter: Boolean)
}