package logic;

public interface PieceInterface {

	public void getKind();//(king or normal)//gonna be .. @deprecated

	public void getPosition();//(x,y)

	public void getOwnerColor();//black or white

	public void isMoveOk();//get move id and return true or false

}
