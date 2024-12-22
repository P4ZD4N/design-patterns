package flyweight.second

abstract class ChessPiece(
    val name: String,
    val numberPosition: String,
    val letterPosition: String,
    private val desiredColor: PawnColor
) {
    private val color: Color = when (desiredColor) {
        PawnColor.BLACK -> {
            ColorRepository.black
        }

        PawnColor.WHITE -> {
            ColorRepository.white
        }
    }

    fun getColor(): Color {
        return color
    }
}