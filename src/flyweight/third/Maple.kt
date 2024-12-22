package flyweight.third

class Maple(val x: Int, val y: Int) : Tree {
    val properties: TreeProperties = TreePropertiesRepository.getMapleProperties()
}