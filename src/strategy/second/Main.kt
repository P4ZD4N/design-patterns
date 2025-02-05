package strategy.second

fun main() {
    val priceCalculator = PriceCalculator()

    priceCalculator.pricingStrategy = RegularPrice()
    priceCalculator.calculate(100, false)

    priceCalculator.pricingStrategy = RegularPrice()
    priceCalculator.calculate(100, true)

    priceCalculator.pricingStrategy = SalePrice()
    priceCalculator.calculate(100, true)

    priceCalculator.pricingStrategy = SalePrice()
    priceCalculator.calculate(100, false)
}