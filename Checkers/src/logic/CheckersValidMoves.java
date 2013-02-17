package logic;

public class CheckersValidMoves {
	private int[] moves = {MoveOptions.oneUp_oneRight,MoveOptions.oneUp_oneLeft};
	
	public CheckersValidMoves(int owner)	//owner is 1 or -1. this constructor changes moves directions
	{
		for(int i=0;i<moves.length;i++)
			moves[i]=moves[i]*owner;
	}

	public boolean has(int move) {
		for(int i=0;i<moves.length;i++)
			if(moves[i]==move)
				return true;
		return false;
	}
}
