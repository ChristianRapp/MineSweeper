import java.util.Scanner;

public class Minesweeper 
{

		
		static int coordinatesRow;
		static int coordinatesCol;
		static boolean stillPlaying = true;
		static boolean win = false;
		static int counter;
		static int spaces;
		public static void mineSweeperEz() 
		{
			mineSweeperCreateBoards.generateBoard(7,7);
			mineSweeperCreateBoards.generateHiddenBoard(7,7);
			mineSweeperCreateBoards.placeBombs(7);
			mineSweeperCreateBoards.setNumbers(7,7);
			
			greeting();
			mineSweeperCreateBoards.displayBoardEasy();
			
			playGameEz();
			
		}
		public static void mineSweeperMed()
		{
			mineSweeperCreateBoards.generateBoard(15,15);
			mineSweeperCreateBoards.generateHiddenBoard(15,15);
			mineSweeperCreateBoards.placeBombs(15);
			mineSweeperCreateBoards.setNumbers(15,15);
			
			greeting();
			mineSweeperCreateBoards.displayBoardMed();
			
			playGameEz();
		}
		public static void greeting()
		{
			Scanner userInput = new Scanner(System.in);
			System.out.println("Hello, welcome to minesweeper!");
			System.out.println("Your objective is to avoid the mines.");
			System.out.println("If you choose a position that has a mine, you lose.");
			System.out.println("If you avoid all the mines and display all other positions you win!");
			System.out.println("To choose a position type in the row(letter) and then collumn(number) i.e A1");
			System.out.println("Press any key when you are ready to play.");
			userInput.nextLine();
		}
			
		
	
		
		


				
				
	
		
		public static void userGuess()
		{
			Scanner userInput = new Scanner(System.in);
			String coordinates =userInput.nextLine();
			String coordinatesLetter = coordinates.substring(0,1);
			switch(coordinatesLetter)
			{
			case "a":
			case "A":
				{
				coordinatesRow=0;
				break;
				}
			case "b":
			case "B":
				{
				coordinatesRow=1;
				break;
				}
			case "c":
			case "C":
				{
				coordinatesRow=2;
				break;
				}
			case "d":
			case "D":
				{
				coordinatesRow=3;
				break;
				}
			case "e":
			case "E":
				{
				coordinatesRow=4;
				break;
				}
			case "f":
			case "F":
				{
				coordinatesRow=5;
				break;
				}
			case "g":
			case "G":
				{
				coordinatesRow=6;
				break;
				}
			}
			coordinatesCol = Integer.parseInt(coordinates.substring(1))-1;
		}
		


		public static void playGameEz()
		{
			while(stillPlaying)
			{
				userGuess();
				mineSweeperCreateBoards.changeBoard(7,7,coordinatesRow,coordinatesCol);
				mineSweeperCreateBoards.spaceCounter(0,7,7);
			}
		}
		public static void playGameMed()
		{
		while(stillPlaying)
		{
			userGuess();
			mineSweeperCreateBoards.changeBoard(15,15,coordinatesRow,coordinatesCol);
			mineSweeperCreateBoards.spaceCounter(0,15,15);
		}
		}
		
		public static void gameOver()
		{
			if(win == true)
				{
				System.out.println("Congrats you won!");
				}
			else
			{
				System.out.println("Sorry you lost!");
			}
		}


}
