public class Item{

	private String item;
	private String description;

	public Item(String newItem){
		item = newItem;

		if (item == "pencil")
		{
			description = "Biq 7.0 Led";
		}

		else if(item == "calculator")
		{
			description = "Ti Nspire";
		}

		else if(item == "gator_1_id")
		{
			description = "Golden Ticket to everything UF";
		}

		else if(item == "spicy_chicken_sandwich")
		{
			description = "delectable, tasty, goodness, between two slices of bread basically God's gift to man";
		}

		else if(item == "chips")
		{
			description = "Bag of Dorito Nacho Cheese";
		}

		else if(item == "letter")
		{
			description = "crumbled up note which reads: meet me at Sorority Row ;) - Cristine";
		}

		else if(item == "post_it")
		{
			description = "The note reads: Goto Midtown as soon as you read this";
		}

		else if(item == "note")
		{
			description = "note has directions to 4532 Fraternity Row maybe I should go there.";
		}

		else if(item == "college_ruled_paper")
		{
			description = "the paper reads: FINAL EXAM TONIGHT AT Carleton Auditorium in 8:20pm (75 Moves)";
		}

		else if(item == "crib_sheet")
		{
			description = "Sheet of paper with Final Exam soluions";
		}

		else if(item == "heineken")
		{
			description = "Ice cold bottle of something Legendary";
		}

		else if(item == "taco_stack")
		{
			description = "The best item on Moe's menu, Hands Down";
		}

		else if(item == "pizza")
		{
			description = "mozzerella cheese, tomato sauce, and bread perfection";
		}

		else if(item == "soda")
		{
			description = "mozzerella cheese, tomato sauce, and bread perfection";
		}




	}

	public String getItem()
	{
		return item;
	}

	public String getDescription()
	{
		return description;
	}
}