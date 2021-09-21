import java.util.*;
import java.util.*;

class Prob2
{

	public static void main(String args[])
	{	

		Scanner sc=new Scanner(System.in);

		System.out.println("medicine is taken on: ");
		int medi_day=sc.nextInt();

		System.out.println("next dose to be taken after: ");
		int next_day=sc.nextInt();

		System.out.println("ext dose to be taken on: "+find_next_day(medi_day,next_day));
 
	}
 
	static String find_next_day(int medi_day,int next_day)
	{
	
		HashMap<Integer,String> days=new HashMap<Integer,String>();
		days.put(1,"sun");
		days.put(2,"mon");
		days.put(3,"tues");
		days.put(4,"wednes");
		days.put(5,"thurs");
		days.put(6,"fri");
		days.put(7,"satur");

		int ans=1+(medi_day-1+next_day)%7;
		return days.get(ans);

		
	}

} 