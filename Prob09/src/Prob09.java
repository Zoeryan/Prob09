import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.ArrayList;
public class Prob09
	{
	public static void main(String[] args) throws FileNotFoundException
		{
		int digitSix = 0;
		int digitFive = 0;
		int digitFour = 0;
		int digitThree = 0;
		int digitTwo = 0;
		int digitOne = 0;
		ArrayList myArray = new ArrayList();
		Scanner input = new Scanner(new File("Prob09.txt"));
		while(input.hasNextInt())
			{
			int length = 0;
			String result = "";
			String degree = "";
			double index = input.nextInt();
			int dollars = (int)index;
			double decimal = index -(int)index;

			for(int y = 0; y < String.valueOf(dollars).length(); y++)
				{
				length++;
				}

			for(int i = 0; i < length; i++)
				{
				if(length == 6)
					{
					digitOne = dollars % 10;
					dollars /= 10;
					digitTwo = dollars % 10;
					dollars /= 10;
					digitThree = dollars % 10;
					dollars /= 10;
					digitFour = dollars % 10;
					dollars /= 10;
					digitFive = dollars % 10;
					dollars /= 10;
					digitSix = dollars % 10;
					dollars /= 10;
					degree = "Hundred Thousand";
					}
				if(length == 5)
					{
					digitOne = dollars % 10;
					dollars /= 10;
					digitTwo = dollars % 10;
					dollars /= 10;
					digitThree = dollars % 10;
					dollars /= 10;
					digitFour = dollars % 10;
					dollars /= 10;
					digitFive = dollars % 10;
					dollars /= 10;
					degree = "Ten Thousand";
					}
				if(length == 4)
					{
					digitOne = dollars % 10;
					dollars /= 10;
					digitTwo = dollars % 10;
					dollars /= 10;
					digitThree = dollars % 10;
					dollars /= 10;
					digitFour = dollars % 10;
					dollars /= 10;
					digitFive = dollars % 10;
					dollars /= 10;
					degree = "Thousand";
					}
				if(length == 3)
					{
					digitOne = dollars % 10;
					dollars /= 10;
					digitTwo = dollars % 10;
					dollars /= 10;
					digitThree = dollars % 10;
					dollars /= 10;
					digitFour = dollars % 10;
					dollars /= 10;
					digitFive = dollars % 10;
					dollars /= 10;
					degree = "Hundred";
					}
				
				for(int w = 0; w < length; w++)
					{
					if(length == 6)
						{
					switch(digitSix)
						{
						case 1: 
							{
							result += "One Hundred Thousand ";
							break;
							}
						case 2:
							{
							result += "Two Hundred Thousand ";
							break;
							}
						case 3:
							{
							result += "Three Hundred Thousand ";
							break;
							}
						case 4:
							{
							result += "Four Hundred Thousand ";
							break;
							}
						case 5:
							{
							result += "Five Hundred Thousand ";
							break;
							}
						case 6:
							{
							result += "Six Hundred Thousand ";
							break;
							}
						case 7:
							{
							result += "Seven Hundred Thousand ";
							break;
							}
						case 8:
							{
							result += "Eight Hundred Thousand ";
							break;
							}
							
						case 9:
							{
							result += "Nine Hundred Thousand ";
							break;
							}
						}
						}
						
					if(length == 6 || length == 5)
						{
						switch(digitFive)
						{
						case 1: 
							{
							switch(digitFour)
							{
							case 1:
								{
								result += "Eleven Thousand";
								}
							case 2:
								{
								result += "Eleven Thousand";
								}
							case 3:
								{
								result += "Eleven Thousand";
								}
							case 4:
								{
								result += "Eleven Thousand";
								}
							case 5:
								{
								result += "Eleven Thousand";
								}
							case 6:
								{
								result += "Eleven Thousand";
								}
							case 7:
								{
								result += "Eleven Thousand";
								}
							case 8:
								{
								result += "Eleven Thousand";
								}
							case 9:
								{
								result += "Eleven Thousand";
								}
								
								
								
							}
							result += "One Hundred Thousand ";
							break;
							}
						case 2:
							{
							result += "Two Hundred Thousand ";
							break;
							}
						case 3:
							{
							result += "Three Hundred Thousand ";
							break;
							}
						case 4:
							{
							result += "Four Hundred Thousand ";
							break;
							}
						case 5:
							{
							result += "Five Hundred Thousand ";
							break;
							}
						case 6:
							{
							result += "Six Hundred Thousand ";
							break;
							}
						case 7:
							{
							result += "Seven Hundred Thousand ";
							break;
							}
						case 8:
							{
							result += "Eight Hundred Thousand ";
							break;
							}
						}
						}
					}
				}
			if(decimal == 1)
				{
				System.out.println(result + "Dollars and 1 Cent.");
				}
			else
				{
				int decimalTwo = (int) decimal;
			System.out.println(result + "Dollars and " + decimalTwo + " cents.");
				}
			}
	}
	}
	
