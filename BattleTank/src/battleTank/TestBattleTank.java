package battleTank;
import java.util.Scanner;
/*
 * Test Class tests the cases on both Jumbo and Mini tanks
 * 
 * Here, User chooses which tank he/she has to drive and what operations
 * to perform on that.
 *  
 * 
 * */
public class TestBattleTank
{
	
	
	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in); // to get the user's input
		
		try
		{
			int input;
				
			int flag = 0;
			
			// Not letting the user to take invalid choice with this do-while loop, 
			do
			{
				System.out.println("Which Battle Tank you want to drive : ");
				System.out.println("1. Jumbo \n2. Mini");
				input = s.nextInt();
				if(input == 1 || input == 2)
					flag = 1;
				else
					flag = 0;
			}while(flag == 0);
			
						  					
			/*
			 * Jumbo Tank Initialization and Operations
			 * 
			 * */					
			
			
			if(input == 1)
			{				
				System.out.println("Enter the X-Coordinate for Jumbo tank :");
				int posX = s.nextInt();
				System.out.println("Enter the Y-Coordinate for Jumbo tank :");
				int posY = s.nextInt();
				System.out.println("How much fuel you want to put in the tank Initially : ");
				int iniFuel = s.nextInt();
				
				int iniPower;
				flag = 0;
					do
					{
						System.out.println("Chose the initial power level of your Tank between 1 to 5 :");
						iniPower = s.nextInt();
						if(JumboTank.checkValidPower(iniPower))
							flag = 1;
						else
							flag = 0;
					}while(flag == 0);
					// Taking the Initial Direction
					
					flag = 0;
					int iniDir;
				do
				{
					System.out.println("Enter the Initial direction by entering number between 0 to 3");
					System.out.println("0. East \n1. West\n2. North\n3.South");
					iniDir = s.nextInt();
					if(BattleTank.validDirection(iniDir))
						flag = 1;
					else 
						flag = 0;
				}while(flag == 0);	
				
				
				// Creating Jumbo Tank
				JumboTank j = new JumboTank(posX, posY, iniFuel, iniPower, iniDir);
			
				// Operations on Jumbo Tank
				
				int operation;
				int newPower = j.getPowerLevel();
		
				System.out.println("Jumbo tank is ready to run. ");
				System.out.println("Enetr the operation you want to perform and enter 0 to exit from operations :");
				
				
				do
				{
					flag = 0;
					do
					{
						System.out.println("Operations : ");
						System.out.println("1. Move Forward \n2. Turn back\n3. Turn Left \n4. Turn Right \n5. Fire \n6. Fire(With change Power Level) \n0. Exit");
						operation = s.nextInt();
						if(operation >= 0 && operation <= 6)
						{
							if(operation == 6)
							{
								do
								{
									System.out.println("Enter new Power level between 1 to 5 :");
									newPower = s.nextInt();
									if(JumboTank.checkValidPower(newPower))
										flag = 1;
									else
										flag = 0;
								}while(flag == 0);
							}
							flag = 1;
						}
						else
							flag = 0;
					} while(flag == 0);	
			
						j.operation(operation, newPower);
					
				}
				while(operation != 0);
					
				/*
				 * Now After operating tank, you can get its details
				 * 
				 * */
				
				flag = 0;
				do
				{
					do
					{					
						System.out.println("Details of Tank after operations");
						System.out.println("1. Position of Tank \n2. Remaining Fuel \n3. Direction \n4. Power level \n5. Distance Travelled \n6. Type of Tank \n0. Exit");
						operation = s.nextInt();
						
						if(operation >= 0 && operation <= 6)
							flag = 1;
						else
							flag = 0;
					}while(flag == 0);
										
						j.getDetails(operation);
				
				}while(operation != 0);
				
					s.close();			
		}
			else			// Taking the initial values from user for Mini Tank
				if(input == 2)
				{
					System.out.println("Enter the X-Coordinate for Mini tank :");
					int posX = s.nextInt();
					System.out.println("Enter the Y-Coordinate for Mini tank :");
					int posY = s.nextInt();
					System.out.println("How much fuel you want to put in the tank Initially : ");
					int iniFuel = s.nextInt();
					
					// Taking Valid Power level
					flag = 0;
					int iniPower;
					do
					{								
						System.out.println("Enter the Initial power of your Mini Tank between 1 to 4 :");
						iniPower = s.nextInt();
						if(MiniTank.checkValidPower(iniPower))
							flag = 1;
						else
							flag = 0;
					}while(flag == 0);
					
				
					// Taking Valid Direction
					int iniDir;
					flag =0;
					do
					{
						System.out.println("Enter the Initial direction by entering number between 0 to 3");
						System.out.println("0. East \n1. West\n2. North\n3.South");
						iniDir = s.nextInt();
						
						if(BattleTank.validDirection(iniDir))
							flag = 1;
						else
							flag = 0;					
					}while(flag == 0);
					
					// Creating A Mini Tank
			
					MiniTank m = new MiniTank(posX, posY, iniFuel, iniPower, iniDir);
					
					/*
					 * 
					 *  List of Operations to be performed on the Mini Tank
					 * 
					 * 
					 * 
					 * */
					
					
					
					int operation;
					int newPower = m.getPowerLevel();
					System.out.println("Mini tank is ready to run. ");
					System.out.println("Enetr the operation you want to perform and enter 0 to exit from operations :");
					
					
					do
					{
						flag = 0;
						do
						{
							System.out.println("Operations : ");
							System.out.println("1. Move Forward \n2. Turn back\n3. Turn Left \n4. Turn Right \n5. Fire \n6. Fire(With change Power Level) \n0. Exit");
							operation = s.nextInt();
							if(operation >= 0 && operation <= 6)
							{
								if(operation == 6)
								{
									do
									{
										System.out.println("Enter new Power level between 1 to 4 :");
										newPower = s.nextInt();
										if(MiniTank.checkValidPower(newPower))
											flag = 1;
										else
											flag = 0;
									}while(flag == 0);
								}
								flag = 1;
							}
							else
								flag = 0;
						} while(flag == 0);	
				
							m.operation(operation, newPower);						
					}
					while(operation != 0);
				
					/*
					 * 
					 * After operations user can get the detail of Tank
					 * 
					 * 
					 * */
										
					flag = 0;
					do
					{
						do
						{
							System.out.println("Details of Tank after operations \n");
							System.out.println("1. Position of Tank \n2. Remaining Fuel \n3. Direction \n4. Power level \n5. Distance Travelled \n6. Type of Tank \n0. Exit");
							operation = s.nextInt();
							
							if(operation >= 0 && operation <=6)
								flag = 1;
							else
								flag = 0;
						}while(flag == 0);
						
						m.getDetails(operation);
						
					}while(operation != 0);
					
					s.close();			
				}
				else
					System.out.println("Invalid Choice. (Select 1 or 2 only)");
						
		}
		catch(Exception e)
		{
			System.out.println("You entered Invalid input. \nEnter valid input only(Integer Values Only) ");
		}
		
	}
}
