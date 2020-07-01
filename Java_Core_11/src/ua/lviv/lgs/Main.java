package ua.lviv.lgs;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		//1
		Integer[] intArray = new Integer[10];
		
		for (int i = 0; i < intArray.length; i++) 
		{
			intArray[i] = (int)(10 * Math.random());
		}
		System.out.println("\nCreated");
		System.out.println(Arrays.deepToString(intArray));

		Arrays.sort(intArray);
		System.out.println("\nSorted");
		System.out.println(Arrays.deepToString(intArray));
		
		
		Arrays.sort(intArray, Collections.reverseOrder());
		System.out.println("\nReverese sorted");
		System.out.println(Arrays.deepToString(intArray));

		
		//2
		Automobile[][] automobile = new Automobile[(int)(10 * Math.random())][(int)(10 * Math.random())];
		
		for (int i = 0; i < automobile.length; i++) 
		{
			for (int j = 0; j < automobile[i].length; j++) 
			{
				automobile[i][j] = new Automobile((int)(600 * Math.random() + 100), (int)(70 * Math.random() + 1950));
			}
		}
		
		Scanner scan = new Scanner(System.in);
		boolean running = true;
		while(running)
		{
			System.out.println("\nEnter: \n1 if you want to see car array;\n2 if you want to overwrite all cars with one type;"
					+ "\n3 if you want to exit menu;"
					);
			
			int decision = scan.nextInt();
			
			switch(decision)
			{
				case 1:
				{
					System.out.println(Arrays.deepToString(automobile));
					break;
				}
				case 2:
				{
					for(int i = 0; i < automobile.length; i++)
					{
						Arrays.fill(automobile[i], new Automobile(115, 1956));
					}
					break;
				}
				case 3:
				{
					running = false;
					break;
				}
			}
		}
	}

}
