package main;

public class Character {
	private static String name;
	private static int health;
	private static int hunger;
	private static int currentPack;
	private static int currentWeapon;
	private static int currentClothes;
	
	public Character(String n)
	{
		name = n;
		health = 100;
		 hunger = 100;
		 currentPack = 0;
		 currentWeapon = 0;
		 currentClothes = 0;;
	}
}
