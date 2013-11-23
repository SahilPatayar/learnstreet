package battleTank;

/*
 * This is an interface battleTank
 * 
 * Which is implemented by two tank classes JumboTank and MiniTank
 * 
 * There can be more methods which can be added to this assignment
 * like
 *  - creating a boundary in which the tanks can move
 *  - refilling the fuel if fuel is getting low
 *  - Obstacles and targets to hit and with how much impact it hits the target and
 *    how much power level tank needs to destroy the target completely
 *    
 * */

public interface Tank 
{
	void move();
	void back();
	void turnLeft();
	void turnRight();
	void fire(int P_Level);
	
}
