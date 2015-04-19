import java.util.*;

public class World extends Processor {
	
	public static int xPos;
	public static int yPos;
	private static Location board[][] = new Location[100][100];
	private static String testLocation;
	//List of Items avaiable in World 
	private static final String pencil = "pencil";
	private static final String sandwich = "spicy_chicken_sandwich";
	private static final String soda = "soda";
	private static final String chips = "chips";
	private static final String pizza = "pizza";
	private static final String calc = "calculator";
	private static final String id = "gator1_id";
	private static final String cribsheet = "crib_sheet";
	private static final String n1 = "letter";
	private static final String n4 = "note";
	private static final String n2 = "post_it";
	private static final String n3 = "college_ruled_paper";
	private static final String beer = "heineken";
	private static final String stack = "taco_stack";


	
	public World(int a, int b)
	{	
		xPos = a;
		yPos = b;

// Yposition = 6 //
		ArrayList<Item> i1 = new ArrayList<Item>();
			i1.add(new Item(chips));
			i1.add(new Item(soda));
		board[6][21] = new Location("Beaty Market","The most expensive place to get a snack, chips and soda are available here",i1);
		//***************// 

// Yposition = 7//
		ArrayList<Item> i2 = new ArrayList<Item>();
			i2.add(new Item(id));
		board[7][23] = new Location("Sorority Row","Where all the pretty girls stay at and suprising you Gator1 ID is on the floor in front of Tri Delts House",i2); 
		//***************// 

		ArrayList<Item> i3 = new ArrayList<Item>();
			i3.add(new Item(null));
		board[7][22] = new Location("Sidewalk of 13th St."," Eastside Edge campus, Cars are flying by left and right",i3);
		
		ArrayList<Item> i4 = new ArrayList<Item>();
			i4.add(new Item(null));
		board[7][21] = new Location("Beaty Hall","Tallest building on UF's campus",i4); 
		//***************// 
	
		ArrayList<Item> i5 = new ArrayList<Item>();
			i5.add(new Item(null));
		board[7][18] = new Location("Fine Arts Building","Drummers are practicing for there next drumline competition",i5); 
		//***************// 

		ArrayList<Item> i6 = new ArrayList<Item>();
			i6.add(new Item(chips));
			i6.add(new Item(soda));
		board[7][14] = new Location("Little Hall","The most visted place on campus during your Freshman Year, chips and soda are available here",i6); 
		//***************// 

// Yposition = 8//
		ArrayList<Item> i7 = new ArrayList<Item>();
			i7.add(new Item(null));
		board[8][22] = new Location("Yulee Bus Stop"," Across the street from Beaty Market",i7); 
		//***************// 

		ArrayList<Item> i100 = new ArrayList<Item>();
			i100.add(new Item(null));
		board[8][21] = new Location("Yulee Hall","The first place you lived before you moved to Sledd Hall/Murphree Area",i100); 
		//***************// 
		
		ArrayList<Item> i9 = new ArrayList<Item>();
			i9.add(new Item(null));
		board[8][20] = new Location("Broward Dining","The best dining hall on campus, but the food is even worth paying for",i9); 
		//***************// 
	
		ArrayList<Item> i10 = new ArrayList<Item>();
			i10.add(new Item(sandwich));
		board[8][19] = new Location("Chick-fil-a","Brand New Chick-fil-a just built a few months ago alot better than Burger King, you can get a spicy_chicken_sandwich here",i10); 
		//***************// 

		ArrayList<Item> i11 = new ArrayList<Item>();
			i11.add(new Item(null));
		board[8][18] = new Location("Broward Hall","Where almost every income Freshman resides at",i11); 
		//***************// 

		ArrayList<Item> i12 = new ArrayList<Item>();
			i12.add(new Item(null));
		board[8][16] = new Location("Room A101 - CISE Building","Where you COP3502 class is, and lecture hall to one of the best professors/visionary in the University Sean Goldenberg",i12); 
		//***************// 

		ArrayList<Item> i13 = new ArrayList<Item>();
			i13.add(new Item(null));
		board[8][14] = new Location("Carleton Auditorium","Final Exam Location",i13); 
		//***************// 

		ArrayList<Item> i14 = new ArrayList<Item>();
			i14.add(new Item(n1));
			i14.add(new Item(beer));
		board[8][11] = new Location("Midtown","Public outing for the Gator Nation, where you spent a majority of last night, the bartender has a letter and a heineken",i14); 
		//***************// 

// Yposition = 9//
		ArrayList<Item> i15 = new ArrayList<Item>();
			i15.add(new Item(null));
		board[9][18] = new Location("Rinker Hall","Home of the construction infleunceed majors",i15); 
		//***************// 

		ArrayList<Item> i16 = new ArrayList<Item>();
			i16.add(new Item(null));
		board[9][17] = new Location("Rawlings Hall","Exentension of Broward Hall in a sense ",i16); 
		//***************// 
		
		ArrayList<Item> i17 = new ArrayList<Item>();
			i17.add(new Item(null));
		board[9][16] = new Location("CISE Building","Where you basically live as Computer Science Major",i17); 
		//***************// 
	
		ArrayList<Item> i18 = new ArrayList<Item>();
			i18.add(new Item(null));
		board[9][15] = new Location("University Auditorium","Looks like a 1970s Church building",i18); 
		//***************// 

		ArrayList<Item> i19 = new ArrayList<Item>();
			i19.add(new Item(null));
		board[9][14] = new Location("Plaza of the Americas","Right in front of library West, Krishna Lunch is actually going on right now",i19); 
		//***************// 

		ArrayList<Item> i20 = new ArrayList<Item>();
			i20.add(new Item(null));
		board[9][13] = new Location("Library West","Another place where all the pretty girls study",i20); 
		//***************// 

		ArrayList<Item> i21 = new ArrayList<Item>();
			i21.add(new Item(null));
		board[9][12] = new Location("Chemistry Building","The place you dread the most,",i21); 
		//***************// 

		ArrayList<Item> i22 = new ArrayList<Item>();
			i22.add(new Item(null));
		board[9][11] = new Location("Buckman Hall","Right next to Midtown, great place to live as freshman in the Gainesville",i22); 
		//***************// 

// Yposition = 10//
		ArrayList<Item> i115 = new ArrayList<Item>();
			i115.add(new Item(null));
		board[10][22] = new Location("Shands Hospital","Hospital for UF medical students to practice",i115); 
		//***************// 
		
		ArrayList<Item> i117 = new ArrayList<Item>();
			i117.add(new Item(null));
		board[10][21] = new Location("New Engineering Building","Extension of Larsen, basically where the brilliant engineers of UF study",i117); 
		//***************// 
	
		ArrayList<Item> i118 = new ArrayList<Item>();
			i118.add(new Item(null));
		board[10][20] = new Location("Reitz Parking Garage","The hardest place to find parking on UF Campus",i118); 
		//***************// 

		ArrayList<Item> i119 = new ArrayList<Item>();
			i119.add(new Item(null));
		board[10][19] = new Location("Reitz Union","Where everyone hangs out between their classes",i119); 
		//***************// 

		ArrayList<Item> i120 = new ArrayList<Item>();
			i120.add(new Item(null));
		board[10][18] = new Location("Reitz Union North Lawn","The grass looks super green for some reason. Also there's alot of people laying in the grass reading books today",i120); 
		//***************// 

		ArrayList<Item> i121 = new ArrayList<Item>();
			i121.add(new Item(sandwich));
		board[10][17] = new Location("The HUB/Chick-fil-a","Campus Central location where you can get good food and your computer fixed",i121); 
		//***************// 

		ArrayList<Item> i122 = new ArrayList<Item>();
			i122.add(new Item(null));
		board[10][16] = new Location("French Fry Scuplture","oddest looking piece of art ever made",i22); 
		//***************// 
		
		ArrayList<Item> i29 = new ArrayList<Item>();
			i29.add(new Item(calc));
		board[10][15] = new Location("Marston Library","AKA Marstons Room for everyone who can't leave because of a final coming up, your friend Karl has a calculator you can borrow for the exam",i29);
	

		ArrayList<Item> i24 = new ArrayList<Item>();
			i24.add(new Item(null));
		board[10][14] = new Location("Turlington Plaza","AKA The Set the place where you avoid anyone with a paper in there hand",i24);
		
		//***************//

		ArrayList<Item> i25 = new ArrayList<Item>();
			i25.add(new Item(null));
		board[10][13] = new Location("Pugh Hall","Great place to study, but not always the quietiest",i25);
		
		//***************//
		
		ArrayList<Item> i26 = new ArrayList<Item>();
			i26.add(new Item(null));
		board[10][12] = new Location("Leigh Hall","Acadamic Office of Support",i26);
		
		//***************//
		
		ArrayList<Item> i27 = new ArrayList<Item>();
			i27.add(new Item(n3));
		board[10][11] = new Location("Murphree Courtyard","Theres a piece of college_ruled_paper on the floor",i27);
		
		//***************//

		ArrayList<Item> i28 = new ArrayList<Item>();
			i28.add(new Item(pencil));
			i28.add(new Item(n2));
		board[10][10] = new Location("Dorm Room","small behind place for you to rest your head, theres a pencil and a post_it with writing on it, you might need it for the final",i28); 

		//***************// 
		
		
// Yposition = 11
		ArrayList<Item> i30 = new ArrayList<Item>();
			i30.add(new Item(n4));
		board[11][21] = new Location("Larsen Hall","Where all the intellectuals reside theres a note on the floor",i30); 
		//***************// 

		ArrayList<Item> i31 = new ArrayList<Item>();
			i31.add(new Item(calc));
		board[11][20] = new Location("New Physics Building","The place where grades don't matter, only the curve at the end of each semester",i31); 
		//***************// 

		ArrayList<Item> i32 = new ArrayList<Item>();
			i32.add(new Item(null));
		board[11][18] = new Location("Wiemer Hall","Exentension of the College of Journalism",i32); 
		//***************// 

		ArrayList<Item> i33 = new ArrayList<Item>();
			i33.add(new Item(null));
		board[11][17] = new Location("Williamson Hall","College of Journalism also another place where the pretty girls are at",i33); 
		//***************// 

		ArrayList<Item> i34 = new ArrayList<Item>();
			i34.add(new Item(null));
		board[11][12] = new Location("Outside the Student Rec","",i34); 
		//***************// 
		
		ArrayList<Item> i35 = new ArrayList<Item>();
			i35.add(new Item(stack));
		board[11][11] = new Location("Moe's","where you can pickup a World Famous Stack",i35); 
		//***************// 

// Yposition = 12
		ArrayList<Item> i38 = new ArrayList<Item>();
			i38.add(new Item(null));
		board[12][20] = new Location("Hume Hall","Honor College Dorms",i38); 
		//***************// 

		ArrayList<Item> i39 = new ArrayList<Item>();
			i39.add(new Item(null));
		board[12][18] = new Location("Stadium","GameDay Central for Saturday afternoon",i39); 
		//***************// 

		ArrayList<Item> i40 = new ArrayList<Item>();
			i40.add(new Item(pizza));
		board[12][17] = new Location("Gator Dining","Only thing worth while is the pizza",i40); 
		//***************// 

// Yposition = 13
		ArrayList<Item> i236 = new ArrayList<Item>();
			i236.add(new Item(null));
		board[13][20] = new Location("Big Parking Lot","Seems like everyone has gone home, the parking lot is super empty",i236); 
		//***************// 

		ArrayList<Item> i237 = new ArrayList<Item>();
			i237.add(new Item(null));
		board[13][19] = new Location("Intersection of Gale Lemmerand and Museum Rd.","Basic crosswalk",i237); 
		//***************// 

		ArrayList<Item> i238 = new ArrayList<Item>();
			i238.add(new Item(chips));
		board[13][18] = new Location("O'Dome","Where Ball is Life for every athlete competing in this arena",i238); 
		//***************// 
		
		ArrayList<Item> i239 = new ArrayList<Item>();
			i239.add(new Item(null));
		board[13][17] = new Location("North Hall","Where your boy Don Jon stays",i239); 
		//***************// 

// Yposition = 14
		ArrayList<Item> i46 = new ArrayList<Item>();
			i46.add(new Item(chips));
		board[14][18] = new Location("Spring Dorms","Athlete Dorms",i46);

		ArrayList<Item> i47 = new ArrayList<Item>();
			i47.add(new Item(null));
		board[14][17] = new Location("Flavet Field","Some kids are playing Ultimate Frisbwee here",i47);

		ArrayList<Item> i48 = new ArrayList<Item>();
			i48.add(new Item(null));
		board[14][16] = new Location("Lake Alice","Beautiful Forest/Lake Setting in the corner of campus",i48);
	
		
// Yposition = 15
		ArrayList<Item> i49 = new ArrayList<Item>();
			i49.add(new Item(cribsheet));
		board[15][18] = new Location("Fraternity Row","Every CollegeKid dream comes true, but surprisingly theres a sheet of paper lying on the floor",i49);

		ArrayList<Item> i50 = new ArrayList<Item>();
			i50.add(new Item(null));
		board[15][17] = new Location("Museum Rd. Sidewalk","Across the street is a huge field, looks like a great spot to play a game of flag football",i50);

// Yposition = 16
		ArrayList<Item> i51 = new ArrayList<Item>();
			i51.add(new Item(null));
		board[16][17] = new Location("Corry Village","Baby Gator Central",i51);

		ArrayList<Item> i52 = new ArrayList<Item>();
			i52.add(new Item(null));
		board[16][16] = new Location("Southwest Rec","Where Ball is Life, but not really",i52);

		ArrayList<Item> i53 = new ArrayList<Item>();
			i53.add(new Item(null));
		board[16][15] = new Location("SW Rec Bus Stop","a Normal bus stop in front of the Rec",i53);

// Yposition = 17
		ArrayList<Item> i54 = new ArrayList<Item>();
			i54.add(new Item(null));
		board[17][16] = new Location("Harn Museum of Art","the best free date spot for any UF student",i54);


	}

	public void getBoardPosition()
	{	
		String position = board[xPos][yPos].getLocationName();

		System.out.print(xPos);
		System.out.print(",");
		System.out.println(yPos);

		System.out.println(position);

	}

	public static boolean checkNorth()
	{
		if(board[xPos][yPos+1] == null)
		{
			return false;
		}
		
		else
		{
			return true;
		}

	}

	public static boolean checkSouth()
	{
		if(board[xPos][yPos-1] == null)
		{
			return false;
		}
		
		else
		{
			return true;
		}

	}	

	public static boolean checkEast()
	{
		if(board[xPos + 1][yPos] == null)
		{
			return false;
		}
		
		else
		{
			return true;
		}
	}

	public static boolean checkWest()
	{
		if(board[xPos - 1][yPos] == null)
		{
			return false;
		}
		
		else
		{
			return true;
		}
	}

	public void moveNorth()
	{
			yPos += 1;
			
	}

	public void moveEast()
	{	
			xPos += 1;
	}

	public void moveSouth()
	{
			yPos += -1;
	}

	public void moveWest()
	{	
			xPos += -1;
	}

	public int getXPos()
	{
		return xPos;
	}

	public int getYPos()
	{
		return yPos;
	}
	
	public static void main(String args[])
	{}

	public Location getLocation(){

		return board[xPos][yPos];
	}

	public Location getNorthLocation(){

		return board[xPos][yPos+1];
	}

	public Location getEastLocation(){

		return board[xPos+1][yPos];
	}

	public Location getSouthLocation(){

		return board[xPos][yPos-1];
	}

	public Location getWestLocation(){

		return board[xPos-1][yPos];
	}

	public Location setLocation(int x, int y){

		return board[x][y];
	}

	public boolean checkLocation()
	{

		if(getLocation().getLocationName() == "Carleton Auditorium")
		{
			return true;
		}

		return false;
	}

	

}