import java.util.*;

class Prob1
{
	public static void main(String args[])
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("money spent: ");
		int ms=sc.nextInt();
		System.out.println("price of each: ");
		int poe=sc.nextInt();
		System.out.println("no of items bought: ");
		int iab=sc.nextInt();
		System.out.println(ms+" "+poe+" "+iab);
		
		int tot=iab;
		System.out.println("total no of items bought: "+find_items(iab,tot));

	}

	static int find_items(int iab,int tot)
	{
		if(iab>=10)
		{
			tot+=iab/10;
			iab=iab/10;
			return find_items(iab,tot);
		}
		else
		{
			return tot;
		
		}
	}
}