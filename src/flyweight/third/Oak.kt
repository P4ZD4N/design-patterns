package flyweight.third

class Oak(val x: Int, val y: Int) : Tree {
    val properties: TreeProperties = TreePropertiesRepository.getOakProperties()
}