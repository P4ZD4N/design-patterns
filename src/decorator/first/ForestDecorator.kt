package decorator.first

class ForestDecorator(private val decoratedTerrain: Terrain) : TerrainDecorator(decoratedTerrain) {

    override fun getFuelCost(): Int {
        return decoratedTerrain.getFuelCost() + 5
    }
}