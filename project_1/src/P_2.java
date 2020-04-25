import java.util.Scanner;

public class P_2 {
	public static void main(String args[]){
		Scanner	input=new Scanner(System.in);
		System.out.println("input int");
		int n=input.nextInt();
		for(int i=1;i<=n/2+1;i++)
		{
			for(int k=1;k<(n-(2*i-1))/2+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<2*i-1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=n/2;i++)
		{
			for(int k=1;k<i+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<n-i*2;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
 
	}


}

