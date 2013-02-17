package logic;

import java.awt.Point;

public class MovesTranslate {

	public static Point toPoint(int move)
	{
		if(move<=2 && move>=-2)
			return normalMove(move);
		return eatingMove(move);		
	}
	
	
	public static int toMove(Point movePoint)
	{
		if(movePoint.x >0)
			return toMove1(movePoint);
		return toMove2(movePoint);
	}
	
	
	private static int toMove1(Point movePoint) {	//positive x moves
		int x = movePoint.x;
		int y = movePoint.y;
		
		if(x==1)
		{
			if(y==1)
				return 1;
			return -2;
			
		}
		if(y==2)
			return 3;
		return -4;
			
	}
	
	private static int toMove2(Point movePoint) {	//negative x moves
		int x = movePoint.x;
		int y = movePoint.y;
		
		if(x==-1)
		{
			if(y==1)
				return 2;
			return -1;
			
		}
		if(y==2)
			return 4;
		return -3;
	}


	private static Point eatingMove(int move) {
		int y;
		int x;
		int moveCopy=move;
		if(Math.abs(move)==4)
		{
			move=2;
			y = move*(-1);
			x = move*(-1);
		}
		else
		{
			move=2;
			y = move*(-1);
			x = move;
		}
		if(moveCopy<0)
		{
			x=x*(-1);
			y=y*(-1);
		}
		return new Point(x,y);
	}

	private static Point normalMove(int move)
	{
		int y;
		int x;
		
		if(Math.abs(move)==2)
		{
			y = -1;
			x = -1;
		}
		else
		{
			y = -1;
			x = 1;
		}
		if(move<0)
		{
			x=x*(-1);
			y=y*(-1);
		}
		return new Point(x,y);
	}
	
	
	
}
