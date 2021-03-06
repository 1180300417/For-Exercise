package exercise_6_6;

import java.util.Scanner;

public class HIndex 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input the citation numbers:");
		String line = scanner.nextLine();
		
		int [] citations = new int[100];
		String[] strs;
		
		strs = line.split(",");
		for(int i = 0; i < strs.length; i++)
		{
			citations[i] = Integer.parseInt(strs[i]);
		}

		int number = bubblesort(citations);
		
		int hindex = hindex(citations, number); 
		
		System.out.println("The h-index is: " + hindex); 
		
		scanner.close();
	}

	public static int hindex(int[] citations, int number)
	{
		int hindex = 0; 
		for (int j = 0; j < number; j++) 
		{ 
			if (citations[j] >= j + 1) 
				hindex = j + 1; 
			else 
				break; 
		}
		return hindex;
	}

	public static int bubblesort(int[] citations) 
	{
		int number = citations.length;
		for(int i = 0; i < number - 1; i++)
		{
			for (int j = 0; j < number - 1; j++) 
			{ 
				if (citations[j] < citations[j + 1]) 
				{ 
					int temp = citations[j + 1]; 
					citations[j + 1] = citations[j]; 
					citations[j] = temp; 
				} 
			} 
		}
		return number;
	}

}
