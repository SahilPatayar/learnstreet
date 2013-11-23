package battleTank;

/*
 * MiniTank is another subclass of class BattleTank
 * 
 * It inherits fields and methods of BattleTank class
 * 
 * */


public class MiniTank extends BattleTank implements Tank
{
	
	/*
	 * 
	 * MiniTank Constructor calls the constructor from super class and make a new object
	 * 
	 *  
	 * */
	
	
	
	public MiniTank(int positionX, int positionY, int fuel, int powerLevel, int pointingTo)
	{
		super(positionX, positionY, fuel, powerLevel, pointingTo);
		name = "Mini";
	}
	
	
	/*
	 * 	move() method let the tank to move in direction by one unit
	 *  in which it is pointing.
	 * 
	 * 	move() method from Tank Interface is overridden here
	 * 
	 *  
	 * */
	
	public void move() 
	{
		int fuelCal = fuel - 1;
		
		if(fuelCal < 0)
		{
			System.out.println("Oops..Cannot perfrom action because of no fuel.");
			System.out.println(" ");
		}
		else	
		{
			System.out.println(name + " tank moved by one unit in " + getDirection(pointingTo) + " direction. \n");
			switch(pointingTo)
			{
				
			case 0 : 	positionX++;
					 	distance++;
					 	fuel = fuel -1;
					 	break;
					 
			case 1 :	positionX--;
						distance++;
						fuel = fuel -1;
						break;
					
			case 2 : 	positionY++;
						distance++;
						fuel = fuel - 1;
						break;
						
			case 3 :	positionY--;
						distance++;
						fuel = fuel -1;
						break;
		
			}
		}
	}
	
	/*
	 * 	back() method let the tank to move in opposite direction by one unit
	 *  in which it is pointing.
	 * 
	 * 	back() method from Tank Interface is overridden here
	 * 
	 *  
	 * */
	
	public void back()
	{
		int fuelCal = fuel - 1;
		
		if(fuelCal < 0)
		{
			System.out.println("Oops..Cannot perfrom action because of no fuel.");
			System.out.println(" ");
		}
		else
		{
			System.out.println(name + " tank moved by one unit opposite to " + getDirection(pointingTo) + " direction. \n");
			switch(pointingTo)
			{
			case 0 : 	positionX--;
					 	distance++;
					 	fuel = fuel -1;
					 	break;
					 
			case 1 :	positionX++;
						distance++;
						fuel = fuel -1;
						break;
					
			case 2 : 	positionY--;
						distance++;
						fuel = fuel - 1;
						break;
						
			case 3 :	positionY++;
						distance++;
						fuel = fuel -1;
						break;		
			}
		}
	}

	/*
	 * 	turnLeft() method let the tank to take a left turn from the direction,
	 *  it is pointing to. And increase the distance travel by one unit
	 *  
	 * 
	 * 	turnLeft() method from Tank Interface is overridden here
	 * 
	 *  
	 * */
	
	public void turnLeft()
	{
		int fuelCal = fuel - 1;
		
		
		if(fuelCal < 0)
		{
			System.out.println("Oops..Cannot perfrom action because of no fuel.");
			System.out.println(" ");
		}
		else
		{
			System.out.println(name + " tank took a left turn from " + getDirection(pointingTo) + " direction. \n");
			switch(pointingTo)
			{
			case 0 : 	fuel = fuel -1;
					 	pointingTo = 2;
					 	break;
					 
			case 1 :	fuel = fuel -1;
						pointingTo = 3;
						break;
					
			case 2 : 	fuel = fuel - 1;
						pointingTo = 1;
						break;
						
			case 3 :	fuel = fuel -1;
						pointingTo = 0;
						break;		
			}
		}
	}

	/*
	 * 	turnRight() method let the tank to take a right turn from the direction,
	 *  it is pointing to. And increase the distance travel by one unit
	 *  
	 * 
	 * 	turnRight() method from Tank Interface is overridden here
	 * 
	 *  
	 * */
	
	public void turnRight()
	{
		int fuelCal = fuel - 1;
		
		if(fuelCal < 0)
		{
			System.out.println("Oops..Cannot perfrom action because of no fuel.");
			System.out.println(" ");
		}
		else
		{
			System.out.println(name + " tank took a right turn from " + getDirection(pointingTo) + " direction. \n");
			switch(pointingTo)
			{
			case 0 : 	fuel = fuel -1;
					 	pointingTo = 3;
					 	break;
					 
			case 1 :	fuel = fuel -1;
						pointingTo = 2;
						break;
					
			case 2 : 	fuel = fuel - 1;
						pointingTo = 0;
						break;
						
			case 3 :	fuel = fuel -1;
						pointingTo = 1;
						break;		
			}
		}
	}

	/*
	 * 	fire(int P_Level) method let the tank to fire with its power level,
	 *  
	 *  It decreases the fuel by units = powerLevel * 2
	 * 
	 * 	fire(int P_Level) method from Tank Interface is overridden here
	 * 
	 *  
	 * */
	
	public void fire(int P_Level) 
	{
		 powerLevel = P_Level;
	     int fuelNeed = powerLevel * 1;
	     
	     if((fuel - fuelNeed) < 0)
	     {
	    	 System.out.println("Oops..Tank is out of Fuel, " + name + " cannot fire. ");
	    	 System.out.println(" ");
	     }
	     else
	     {
	    	 fuel = fuel - powerLevel * 1;	
	    	 System.out.println("Wow! " + name + " fired with power level " + powerLevel);
	    	 System.out.println(" ");
	     }
	 }	

	/*
	 * operation(int op) takes input from user to which operation to perform on Tank
	 * 
	 * 
	 * 
	 * */
	
	public void operation(int op, int newPower)
	{
		switch(op)
		{
		case 1 : 	move();
					break;
					
		case 2 :	back();
					break;
		
		case 3 : 	turnLeft();
					break;
		
		case 4 :	turnRight();
					break;
					
		case 5 :
			
		case 6 :	fire(newPower);
					break;
		}
	}

	// Method to check if the Power level entered by user is valid
	
		public static boolean checkValidPower(int power)
		{
			if(power > 0 && power < 5)
				return true;
			else
			{
				System.out.println("You Entered invalid power level. \n");
				return false;
			}
				
		}
	
}
