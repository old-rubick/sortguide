import java.util.Scanner;

public class P_1 {
	public static void main(String args[]){
		Scanner	input=new Scanner(System.in);
		System.out.println("input int");
		int i=input.nextInt();
		int n,m,o;
		o=1;
		for(n=0;n<i;n++){
			for(m=0;m<i;m++){
				System.out.print(o+" ");
				o+=1;
			}
			System.out.println();
		}
		input.close();
	}

}
