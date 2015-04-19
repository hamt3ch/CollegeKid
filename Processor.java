import java.util.*;

public class Processor {

	public static boolean gameStart;
	public static World world;
	public static Inventory inventory;
	public static int moves;
	public static Health health;
	public Action action;
	

	public Processor()
	{
	}

	public String processCommand (String command)
	{	
		// parse the command 
		String message[] = parseCommand(command);

		//action to take based on game state
		determineAction(message);
		
		//Check if you are still able to play
		if(gameStart)
		{	
			health.checkHealth();	
			checkMoves();
		}	

		// modify game state

		return "";
	}

	public String[] parseCommand(String command)
		{	
			String phrase = command.toLowerCase();
			String indx = " ";
			String tokens[] = phrase.split(indx);
			return tokens;

		}


	public static void determineAction(String args[])
	{	
		try
		{
			Action action = new Action();		
			String act = args[0];

				if(act.equals("enroll"))
				{	
					System.out.println("Welcome to College");	
					
					Inventory inventory = new Inventory();
					world = new World(10,10);
					health = new Health(10);
					moves = 0;
					gameStart = true;
	
				}

				if(act.equals("command"))
				{	
					System.out.println("Command List");
					newLine();
					System.out.println("Enroll - Starts a new game");
					newLine();
					System.out.println("Go + Direction - move in the direction given on campus");
					newLine();
					System.out.println("Examine + Item - examine item in inventory");
					newLine();
					System.out.println("Take + Item - take item in location");
					newLine();
					System.out.println("Location - states present location");
					newLine();
					System.out.println("Drop + Item - drop item in Inventory ");
					newLine();
					System.out.println("Use - use this command when you have all the items and are in the Final exam location ");
					newLine();
					System.out.println("WhereCanIGo - see where you can move next");
					newLine();
					System.out.println("Energy - check Energy (Life Gauge)");
					newLine();
					System.out.println("Time - check Time");
					newLine();
					System.out.println("Eat/Drink + Item - eat/drink item in you Inventory");
					newLine();
					System.out.println("Look - get description of location you are in");
					newLine();
					System.out.println("ItemsInLocation - list items available in location ");
					newLine();
					System.out.println("Clear - clear Command Prompt space");
					newLine();
					System.out.println("Dropout - Quit game");
					newLine();

				}

				if(act.equals("how"))
				{	
					System.out.println("How To Play");
					newLine();
					System.out.println("You are a CollegeKid on the campus of UF");
					System.out.println("Who just experienced the craziest night of his life,");
					System.out.println("but lost all the materials you need for the Final Exam tonight");
					System.out.println("Your goal is to go throughout campus looking");	
					System.out.println("to find all the materials you need for the Final Exam");
					System.out.println("and clues the events of last night");
					newLine();
					System.out.println("Each Move = 1 Energy point");
                    System.out.println("Energy = Life");
                    System.out.println("Eating/Drink increases your Energy");
                    

				}

			if(gameStart)
			{	
				if(act.equals("clear"))
				{	
					clear();
				}

				else if(act.equals("go"))
				{	
					action.move(args[1]);
				}

				else if(act.equals("look"))
				{	
						
					String desc = world.getLocation().getDescription();
					System.out.println(desc);

				}

				else if(act.equals("wherecanigo"))
				{	
					action.nextMove();
				}

				else if(act.equals("energy"))
				{	
					life();
				}

				else if(act.equals("time"))
				{	
					time();
				}

				else if(act.equals("location"))
				{
					world.getBoardPosition();
				}

				else if(act.equals("itemsinlocation"))
				{
					newLine();
					System.out.println("Items in Location");	
					System.out.println(world.getLocation().getListOfItems());
				
				}

				else if (act.equals("take"))
				 {
				 	
					action.take(args[1]);
				 }

				 else if (act.equals("drop"))
				 {
					action.drop(args[1]);
				 }

				else if(act.equals("inventory"))
				{
                    try
                    {
                        System.out.println(inventory.listInventory());
                    }
                    
                    catch(NullPointerException ex)
                    {
                        System.out.println("");
                    }
                }

				else if(act.equals("examine"))
				{
					action.examine(args[1]);
				}

				else if(act.equals("use"))
				{
					action.use();
				}

				else if(act.equals("eat"))
				{
					action.eat(args[1]);
				}
				
				else if(act.equals("drink"))
				{
					action.drink(args[1]);
				}

			}

			else
			{
				System.out.println("You must enroll first!!");
			}

	 	}

	 catch (ArrayIndexOutOfBoundsException ex)
	 	{	
	 		 System.out.println("invalid command");
	 		
	 	}

	}

	public static void checkMoves()
	{
		if(moves == 75)
		{	
			System.out.println("");
			System.out.println("You didnt make it in time to make the Final Exam");
			System.out.println("");
			System.out.println("                  GAME OVER                     ");
			System.exit(0);

		}
	}

	public static void clear()
	{	
		for(int i = 0; i < 25 ; i++)
		{
			System.out.println("");
		}
	}

	public static void time()
	{
		System.out.print("Moves:");
		System.out.println(moves);
	}
	public static void life()
	{
		System.out.print("Energy:");
		System.out.println(health.getHealth());		

	}


	public static void newLine()
	{
		System.out.println("");
	}

	
	
}