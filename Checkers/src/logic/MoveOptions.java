package logic;

public interface MoveOptions {
	static int oneUp_oneRight = 1;
	static int oneUp_oneLeft = 2;
	static int twoUp_twoRight = 3;
	static int twoUp_twoLeft = 4;
	static int oneDown_oneLeft = -1;	//negative to 1
	static int oneDown_oneRight = -2;	//negative to 2
	static int twoDown_twoLeft = -3;	//negative to 3
	static int twoDown_twoRight = -4;	//negative to 4
}
