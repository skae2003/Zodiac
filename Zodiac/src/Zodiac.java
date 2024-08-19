import java.util.*;

public class Zodiac {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your birth year: ");
		
		int year = input.nextInt();
		
		int zodiac = year % 12;
		
		switch (zodiac) {
		
		case 0:
			System.out.println("You were born in the year of the Monkey");
			break;
			
		case 1:
			System.out.println("You were born in the year of the Rooster");
			break;
			
		case 2:
			System.out.println("You were born in the year of the Dog");
			break;
			
		case 3:
			System.out.println("You were born in the year of the Pig");
			break;
			
		case 4:
			System.out.println("You were born in the year of the Rat");
			break;
			
		case 5:
			System.out.println("You were born in the year of the Ox");
			break;
			
		case 6:
			System.out.println("You were born in the year of the Tiger");
			break;
			
		case 7:
			System.out.println("You were born in the year of the Rabbit");
			break;
			
		case 8:
			System.out.println("You were born in the year of the Dragon");
			break;
			
		case 9:
			System.out.println("You were born in the year of the Snake");
			break;
			
		case 10:
			System.out.println("You were born in the year of the Horse");
			break;
			
		case 11:
			System.out.println("You were born in the year of the Sheep");
			break;
		
		}
		
	}

}
