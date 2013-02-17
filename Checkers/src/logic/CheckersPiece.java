package logic;

import java.awt.Point;

public class CheckersPiece implements PieceInterface{

	private CheckersValidMoves pieceMoves;
	private Point positionOnBoard;
	private int owner;

	
	public CheckersPiece(Point startPoint, int owner)
	{
		this.owner = owner;
		pieceMoves = new CheckersValidMoves(owner);
	}
	
	@Override
	public Point getPosition() {
		return positionOnBoard.getLocation();
	}

	@Override
	public int getOwnerColor() {	//1 = white, -1 = black
		return owner;
	}

	@Override
	public boolean isMoveOk(int move) {
		return pieceMoves.has(move);
	}

}
