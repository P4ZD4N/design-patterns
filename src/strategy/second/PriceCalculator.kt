package strategy.second

class PriceCalculator {

    lateinit var pricingStrategy: PricingStrategy

    fun calculate(price: Int, isSignedUpForNewsletter: Boolean) {
        pricingStrategy.calculatePrice(price, isSignedUpForNewsletter)
    }
}