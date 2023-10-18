import java.util.Scanner;

class Pangram
{
	public static boolean isPangram(String s)
	{
		int[] letters = new int[26];
		s = s.toLowerCase();
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)>='a' && s.charAt(i)<='z')
				letters[s.charAt(i)-'a'] = 1;
		}

		for( int i: letters)
		{
			if(i==0)
				return false;
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.print("Enter the string : ");
		s = sc.nextLine();
		boolean result = isPangram(s);
		if(result)
			System.out.println(s + " is pangram");
		else
			System.out.println(s + " is not pangram");
	}
}