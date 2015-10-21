import java.util.Scanner;


public class Main {

	public static void main(String[] args) 
	{
		Scanner userInput = new Scanner(System.in);
		System.out.println("Which game mode would you like to play?");
		System.out.println("Easy(1) Medium(2) Hard(3)");
		switch(userInput.nextInt())
		{
		case 1:
			
		}
		//Minesweeper.mineSweeperMed();
		Minesweeper.mineSweeperEz();

	}

}
