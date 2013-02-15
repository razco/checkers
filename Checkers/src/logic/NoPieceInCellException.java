package logic;

public class NoPieceInCellException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5819802086155967755L;
	public NoPieceInCellException() { super(); }
	public NoPieceInCellException(String message) { super(message); }
	public NoPieceInCellException(String message, Throwable cause) { super(message, cause); }
	public NoPieceInCellException(Throwable cause) { super(cause); }
	
}
