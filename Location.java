import java.util.*;

public class Location{

	private String name;
	private String description;
	private ArrayList<Item> items = new ArrayList<Item>();

	public Location(String a, String b, ArrayList<Item> c)
	{
		name = a;
		description = b;
		items = c;
	}

	public Item remove(String itemToRemove){
		for(int i = 0; i < items.size();i++){
			
			if(items.get(i).getItem().equals(itemToRemove))	
			{	
				System.out.println("Removing item");
				return items.remove(i);
			}
		}

		return null;
	}

	public String getLocationName()
	{
		return name;
	}

	public void addItemToLocation(Item a)
	{
		items.add(a);
	}

	public String getDescription()
	{
		return description;
	}

	public String getListOfItems()
	{
		String temp = "";

		for (int i = 0; i < items.size(); i++)
		{
			temp += items.get(i).getItem()+"\n";
		}

		return temp;	
	}

	


	
}