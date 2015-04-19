import java.util.*;

public class Inventory extends Processor {
	
	private Item newItem;
	private static ArrayList<Item> bookbag = new ArrayList<Item>();
	


	public Inventory ()
	{
	
	}

	public static void add(Item itemToAdd)
	{ 
		bookbag.add(itemToAdd);
	}

	public static Item drop(Item itemToRemove)
	{	
		bookbag.remove(itemToRemove);

		return itemToRemove;

	}

	public static Item getInventoryItem(String itemToGet)
	{
		for(int i = 0; i < bookbag.size();i++)
		{	
			if(bookbag.get(i).getItem().equals(itemToGet))	
			{	
				return bookbag.get(i);
			}
		}

		return null;
	}

	public static String listInventory()
	{
		String temp = "";

		for (int i = 0; i < bookbag.size(); i++)
		{
			temp += bookbag.get(i).getItem()+"\n";
		}

		return temp;
	}

	public static boolean checkInventory()
	{	
		String itemsToHave1 = "calculator";
		String itemsToHave2 = "pencil";
		String itemsToHave3 = "gator1_id";
		String itemsToHave4 = "crib_sheet";

		for(int i = 0; i < bookbag.size();i++)
		{	
			if(bookbag.get(i).getItem().equals(itemsToHave1))	
			{	
				for(int j = 0; j < bookbag.size();j++)
				{	
					if(bookbag.get(j).getItem().equals(itemsToHave2))	
					{	
						for(int k = 0; k < bookbag.size();k++)
						{	
							if(bookbag.get(k).getItem().equals(itemsToHave3))	
							{	
								for(int l = 0; l < bookbag.size();l++)
								{	
									if(bookbag.get(l).getItem().equals(itemsToHave4))	
									{	
										return true;
									}
								}
							}
						}
					}
				}
			}
		}
		
		return false;
	}

	public static void main(String args[])
	{}
}