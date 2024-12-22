package flyweight.second

fun main() {
    val blackPawn: ChessPiece = BlackPiece("Black Pawn", "7", "a")
    val whitePawn: ChessPiece = WhitePiece("White Pawn", "2", "a")
    val blackQueen: ChessPiece = BlackQueen("Black Queen")
    val whiteQueen: ChessPiece = WhiteQueen("White Queen")

    println(blackPawn.getColor() === blackQueen.getColor())
    println(whitePawn.getColor() === whiteQueen.getColor())
}