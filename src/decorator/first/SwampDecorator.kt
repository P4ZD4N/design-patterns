package decorator.first

class SwampDecorator(private val decoratedTerrain: Terrain) : TerrainDecorator(decoratedTerrain) {

    override fun getFuelCost(): Int {
        return decoratedTerrain.getFuelCost() + 15
    }
}