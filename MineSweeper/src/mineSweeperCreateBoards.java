
public class mineSweeperCreateBoards 
{
	static String mineSweeperBoard[][];
	static String mineSweeperHiddenBoard[][];
	
	public static String[][] generateBoard(int x, int y)
	{
		mineSweeperBoard = new String [x][y];
		for(int row =0; row<x; row++)
		{
			for(int col =0; col<y; col++)
			{
			mineSweeperBoard[row][col] =" ";
			}
		}
		return mineSweeperBoard;
	}
	public static String[][] generateHiddenBoard(int x, int y)
	{
		mineSweeperHiddenBoard = new String [x][y];
		for(int row =0; row<x; row++)
		{
			for(int col =0; col<y; col++)
			{
			mineSweeperHiddenBoard[row][col] =" ";
			}
		}
		return mineSweeperHiddenBoard;
	}
	public static void displayBoardEasy()
	{	
		System.out.println();
		System.out.println("   1   2   3   4   5   6   7");
	
		System.out.println("------------------------------");
	
		System.out.println("A| "+mineSweeperBoard[0][0]+" | "+mineSweeperBoard[0][1]+" | "+mineSweeperBoard[0][2]+" | "+mineSweeperBoard[0][3]+" | "+mineSweeperBoard[0][4]+" | "+mineSweeperBoard[0][5]+" | "+mineSweeperBoard[0][6]+" | ");
		System.out.println("------------------------------");
	
		System.out.println("B| "+mineSweeperBoard[1][0]+" | "+mineSweeperBoard[1][1]+" | "+mineSweeperBoard[1][2]+" | "+mineSweeperBoard[1][3]+" | "+mineSweeperBoard[1][4]+" | "+mineSweeperBoard[1][5]+" | "+mineSweeperBoard[1][6]+" | ");
		System.out.println("------------------------------");
	
		System.out.println("C| "+mineSweeperBoard[2][0]+" | "+mineSweeperBoard[2][1]+" | "+mineSweeperBoard[2][2]+" | "+mineSweeperBoard[2][3]+" | "+mineSweeperBoard[2][4]+" | "+mineSweeperBoard[2][5]+" | "+mineSweeperBoard[2][6]+" | ");
		System.out.println("------------------------------");
	
		System.out.println("D| "+mineSweeperBoard[3][0]+" | "+mineSweeperBoard[3][1]+" | "+mineSweeperBoard[3][2]+" | "+mineSweeperBoard[3][3]+" | "+mineSweeperBoard[3][4]+" | "+mineSweeperBoard[3][5]+" | "+mineSweeperBoard[3][6]+" | ");
		System.out.println("------------------------------");
	
		System.out.println("E| "+mineSweeperBoard[4][0]+" | "+mineSweeperBoard[4][1]+" | "+mineSweeperBoard[4][2]+" | "+mineSweeperBoard[4][3]+" | "+mineSweeperBoard[4][4]+" | "+mineSweeperBoard[4][5]+" | "+mineSweeperBoard[4][6]+" | ");
		System.out.println("------------------------------");
	
		System.out.println("F| "+mineSweeperBoard[5][0]+" | "+mineSweeperBoard[5][1]+" | "+mineSweeperBoard[5][2]+" | "+mineSweeperBoard[5][3]+" | "+mineSweeperBoard[5][4]+" | "+mineSweeperBoard[5][5]+" | "+mineSweeperBoard[5][6]+" | ");
		System.out.println("------------------------------");
	
		System.out.println("G| "+mineSweeperBoard[6][0]+" | "+mineSweeperBoard[6][1]+" | "+mineSweeperBoard[6][2]+" | "+mineSweeperBoard[6][3]+" | "+mineSweeperBoard[6][4]+" | "+mineSweeperBoard[6][5]+" | "+mineSweeperBoard[6][6]+" | ");
		System.out.println("------------------------------");
	
	}

	
	public static void displayBoardMed()
	{
		System.out.println();
		System.out.println("   1   2   3   4   5   6   7   8   9   10  11  12  13  14  15");
	
		System.out.println("--------------------------------------------------------------");
	
		System.out.println("A| "+mineSweeperBoard[0][0]+" | "+mineSweeperBoard[0][1]+" | "+mineSweeperBoard[0][2]+" | "+mineSweeperBoard[0][3]+" | "+mineSweeperBoard[0][4]+" | "+mineSweeperBoard[0][5]+" | "+mineSweeperBoard[0][6]+" | "+mineSweeperBoard[0][7]+" | "+mineSweeperBoard[0][8]+" | "+mineSweeperBoard[0][9]+" | "+mineSweeperBoard[0][10]+" | "+mineSweeperBoard[0][11]+" | "+mineSweeperBoard[0][12]+" | "+mineSweeperBoard[0][13]+" | "+mineSweeperBoard[0][14]+" | ");
		System.out.println("--------------------------------------------------------------");
		System.out.println("B| "+mineSweeperBoard[1][0]+" | "+mineSweeperBoard[1][1]+" | "+mineSweeperBoard[1][2]+" | "+mineSweeperBoard[1][3]+" | "+mineSweeperBoard[1][4]+" | "+mineSweeperBoard[1][5]+" | "+mineSweeperBoard[1][6]+" | "+mineSweeperBoard[1][7]+" | "+mineSweeperBoard[1][8]+" | "+mineSweeperBoard[1][9]+" | "+mineSweeperBoard[1][10]+" | "+mineSweeperBoard[1][11]+" | "+mineSweeperBoard[1][12]+" | "+mineSweeperBoard[1][13]+" | "+mineSweeperBoard[1][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("C| "+mineSweeperBoard[2][0]+" | "+mineSweeperBoard[2][1]+" | "+mineSweeperBoard[2][2]+" | "+mineSweeperBoard[2][3]+" | "+mineSweeperBoard[2][4]+" | "+mineSweeperBoard[2][5]+" | "+mineSweeperBoard[2][6]+" | "+mineSweeperBoard[2][7]+" | "+mineSweeperBoard[2][8]+" | "+mineSweeperBoard[2][9]+" | "+mineSweeperBoard[2][10]+" | "+mineSweeperBoard[2][11]+" | "+mineSweeperBoard[2][12]+" | "+mineSweeperBoard[2][13]+" | "+mineSweeperBoard[2][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("D| "+mineSweeperBoard[3][0]+" | "+mineSweeperBoard[3][1]+" | "+mineSweeperBoard[3][2]+" | "+mineSweeperBoard[3][3]+" | "+mineSweeperBoard[3][4]+" | "+mineSweeperBoard[3][5]+" | "+mineSweeperBoard[3][6]+" | "+mineSweeperBoard[3][7]+" | "+mineSweeperBoard[3][8]+" | "+mineSweeperBoard[3][9]+" | "+mineSweeperBoard[3][10]+" | "+mineSweeperBoard[3][11]+" | "+mineSweeperBoard[3][12]+" | "+mineSweeperBoard[3][13]+" | "+mineSweeperBoard[3][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("E| "+mineSweeperBoard[4][0]+" | "+mineSweeperBoard[4][1]+" | "+mineSweeperBoard[4][2]+" | "+mineSweeperBoard[4][3]+" | "+mineSweeperBoard[4][4]+" | "+mineSweeperBoard[4][5]+" | "+mineSweeperBoard[4][6]+" | "+mineSweeperBoard[4][7]+" | "+mineSweeperBoard[4][8]+" | "+mineSweeperBoard[4][9]+" | "+mineSweeperBoard[4][10]+" | "+mineSweeperBoard[4][11]+" | "+mineSweeperBoard[4][12]+" | "+mineSweeperBoard[4][13]+" | "+mineSweeperBoard[4][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("F| "+mineSweeperBoard[5][0]+" | "+mineSweeperBoard[5][1]+" | "+mineSweeperBoard[5][2]+" | "+mineSweeperBoard[5][3]+" | "+mineSweeperBoard[5][4]+" | "+mineSweeperBoard[5][5]+" | "+mineSweeperBoard[5][6]+" | "+mineSweeperBoard[5][7]+" | "+mineSweeperBoard[5][8]+" | "+mineSweeperBoard[5][9]+" | "+mineSweeperBoard[5][10]+" | "+mineSweeperBoard[5][11]+" | "+mineSweeperBoard[5][12]+" | "+mineSweeperBoard[5][13]+" | "+mineSweeperBoard[5][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("G| "+mineSweeperBoard[6][0]+" | "+mineSweeperBoard[6][1]+" | "+mineSweeperBoard[6][2]+" | "+mineSweeperBoard[6][3]+" | "+mineSweeperBoard[6][4]+" | "+mineSweeperBoard[6][5]+" | "+mineSweeperBoard[6][6]+" | "+mineSweeperBoard[6][7]+" | "+mineSweeperBoard[6][8]+" | "+mineSweeperBoard[6][9]+" | "+mineSweeperBoard[6][10]+" | "+mineSweeperBoard[6][11]+" | "+mineSweeperBoard[6][12]+" | "+mineSweeperBoard[6][13]+" | "+mineSweeperBoard[6][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("H| "+mineSweeperBoard[7][0]+" | "+mineSweeperBoard[7][1]+" | "+mineSweeperBoard[7][2]+" | "+mineSweeperBoard[7][3]+" | "+mineSweeperBoard[7][4]+" | "+mineSweeperBoard[7][5]+" | "+mineSweeperBoard[7][6]+" | "+mineSweeperBoard[7][7]+" | "+mineSweeperBoard[7][8]+" | "+mineSweeperBoard[7][9]+" | "+mineSweeperBoard[7][10]+" | "+mineSweeperBoard[7][11]+" | "+mineSweeperBoard[7][12]+" | "+mineSweeperBoard[7][13]+" | "+mineSweeperBoard[7][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("I| "+mineSweeperBoard[8][0]+" | "+mineSweeperBoard[8][1]+" | "+mineSweeperBoard[8][2]+" | "+mineSweeperBoard[8][3]+" | "+mineSweeperBoard[8][4]+" | "+mineSweeperBoard[8][5]+" | "+mineSweeperBoard[8][6]+" | "+mineSweeperBoard[8][7]+" | "+mineSweeperBoard[8][8]+" | "+mineSweeperBoard[8][9]+" | "+mineSweeperBoard[8][10]+" | "+mineSweeperBoard[8][11]+" | "+mineSweeperBoard[8][12]+" | "+mineSweeperBoard[8][13]+" | "+mineSweeperBoard[8][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("J| "+mineSweeperBoard[9][0]+" | "+mineSweeperBoard[9][1]+" | "+mineSweeperBoard[9][2]+" | "+mineSweeperBoard[9][3]+" | "+mineSweeperBoard[9][4]+" | "+mineSweeperBoard[9][5]+" | "+mineSweeperBoard[9][6]+" | "+mineSweeperBoard[9][7]+" | "+mineSweeperBoard[9][8]+" | "+mineSweeperBoard[9][9]+" | "+mineSweeperBoard[9][10]+" | "+mineSweeperBoard[9][11]+" | "+mineSweeperBoard[9][12]+" | "+mineSweeperBoard[9][13]+" | "+mineSweeperBoard[9][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("K| "+mineSweeperBoard[10][0]+" | "+mineSweeperBoard[10][1]+" | "+mineSweeperBoard[10][2]+" | "+mineSweeperBoard[10][3]+" | "+mineSweeperBoard[10][4]+" | "+mineSweeperBoard[10][5]+" | "+mineSweeperBoard[10][6]+" | "+mineSweeperBoard[10][7]+" | "+mineSweeperBoard[10][8]+" | "+mineSweeperBoard[10][9]+" | "+mineSweeperBoard[10][10]+" | "+mineSweeperBoard[10][11]+" | "+mineSweeperBoard[10][12]+" | "+mineSweeperBoard[10][13]+" | "+mineSweeperBoard[10][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("L| "+mineSweeperBoard[11][0]+" | "+mineSweeperBoard[11][1]+" | "+mineSweeperBoard[11][2]+" | "+mineSweeperBoard[11][3]+" | "+mineSweeperBoard[11][4]+" | "+mineSweeperBoard[11][5]+" | "+mineSweeperBoard[11][6]+" | "+mineSweeperBoard[11][7]+" | "+mineSweeperBoard[11][8]+" | "+mineSweeperBoard[11][9]+" | "+mineSweeperBoard[11][10]+" | "+mineSweeperBoard[11][11]+" | "+mineSweeperBoard[11][12]+" | "+mineSweeperBoard[11][13]+" | "+mineSweeperBoard[11][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("M| "+mineSweeperBoard[12][0]+" | "+mineSweeperBoard[12][1]+" | "+mineSweeperBoard[12][2]+" | "+mineSweeperBoard[12][3]+" | "+mineSweeperBoard[12][4]+" | "+mineSweeperBoard[12][5]+" | "+mineSweeperBoard[12][6]+" | "+mineSweeperBoard[12][7]+" | "+mineSweeperBoard[12][8]+" | "+mineSweeperBoard[12][9]+" | "+mineSweeperBoard[12][10]+" | "+mineSweeperBoard[12][11]+" | "+mineSweeperBoard[12][12]+" | "+mineSweeperBoard[12][13]+" | "+mineSweeperBoard[12][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("N| "+mineSweeperBoard[13][0]+" | "+mineSweeperBoard[13][1]+" | "+mineSweeperBoard[13][2]+" | "+mineSweeperBoard[13][3]+" | "+mineSweeperBoard[13][4]+" | "+mineSweeperBoard[13][5]+" | "+mineSweeperBoard[13][6]+" | "+mineSweeperBoard[13][7]+" | "+mineSweeperBoard[13][8]+" | "+mineSweeperBoard[13][9]+" | "+mineSweeperBoard[13][10]+" | "+mineSweeperBoard[13][11]+" | "+mineSweeperBoard[13][12]+" | "+mineSweeperBoard[13][13]+" | "+mineSweeperBoard[13][14]+" | ");		System.out.println("--------------------------------------------------------------");
		System.out.println("O| "+mineSweeperBoard[14][0]+" | "+mineSweeperBoard[14][1]+" | "+mineSweeperBoard[14][2]+" | "+mineSweeperBoard[14][3]+" | "+mineSweeperBoard[14][4]+" | "+mineSweeperBoard[14][5]+" | "+mineSweeperBoard[14][6]+" | "+mineSweeperBoard[14][7]+" | "+mineSweeperBoard[14][8]+" | "+mineSweeperBoard[14][9]+" | "+mineSweeperBoard[14][10]+" | "+mineSweeperBoard[14][11]+" | "+mineSweeperBoard[14][12]+" | "+mineSweeperBoard[14][13]+" | "+mineSweeperBoard[14][14]+" | ");		System.out.println("--------------------------------------------------------------");
		
	}
	
	
	
	
	
	
	public static void placeBombs(int x)
	{
	for(int i =0; i<x;i++)
		{
		int bombLocationRow = (int)(Math.random()*6)+1;
		int bombLocationCol = (int)(Math.random()*6)+1;
		if(mineSweeperHiddenBoard [bombLocationRow][bombLocationCol].equals("b"))
			{
			i = i -1;
			}
		if(mineSweeperHiddenBoard [bombLocationRow][bombLocationCol].equals(" "))
			{
			mineSweeperHiddenBoard [bombLocationRow][bombLocationCol] = "b";
			}
		}
	}
	
	
	public static void setNumbers(int x, int y)
	{
	
	for(int row =0; row<x; row++)
		{
		for(int col =0; col<y; col++)
			{
			int i =0;
				if(mineSweeperHiddenBoard[row][col].equals("b"))
					{
				
					}
				else
				{
					if(row>=1&&row<x-1&&col==0)
					{
						if(mineSweeperHiddenBoard[row + 1][col].equals( "b"))
						{
						i = i+1;
						}
					if(mineSweeperHiddenBoard[row -1][col].equals( "b"))
						{
						i = i+1;
						}
					if(mineSweeperHiddenBoard[row + 1][col+1].equals( "b"))
						{
						i = i+1;
						}

					if(mineSweeperHiddenBoard[row - 1][col +1].equals( "b"))
						{
						i = i+1;
						}
					if(mineSweeperHiddenBoard[row ][col +1].equals( "b"))
						{
						i = i+1;
						}
					else
						{
						i = i+0;
						}
					String a = Integer.toString(i);
					mineSweeperHiddenBoard[row][col] = a;
					}
				
			if(row>=1&&col>=1&&row<x-1&&col<y-1)
			{
			if(mineSweeperHiddenBoard[row + 1][col].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row -1][col].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row + 1][col+1].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row - 1][col-1].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row + 1][col -1].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row - 1][col +1].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row ][col +1].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row ][col-1].equals( "b"))
				{
				i = i+1;
				}
			else
				{
				i = i+0;
				}
			String a = Integer.toString(i);
			mineSweeperHiddenBoard[row][col] = a;
			}
		if(row ==0 && col >=1&&col<y-1)
			{
				if(mineSweeperHiddenBoard[row + 1][col].equals( "b"))
				{
					i = i+1;
				}
				if(mineSweeperHiddenBoard[row + 1][col+1].equals( "b"))
				{
					i = i+1;
				}
				if(mineSweeperHiddenBoard[row + 1][col -1].equals( "b"))
				{
					i = i+1;
				}
				if(mineSweeperHiddenBoard[row ][col +1].equals( "b"))
				{
					i = i+1;
				}
				if(mineSweeperHiddenBoard[row ][col-1].equals( "b"))
				{
					i = i+1;
				}
				else
				{
					i = i+ 0;
				}
				String a = Integer.toString(i);
				mineSweeperHiddenBoard[row][col] = a;
			}
		if(row >=1&&row>x-1 &&col==0)
			{
				if(mineSweeperHiddenBoard[row + 1][col].equals( "b"))
				{
					i = i+1;
				}
				
				if(mineSweeperHiddenBoard[row -1][col].equals( "b"))
				{
					i = i+1;
				}
				
				if(mineSweeperHiddenBoard[row + 1][col+1].equals( "b"))
				{
					i = i+1;
				}
				
				if(mineSweeperHiddenBoard[row - 1][col +1].equals( "b"))
				{
					i = i+1;
				}
				
				if(mineSweeperHiddenBoard[row][col +1].equals( "b"))
				{
					i = i+1;
				}
				
				else
				{
					i = i+ 0;
				}
			
			String a = Integer.toString(i);
			mineSweeperHiddenBoard[row][col] = a;
			}
		
		if(row==x-1&&col>=1&&col<y-1)
			{
			if(mineSweeperHiddenBoard[row -1][col].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row - 1][col-1].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row - 1][col +1].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row ][col +1].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row ][col-1].equals( "b"))
				{
				i = i+1;
				}
			else
				{
				i = i+0;
				}
			String a = Integer.toString(i);
			mineSweeperHiddenBoard[row][col] = a;
			}
		if(row>=1&&row<x-1&&col==y-1)
			{
			if(mineSweeperHiddenBoard[row + 1][col].equals( "b"))
			{
			i = i+1;
			}
		if(mineSweeperHiddenBoard[row -1][col].equals( "b"))
			{
			i = i+1;
			}
		if(mineSweeperHiddenBoard[row - 1][col-1].equals( "b"))
			{
			i = i+1;
			}
		if(mineSweeperHiddenBoard[row + 1][col -1].equals( "b"))
			{
			i = i+1;
			}
		if(mineSweeperHiddenBoard[row ][col-1].equals( "b"))
			{
			i = i+1;
			}
		else
			{
			i = i+0;
			}
		String a = Integer.toString(i);
		mineSweeperHiddenBoard[row][col] = a;
		}
			
		
		
		if(row ==0&&col==0)
			{
			if(mineSweeperHiddenBoard[row + 1][col].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row + 1][col+1].equals( "b"))
				{
				i = i+1;
				}
			if(mineSweeperHiddenBoard[row ][col +1].equals( "b"))
				{
				i = i+1;
				}
			else
				{
				i = i+0;
				}
			String a = Integer.toString(i);
			mineSweeperHiddenBoard[row][col] = a;
			}
			if(row ==x-1&&col==0)
				{
				if(mineSweeperHiddenBoard[row -1][col].equals( "b"))
				{
					i = i+1;
				}

				if(mineSweeperHiddenBoard[row - 1][col +1].equals( "b"))
				{
					i = i+1;
				}
				if(mineSweeperHiddenBoard[row ][col +1].equals( "b"))
				{
					i = i+1;
				}
				else
				{
					i = i+0;
				}
				String a = Integer.toString(i);
				mineSweeperHiddenBoard[row][col] = a;
				}
			if(row==x-1&&col==y-1)
				{
				if(mineSweeperHiddenBoard[row -1][col].equals( "b"))
					{
					i = i+1;
					}
				if(mineSweeperHiddenBoard[row - 1][col-1].equals( "b"))
					{
					i = i+1;
					}
				if(mineSweeperHiddenBoard[row ][col-1].equals( "b"))
					{
					i = i+1;
					}
				else
					{
					i = i+0;
					}
				String a = Integer.toString(i);
				mineSweeperHiddenBoard[row][col] = a;
				}
			if(row ==0&&col==y-1)	
				{
				if(mineSweeperHiddenBoard[row + 1][col].equals( "b"))
					{
					i = i+1;
					}
				if(mineSweeperHiddenBoard[row + 1][col -1].equals( "b"))
					{
					i = i+1;
					}
				if(mineSweeperHiddenBoard[row ][col-1].equals( "b"))
					{
					i = i+1;
					}	
				else
					{
					i = i+0;
					}
				String a = Integer.toString(i);
				mineSweeperHiddenBoard[row][col] = a;
				}
				}
			
		}
		
	}
}

	public static void printHiddenBoard()
	{
		
		System.out.println();
		System.out.println("   1   2   3   4   5   6   7");

		System.out.println("------------------------------");

		System.out.println("A| "+mineSweeperHiddenBoard[0][0]+" | "+mineSweeperHiddenBoard[0][1]+" | "+mineSweeperHiddenBoard[0][2]+" | "+mineSweeperHiddenBoard[0][3]+" | "+mineSweeperHiddenBoard[0][4]+" | "+mineSweeperHiddenBoard[0][5]+" | "+mineSweeperHiddenBoard[0][6]+" | ");
		System.out.println("------------------------------");

		System.out.println("B| "+mineSweeperHiddenBoard[1][0]+" | "+mineSweeperHiddenBoard[1][1]+" | "+mineSweeperHiddenBoard[1][2]+" | "+mineSweeperHiddenBoard[1][3]+" | "+mineSweeperHiddenBoard[1][4]+" | "+mineSweeperHiddenBoard[1][5]+" | "+mineSweeperHiddenBoard[1][6]+" | ");
		System.out.println("------------------------------");

		System.out.println("C| "+mineSweeperHiddenBoard[2][0]+" | "+mineSweeperHiddenBoard[2][1]+" | "+mineSweeperHiddenBoard[2][2]+" | "+mineSweeperHiddenBoard[2][3]+" | "+mineSweeperHiddenBoard[2][4]+" | "+mineSweeperHiddenBoard[2][5]+" | "+mineSweeperHiddenBoard[2][6]+" | ");
		System.out.println("------------------------------");

		System.out.println("D| "+mineSweeperHiddenBoard[3][0]+" | "+mineSweeperHiddenBoard[3][1]+" | "+mineSweeperHiddenBoard[3][2]+" | "+mineSweeperHiddenBoard[3][3]+" | "+mineSweeperHiddenBoard[3][4]+" | "+mineSweeperHiddenBoard[3][5]+" | "+mineSweeperHiddenBoard[3][6]+" | ");
		System.out.println("------------------------------");

		System.out.println("E| "+mineSweeperHiddenBoard[4][0]+" | "+mineSweeperHiddenBoard[4][1]+" | "+mineSweeperHiddenBoard[4][2]+" | "+mineSweeperHiddenBoard[4][3]+" | "+mineSweeperHiddenBoard[4][4]+" | "+mineSweeperHiddenBoard[4][5]+" | "+mineSweeperHiddenBoard[4][6]+" | ");
		System.out.println("------------------------------");

		System.out.println("F| "+mineSweeperHiddenBoard[5][0]+" | "+mineSweeperHiddenBoard[5][1]+" | "+mineSweeperHiddenBoard[5][2]+" | "+mineSweeperHiddenBoard[5][3]+" | "+mineSweeperHiddenBoard[5][4]+" | "+mineSweeperHiddenBoard[5][5]+" | "+mineSweeperHiddenBoard[5][6]+" | ");
		System.out.println("------------------------------");

		System.out.println("G| "+mineSweeperHiddenBoard[6][0]+" | "+mineSweeperHiddenBoard[6][1]+" | "+mineSweeperHiddenBoard[6][2]+" | "+mineSweeperHiddenBoard[6][3]+" | "+mineSweeperHiddenBoard[6][4]+" | "+mineSweeperHiddenBoard[6][5]+" | "+mineSweeperHiddenBoard[6][6]+" | ");
		System.out.println("------------------------------");
	}

	public static void changeBoard(int x, int y,int row, int col)
	{
		mineSweeperBoard[row][col] =mineSweeperHiddenBoard[row][col];
		if(mineSweeperHiddenBoard[row][col].equals("0"))
			{
			
			//a1
			if(row ==0&&col==0)
			{
			if(!mineSweeperHiddenBoard[row + 1][col].equals( "b"))
				{
				mineSweeperBoard[row +1][col] = mineSweeperHiddenBoard[row+1][col];
				
				}
			if(!mineSweeperHiddenBoard[row + 1][col+1].equals( "b"))
				{
				mineSweeperBoard[row +1][col+1] = mineSweeperHiddenBoard[row+1][col+1];
				}
				
			if(!mineSweeperHiddenBoard[row ][col +1].equals( "b"))
				{
				mineSweeperBoard[row][col+1] = mineSweeperHiddenBoard[row][col+1];
				
				}
			else
				{

				}
			
			}
			
			//g1
			
			else if(row ==x-1&&col==0)
		{
		if(!mineSweeperHiddenBoard[row -1][col].equals( "b"))
		{
			mineSweeperBoard[row -1][col] = mineSweeperHiddenBoard[row-1][col];
			
		}

		if(!mineSweeperHiddenBoard[row - 1][col +1].equals( "b"))
		{
			mineSweeperBoard[row -1][col+1] = mineSweeperHiddenBoard[row-1][col+1];
			
		}
		if(!mineSweeperHiddenBoard[row ][col +1].equals( "b"))
		{
			mineSweeperBoard[row][col+1] = mineSweeperHiddenBoard[row][col+1];
			
		}
		else
		{
			
		}
		}
		
		
		//a7
		
		else if(row ==0&&col==y-1)	
		{
		if(!mineSweeperHiddenBoard[row + 1][col].equals( "b"))
			{
			mineSweeperBoard[row +1][col] = mineSweeperHiddenBoard[row+1][col];
			
			}
		if(!mineSweeperHiddenBoard[row + 1][col -1].equals( "b"))
			{
			mineSweeperBoard[row +1][col-1] = mineSweeperHiddenBoard[row+1][col-1];
			
			}
		if(!mineSweeperHiddenBoard[row ][col-1].equals( "b"))
			{
			mineSweeperBoard[row][col-1] = mineSweeperHiddenBoard[row][col-1];
			
			}	
		else
			{
			
			}
		

			}
		
		
		
		//g7
		
		
		else if(row==x-1&&col==y-1)
			{
			if(!mineSweeperHiddenBoard[row -1][col].equals( "b"))
				{
				mineSweeperBoard[row -1][col] = mineSweeperHiddenBoard[row-1][col];
				
				}
			if(!mineSweeperHiddenBoard[row - 1][col-1].equals( "b"))
				{
				mineSweeperBoard[row -1][col-1] = mineSweeperHiddenBoard[row-1][col-1];
				
				}
			if(!mineSweeperHiddenBoard[row ][col-1].equals( "b"))
				{
				mineSweeperBoard[row][col-1] = mineSweeperHiddenBoard[row][col-1];
				
				}
			else
				{
				
				}
			}
		
		
			
			
		else if(row>=1&&row<x-1&&col==0)
			{
				if(!mineSweeperHiddenBoard[row + 1][col].equals( "b"))
				{
					mineSweeperBoard[row +1][col] = mineSweeperHiddenBoard[row+1][col];
					
				}
				
			if(!mineSweeperHiddenBoard[row -1][col].equals( "b"))
				{
				mineSweeperBoard[row -1][col] = mineSweeperHiddenBoard[row-1][col];
				
				}
			if(!mineSweeperHiddenBoard[row + 1][col+1].equals( "b"))
				{
				mineSweeperBoard[row +1][col+1] = mineSweeperHiddenBoard[row+1][col+1];
				
				}

			if(!mineSweeperHiddenBoard[row - 1][col +1].equals( "b"))
				{
				mineSweeperBoard[row -1][col+1] = mineSweeperHiddenBoard[row-1][col+1];
				
				}
			if(!mineSweeperHiddenBoard[row ][col +1].equals( "b"))
				{
				mineSweeperBoard[row][col+1] = mineSweeperHiddenBoard[row][col+1];
				
				}
			else
				{
				
				}
			}
		
	
			
			
		else if(row>=1&&col>=1&&row<x-1&&col<y-1)
	{
	if(!mineSweeperHiddenBoard[row + 1][col].equals( "b"))
		{
		mineSweeperBoard[row +1][col] = mineSweeperHiddenBoard[row+1][col];
		
		}
	if(!mineSweeperHiddenBoard[row -1][col].equals( "b"))
		{
		mineSweeperBoard[row -1][col] = mineSweeperHiddenBoard[row-1][col];
		
		}
	if(!mineSweeperHiddenBoard[row + 1][col+1].equals( "b"))
		{
		mineSweeperBoard[row +1][col+1] = mineSweeperHiddenBoard[row+1][col+1];
		
		}
	if(!mineSweeperHiddenBoard[row - 1][col-1].equals( "b"))
		{
		mineSweeperBoard[row -1][col-1] = mineSweeperHiddenBoard[row-1][col-1];
		
		}
	if(!mineSweeperHiddenBoard[row + 1][col -1].equals( "b"))
		{
		mineSweeperBoard[row +1][col-1] = mineSweeperHiddenBoard[row+1][col-1];
		
		}
	if(!mineSweeperHiddenBoard[row - 1][col +1].equals( "b"))
		{
		mineSweeperBoard[row -1][col+1] = mineSweeperHiddenBoard[row+1][col-1];
		
		}
	if(!mineSweeperHiddenBoard[row ][col +1].equals( "b"))
		{
		mineSweeperBoard[row][col+1] = mineSweeperHiddenBoard[row][col+1];
		
		}
	if(!mineSweeperHiddenBoard[row ][col-1].equals( "b"))
		{
		mineSweeperBoard[row][col-1] = mineSweeperHiddenBoard[row][col-1];
		
		}
	else
		{
		
		}
	}
	
	
	
	
	
	
	else if(row ==0 && col >0&&col<y-1)
	{
		if(!mineSweeperHiddenBoard[row + 1][col].equals( "b"))
		{
			mineSweeperBoard[row +1][col] = mineSweeperHiddenBoard[row+1][col];
			
		}
		if(!mineSweeperHiddenBoard[row + 1][col+1].equals( "b"))
		{
			mineSweeperBoard[row +1][col+1] = mineSweeperHiddenBoard[row+1][col+1];
				
			}
		if(!mineSweeperHiddenBoard[row + 1][col -1].equals( "b"))
		{
			mineSweeperBoard[row +1][col-1] = mineSweeperHiddenBoard[row+1][col-1];
			
		}
		if(!mineSweeperHiddenBoard[row ][col +1].equals( "b"))
		{
			mineSweeperBoard[row][col+1] = mineSweeperHiddenBoard[row][col+1];
			
		}
		if(!mineSweeperHiddenBoard[row ][col-1].equals( "b"))
		{
			mineSweeperBoard[row][col-1] = mineSweeperHiddenBoard[row][col-1];
			
		}
		else
		{
			
		}
		}





		else if(row >=1&&row>x-1 &&col==0)
	{
		if(!mineSweeperHiddenBoard[row + 1][col].equals( "b"))
		{
			mineSweeperBoard[row +1][col] = mineSweeperHiddenBoard[row+1][col];
			
		}
		
		if(!mineSweeperHiddenBoard[row -1][col].equals( "b"))
		{
			mineSweeperBoard[row -1][col] = mineSweeperHiddenBoard[row-1][col];
			
		}
		
		if(!mineSweeperHiddenBoard[row + 1][col+1].equals( "b"))
		{
			mineSweeperBoard[row +1][col+1] = mineSweeperHiddenBoard[row+1][col+1];
			
		}
		
		if(!mineSweeperHiddenBoard[row - 1][col +1].equals( "b"))
		{
			mineSweeperBoard[row -1][col+1] = mineSweeperHiddenBoard[row-1][col+1];
			
		}
		
		if(!mineSweeperHiddenBoard[row][col +1].equals( "b"))
		{
			mineSweeperBoard[row][col+1] = mineSweeperHiddenBoard[row][col+1];
			
		}
		
		else
		{
			
		}
	
	}







if(row==x-1&&col>=1&&col<y-1)
	{
	if(!mineSweeperHiddenBoard[row -1][col].equals( "b"))
		{
		mineSweeperBoard[row -1][col] = mineSweeperHiddenBoard[row-1][col];
		
		}
	if(!mineSweeperHiddenBoard[row - 1][col-1].equals( "b"))
		{
		mineSweeperBoard[row -1][col-1] = mineSweeperHiddenBoard[row-1][col-1];
		
		}
	if(!mineSweeperHiddenBoard[row - 1][col +1].equals( "b"))
		{
		mineSweeperBoard[row -1][col+1] = mineSweeperHiddenBoard[row-1][col+1];
		
		}
	if(!mineSweeperHiddenBoard[row ][col +1].equals( "b"))
		{
		mineSweeperBoard[row ][col+1] = mineSweeperHiddenBoard[row][col+1];
		
		}
	if(!mineSweeperHiddenBoard[row ][col-1].equals( "b"))
		{
		mineSweeperBoard[row ][col-1] = mineSweeperHiddenBoard[row][col-1];
		
		}
	else
		{
		
		}
	}






if(row>=1&&row<x-1&&col==y-1)
	{
	if(!mineSweeperHiddenBoard[row + 1][col].equals( "b"))
		{
		mineSweeperBoard[row +1][col] = mineSweeperHiddenBoard[row+1][col];
		
		}
	if(!mineSweeperHiddenBoard[row -1][col].equals( "b"))
		{
		mineSweeperBoard[row -1][col] = mineSweeperHiddenBoard[row-1][col];
		
		}
	if(!mineSweeperHiddenBoard[row - 1][col-1].equals( "b"))
		{
		mineSweeperBoard[row -1][col-1] = mineSweeperHiddenBoard[row-1][col-1];
		
		}
	if(!mineSweeperHiddenBoard[row + 1][col -1].equals( "b"))
		{
		mineSweeperBoard[row +1][col-1] = mineSweeperHiddenBoard[row+1][col-1];
		
		}
	if(!mineSweeperHiddenBoard[row ][col-1].equals( "b"))
		{
		mineSweeperBoard[row ][col-1] = mineSweeperHiddenBoard[row][col-1];
		
		}
	else
		{
		
		}
	}
	

	
		displayBoardEasy();
			
			}
	if(mineSweeperHiddenBoard[row][col].equals("b"))
		{
		Minesweeper.stillPlaying = false;
		printHiddenBoard();
		Minesweeper.gameOver();
		}
	else if(mineSweeperHiddenBoard[row][col].equals("1")||mineSweeperHiddenBoard[row][col].equals("2")||mineSweeperHiddenBoard[row][col].equals("3")||mineSweeperHiddenBoard[row][col].equals("4")||mineSweeperHiddenBoard[row][col].equals("5")||mineSweeperHiddenBoard[row][col].equals("6")||mineSweeperHiddenBoard[row][col].equals("7")||mineSweeperHiddenBoard[row][col].equals("8"))
	{
		displayBoardEasy();
	}
	
	}

	public static void spaceCounter(int s, int x, int y)
	{
		s =0;
		for(int row =0; row<x; row++)
		{
			for(int col =0; col<y; col++)
			{
			if(!mineSweeperBoard[row][col].equals(" "))
				{
				s = s +1;
				}
			}
		}
		if(s ==42)
		{
			Minesweeper.win = true;
			Minesweeper.gameOver();
			
		}
	}
}