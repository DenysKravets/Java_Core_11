package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		//1
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) 
		{
			list.add((int) (10 * Math.random()));
		}
		
		System.out.println("\nBefore sorting");
		System.out.println(list);
		
		Collections.sort(list);
		
		System.out.println("\nAfter sorting");
		System.out.println(list);
		
		Collections.sort(list, Collections.reverseOrder());

		System.out.println("\nAfter reverese sorting");
		System.out.println(list);
		
		//2
		ArrayList<ArrayList<Automobile>> automobile = new ArrayList<ArrayList<Automobile>>();
		
		for(int i = 0; i < (int) (2 + 1 * Math.random()); i++)
		{
			automobile.add(new ArrayList<Automobile>());
			
			for (int j = 0; j < (int) (2 + 1 * Math.random()); j++) 
			{
				automobile.get(i).add(new Automobile());
				automobile.get(i).get(j).setRandom();
			}
		}
		
		System.out.println("\nCars");
		System.out.println(automobile);
		
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
					System.out.println(automobile);
					break;
				}
				case 2:
				{
					for(ArrayList object: automobile)
					{
						Collections.fill(object, new Automobile(155, 1978, 5, "Plastic", 3));
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
