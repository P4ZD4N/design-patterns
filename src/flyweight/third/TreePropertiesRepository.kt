package flyweight.third

class TreePropertiesRepository private constructor() {

    companion object {
        private val oakProperties = TreeProperties("Oak", "Green", TreeSize.BIG)
        private val birchProperties = TreeProperties("Birch", "Green", TreeSize.MEDIUM)
        private val mapleProperties = TreeProperties("Maple", "Red", TreeSize.MEDIUM)

        fun getOakProperties(): TreeProperties {
            return oakProperties
        }

        fun getBirchProperties(): TreeProperties {
            return birchProperties
        }

        fun getMapleProperties(): TreeProperties {
            return mapleProperties
        }
    }
}