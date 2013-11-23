package battleTank;

/*
 * This is an abstract class whose properties and methods are inherited
 * by subclasses Jumbo and Mini.
 * 
 * 
 * 
 * */
public abstract class BattleTank
{
	protected int powerLevel; 		// Power level provided initially
	protected int positionX;			// initial X coordinate
	protected int positionY;			// Initial Y Coordinate
	protected int fuel;				// Initial Fuel Level given
	protected int pointingTo;			// Initial direction
	protected static double distance;		// unit to store distance
	protected String name;  // Name of or type of tank
	
	

	/* 						DIRECTIONS
	 * 
	 *                        	N	
	 *							| 
	 * 							|
	 * 				   W-----------------E
	 *							| 	
	 * 							|
	 * 							S
	 * 
	 * */

	/*		Direction Specification
	 *
	 * DIRECTION_RIGHT = 0;    	// Direction to East
	 * DIRECTION_LEFT = 1; 		// Direction to West
	 * DIRECTION_UP = 2; 		// Direction to North
	 * DIRECTION_DOWN = 3;		// Direction to South
	 * 
	 *
	*/
	
	/*
	 * JumboTank Constructor takes :
	 *  
	 * Initial position of tank(X and Y Coordinates),
	 * Initial power level
	 * Initial fuel level
	 * Initial direction
	 *
	 * */
		
	public BattleTank(int positionX, int positionY, int fuel, int powerLevel, int pointingTo)
	{
		this.positionX = positionX;
		this.positionY = positionY;
		this.fuel = fuel;
		this.powerLevel = powerLevel;
		this.pointingTo = pointingTo;
		distance = 0;		
		System.out.println("Tank is Standing at position : " + getPosition());
		System.out.println("Tank is now pointing towards " + getDirection(pointingTo) + " direction");
		System.out.println("Tank's fuel level is : " + fuel);
		System.out.println("Tank's power level is : " + powerLevel);
		System.out.println(" ");
	}
	
	/*
	 * getDetails(int) method returns the detail of tank as needed
	 * 
	 * */
		
	public void getDetails(int input)
		{
			switch(input)
			{
			case 1: System.out.println("Position of tank : " + getPosition());
					System.out.println("");
					break;
			
			case 2: System.out.println("Fuel in Tank: " + getFuelLevel());
					System.out.println("");
					break;
			
			case 3: System.out.println("Tank is in : " + getDirection(pointingTo) + " direction");
					System.out.println("");
					break;
			
			case 4: System.out.println("Power level of tank : " + getPowerLevel());
					System.out.println("");
					break;
			case 5 : System.out.println("Distance Travelled by Tank : " + getDistance());	
						System.out.println("");
					break;	
					
			case 6 : System.out.println("Type of Tank : " + name);
					 System.out.println(" ");
					 break;
			}
		}
	
	/*
	 * getDirection() method returns the current moving direction of tank
	 * 
	 * */
	public String getDirection(int dir)
	{
		
		switch(dir)
		{
		case 0 :	return "East";
					
		
		case 1 :	return "West";
					
		
		case 2 :	return "North";
					

		case 3 :	return "South";
		
		default : 
					return null;
		}		
		
	}

	/*
	 * getPowerLevel() method returns the current power level of tank with 
	 * which it can fire
	 * 
	 * */
	public int getPowerLevel()
	{
		return powerLevel;
	}
	
	/*
	 * getFuelLevel() method returns the remaining fuel
	 * 
	 * */
	
	public int getFuelLevel()
	{
		return fuel;
	}
	
	/*
	 * getDistance() returns the distance traveled by the tank.
	 * 
	 * */
	public double getDistance()
	{
		return distance;
	}
		
	/*
	 * getPosition() method returns the String representation of current position
	 * of tank in X-Y coordinates 
	 * */
	
	public String getPosition()
	{
		String pos;
		pos = Integer.toString(positionX) + " , " + Integer.toString(positionY);
		return pos;
	}

	// Method to check the valid Direction 
		public static boolean validDirection(int dir)
		{
			if(dir >= 0 && dir <=3)
				return true;
			else
				return false;
		}		
		

}
