package flyweight.third

fun main() {

    val trees: MutableList<Tree> = mutableListOf()

    var temp = 0
    for (i in 0..10_000_000) {
        trees.add(Oak(temp++, temp++))
        trees.add(Birch(temp++, temp++))
        trees.add(Maple(temp++, temp++))
    }

    val oak1 = trees[0] as Oak
    val oak2 = trees[3] as Oak

    println("Oak1 coordinates: (${oak1.x}, ${oak1.y})")
    println("Oak2 coordinates: (${oak2.x}, ${oak2.y})")
    println("Oak1 properties == Oak2 properties: ${oak1.properties == oak2.properties}")
    println()

    val birch1 = trees[1] as Birch
    val birch2 = trees[4] as Birch

    println("Birch1 coordinates: (${birch1.x}, ${birch1.y})")
    println("Birch2 coordinates: (${birch2.x}, ${birch2.y})")
    println("Birch1 properties == Birch2 properties: ${birch1.properties == birch2.properties}")
    println()

    val maple1 = trees[2] as Maple
    val maple2 = trees[5] as Maple

    println("Maple1 coordinates: (${maple1.x}, ${maple1.y})")
    println("Maple2 coordinates: (${maple2.x}, ${maple2.y})")
    println("Maple1 properties == Maple2 properties: ${maple1.properties == maple2.properties}")
}