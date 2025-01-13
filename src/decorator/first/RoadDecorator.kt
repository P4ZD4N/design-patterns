package decorator.first

class RoadDecorator(private val decoratedTerrain: Terrain) : TerrainDecorator(decoratedTerrain) {

    override fun getFuelCost(): Int {
        return decoratedTerrain.getFuelCost() + 15
    }

    override fun getDescription(): String {
        return decoratedTerrain.getDescription() + " through which road runs"
    }
}