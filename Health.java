public class Health extends Processor{
	
	private static int life;

	public Health(int h)
	{
		life = h;
	}

	public static int getHealth()
	{
		return life;
	}
					
	public static void increaseHealth(int increase)
	{
		life += increase;
	}

	public static void decreaseHealth(int decrease)
	{
		life -= decrease;
	}

	public static void checkHealth()
	{
		if(life <= 0)
		{
			System.out.println("You didnt eat enough going around campus and ended up in the Wellness Center");
			System.out.println("");
			System.out.println("                         GAME OVER                                            ");
			System.exit(0);

		}

	}
}