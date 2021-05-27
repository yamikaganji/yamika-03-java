import java.util.Scanner;

public class Strings {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int t= sc.nextInt();
		for(int j=0;j<t;j++)
		{
		String s1=sc.next();
		s1=s1.toLowerCase();
		String s2=sc.next();
		s2=s2.toLowerCase();
		int a=0;int b=0;
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)=='?'||s2.charAt(i)=='?')
			{
				a++;
				
			}
			if(s1.charAt(i)!='?'&&s2.charAt(i)!='?')
			{
				if(s1.charAt(i)!=s2.charAt(i))
				{
					b++;
					
				}
			}
		}
		System.out.println(b+" "+(a+b));
		}
	}

}
