public class Pawn extends ChessPiece {
	public Pawn(int team) {
		super(team);
	}
	
	public String getSymbol() {
		return (getTeam() == ChessPiece.WHITE ? "W" : "B") + "P";
	}

	public boolean moveAllowed(int rank, int file) {
		if(getTeam() == ChessPiece.WHITE) {
			return file == 0 && rank == 1;
		}
		
		else {
			return file == 0 && rank == -1;
		}
	}
}