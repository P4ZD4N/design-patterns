package flyweight.third

class Birch(val x: Int, val y: Int) : Tree {
    val properties: TreeProperties = TreePropertiesRepository.getBirchProperties()
}