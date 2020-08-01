package main;

public class Backpack {
	private String name;
	private Object[] capacity;
	private int durability;
	
	public Backpack(String name, int capacity, int durability)
	{
		this.name = name;
		this.capacity = new Object[capacity];
		this.durability = durability;
	}
	
	public void inventory() {
		System.out.println("Inventory: ");
		for(int i = 0; i < capacity.length; i++)
		{
			if(i % 3 == 0)
			{	
			System.out.println();
			System.out.println(capacity[i].toString());
			}
			else 
				System.out.println(capacity[i].toString());
			}
	}
	
	public void add(Object item)
	{
		if(isFull())
		{
			System.out.println("Backpack is full.");
		}
		else
		{
		boolean empty = false;
		int i = 0;
		while(empty == false)
		{
			
			if(capacity[i] == null)
			{
				empty = true;
				capacity[i] = item;
				System.out.println(item + " has been added to your backpack");
			}
			else 
				i++;
		}
		}
		
	
	}
	
	public void drop(int position)
	{
		capacity[position-1] = null;
	}
	
	private boolean isFull()
		{
			boolean full = false;
			for(int i = 0; i< capacity.length; i++)
			{
				if(capacity[i] == null)
					full = true;
			}
			return full;
		}
	

}
