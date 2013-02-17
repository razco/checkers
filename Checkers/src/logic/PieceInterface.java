package logic;

import java.awt.Point;

public interface PieceInterface {

	//public void getKind();//(king or normal)//gonna be .. @deprecated	
	public Point getPosition();//(x,y)

	public int getOwnerColor();//black or white

	public boolean isMoveOk(int move);//get move id and return true or false

}
