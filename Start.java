package main;
import java.util.*;

public class Start {
	//chance variables
	private static int hunting = 30;
	private static int cross = 60;
	private static int defense;
	private static int attack = 90;
	private static int scavenge = 50;
	//Supplies
	private static int rations = 0;
	Backpack[] list = new Backpack[6];
	//System variables
	static Scanner scan = new Scanner(System.in);
	private static int distance;
	private static int areaCurrent;
	private static int day;
	private static int travelSpeed = 25;
	
	//Constructor
	public Start()
	{
		
		Backpack tier1 = new Backpack("Sachel", 10,10);
		Backpack tier2 = new Backpack("Leather Backpack", 20,10);
		Backpack tier3 = new Backpack("Normal Backpack", 30,15);
		Backpack tier4 = new Backpack("Hiking Backpack",50,25);
		Backpack tier5 = new Backpack("Mountain Climbers Pack",75,40);
		Backpack tier6 = new Backpack("Custom Backpack", 100,50);
		
		list[0] = tier1;
		list[1] = tier2;
		list[2] = tier3;
		list[3] = tier4;
		list[4] = tier5;
		list[5] = tier6;
		
		
	}
	
	public static void main(String[] args)
	{
		mainMenu();
	}
	
//----------------------------------------------------------------------------------------------------------------
//Story methods
	private static void mainMenu() 
	{
		
		System.out.println("Welcome to Zombie Trails\n\nChoose an option (Number):");
		System.out.println("1: Start Game\n2: Quit");
		int choice = scan.nextInt();
		if(choice == 1)
		{
			intro();
			
		}
		else if(choice == 2)
		{
			System.out.println("Quitting...");
			System.exit(0);
		}
		else 
		{
			System.out.println("Please enter a valid choice.");
			textClear();
			mainMenu();
		}
	}
	
	
	
	public static void intro()
	{
		System.out.println("Caution: When making choices please input a NUMBER and\nnot the sentence/word affiliated to it. "
				+ "That will restart your game.");
		System.out.println("Understand?\n1:Yes\n2:No");
		int choice = scan.nextInt();
		if(choice == 2)
		{
			intro();
		}
		else if(choice == 1)
		{
		System.out.println("What is your name Survivor?");
		String name = scan.next();
		System.out.println("Are you sure?\n1: Yes\n2: No\n3: Maybe");
		choice = scan.nextInt();
		if(choice == 3)
		{
			System.out.println("Redo it just for safe measures.");
			intro();
		}
		else if(choice == 2)
		{
			intro();
		}
		else if(choice == 1)
		{
			textClear();
			System.out.println("You have been normally living in a zombie filled world surviving through sheer \n"
				+ "willpower, and until recently the U.S government has been inactive. It was just"
				+ " yesterday\nthat you had turned on your radio hearing the announcement from the government \nfor a spacecraft "
				+ "launch in Washington D.C to carry people off to Mars to colonize.\n\n"
				+ "\"First come first serve\" was what they said so better hurry to Washington D.C!\n\n ");
			
			menu();
		}
		else
		{
		System.out.println("Please enter a valid choice. (A number)");
		intro();
		}
		}
		else {
			System.out.println("This is what I was just talking about...");
			intro();
		}
	}
	
	private static void menu()
	{
		System.out.println();
	}
	
//----------------------------------------------------------------------------------------------------------------
//Utility methods
	
	public static void textClear()
	{
		for(int i = 0; i < 11; i++)
		{
			System.out.println();
		}
	}
	
	public static void subDistance(int num)
	{
		distance =- num;
	}
	
	public static void addDistance(int num)
	{
		distance =+ num;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


