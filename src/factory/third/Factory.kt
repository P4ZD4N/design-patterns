package factory.third

interface Factory {
    fun buildBMW(bmwModel: BMWModel): Car
    fun buildFord(fordModel: FordModel): Car
}