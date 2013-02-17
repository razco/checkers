package logic;

import static org.junit.Assert.*;

import java.awt.Point;

import org.junit.Test;

public class MovesTranslateTests {

	@Test
	public void toPoint__oneUp_oneRight__xOneyMinusOne() {
		//Arrange
		int move=MoveOptions.oneUp_oneRight;
		Point expectedPoint = new Point(1,-1);
		//Act
		Point movePoint = MovesTranslate.toPoint(move); 
		//Assert
		assertEquals(expectedPoint, movePoint);
		
	}
	
	@Test
	public void toPoint__oneUp_oneLeft__xMinusOneyMinusOne() {
		//Arrange
		int move=MoveOptions.oneUp_oneLeft;
		Point expectedPoint = new Point(-1,-1);
		//Act
		Point movePoint = MovesTranslate.toPoint(move); 
		//Assert
		assertEquals(expectedPoint, movePoint);
		
	}
	
	@Test
	public void toPoint__oneDown_oneRight__xOneyOne() {
		//Arrange
		int move=MoveOptions.oneDown_oneRight;
		Point expectedPoint = new Point(1,1);
		//Act
		Point movePoint = MovesTranslate.toPoint(move); 
		//Assert
		assertEquals(expectedPoint, movePoint);
		
	}
	
	@Test
	public void toPoint__oneDown_oneLeft__xMinusOneyOne() {
		//Arrange
		int move=MoveOptions.oneDown_oneLeft;
		Point expectedPoint = new Point(-1,1);
		//Act
		Point movePoint = MovesTranslate.toPoint(move); 
		//Assert
		assertEquals(expectedPoint, movePoint);
		
	}
	
	@Test
	public void toPoint__twoUp_twoRight__xTwoyMinusTwo() {
		//Arrange
		int move=MoveOptions.twoUp_twoRight;
		Point expectedPoint = new Point(2,-2);
		//Act
		Point movePoint = MovesTranslate.toPoint(move); 
		//Assert
		assertEquals(expectedPoint, movePoint);
		
	}
	
	@Test
	public void toPoint__twoUp_twoLeft__xMinusTwoyMinusTwo() {
		//Arrange
		int move=MoveOptions.twoUp_twoLeft;
		Point expectedPoint = new Point(-2,-2);
		//Act
		Point movePoint = MovesTranslate.toPoint(move); 
		//Assert
		assertEquals(expectedPoint, movePoint);
		
	}
	
	@Test
	public void toPoint__twoDown_twoRight__xTwoyTwo() {
		//Arrange
		int move=MoveOptions.twoDown_twoRight;
		Point expectedPoint = new Point(2,2);
		//Act
		Point movePoint = MovesTranslate.toPoint(move); 
		//Assert
		assertEquals(expectedPoint, movePoint);
		
	}
	
	@Test
	public void toPoint__twoDown_twoLeft__xMinusTwoyTwo() {
		//Arrange
		int move=MoveOptions.twoDown_twoLeft;
		Point expectedPoint = new Point(-2,2);
		//Act
		Point movePoint = MovesTranslate.toPoint(move); 
		//Assert
		assertEquals(expectedPoint, movePoint);
		
	}
	

	
	@Test
	public void toMove__oneUp_oneRight__xOneyMinusOne() {
		//Arrange
		int expectedMove=MoveOptions.oneUp_oneRight;
		Point point = new Point(1,-1);
		//Act
		int move = MovesTranslate.toMove(point); 
		//Assert
		assertEquals(expectedMove, move);
		
	}
	
	@Test
	public void toMove__oneUp_oneLeft__xMinusOneyMinusOne() {
		//Arrange
		int expectedMove=MoveOptions.oneUp_oneLeft;
		Point point = new Point(-1,-1);
		//Act
		int move = MovesTranslate.toMove(point); 
		//Assert
		assertEquals(expectedMove, move);
		
	}
	
	@Test
	public void toMove__oneDown_oneRight__xOneyOne() {
		//Arrange
		int expectedMove=MoveOptions.oneDown_oneRight;
		Point point = new Point(1,1);
		//Act
		int move = MovesTranslate.toMove(point); 
		//Assert
		assertEquals(expectedMove, move);
		
	}
	
	@Test
	public void toMove__oneDown_oneLeft__xMinusOneyOne() {
		//Arrange
		int expectedMove=MoveOptions.oneDown_oneLeft;
		Point point = new Point(-1,1);
		//Act
		int move = MovesTranslate.toMove(point); 
		//Assert
		assertEquals(expectedMove, move);
	}
	
	@Test
	public void toMove__twoUp_twoRight__xTwoyMinusTwo() {
		//Arrange
		int expectedMove=MoveOptions.twoUp_twoRight;
		Point point = new Point(2,-2);
		//Act
		int move = MovesTranslate.toMove(point); 
		//Assert
		assertEquals(expectedMove, move);
	}
	
	@Test
	public void toMove__twoUp_twoLeft__xMinusTwoyMinusTwo() {
		//Arrange
		int expectedMove=MoveOptions.twoUp_twoLeft;
		Point point = new Point(-2,-2);
		//Act
		int move = MovesTranslate.toMove(point); 
		//Assert
		assertEquals(expectedMove, move);
	}
	
	@Test
	public void toMove__twoDown_twoRight__xTwoyTwo() {
		//Arrange
		int expectedMove=MoveOptions.twoDown_twoRight;
		Point point = new Point(2,2);
		//Act
		int move = MovesTranslate.toMove(point); 
		//Assert
		assertEquals(expectedMove, move);
	}
	
	@Test
	public void toMove__twoDown_twoLeft__xMinusTwoyTwo() {
		//Arrange
		int expectedMove=MoveOptions.twoDown_twoLeft;
		Point point = new Point(-2,2);
		//Act
		int move = MovesTranslate.toMove(point); 
		//Assert
		assertEquals(expectedMove, move);
	}
	

	
	
	

}
