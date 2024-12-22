package flyweight.second

class WhitePiece(
    name: String,
    numberPosition: String,
    letterPosition: String
) : ChessPiece(name, numberPosition, letterPosition, PawnColor.WHITE)
