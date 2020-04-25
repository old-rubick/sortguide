
public class Lab1_1 {
	public static void main(String[] args){
		int i,j,k;
		for( i=1;i<10;i++){
			for( j=1;j<10-i;j++){
				System.out.print(" ");
			}
			for( k=1;k<(i*2);k++){
				System.out.print(i);
			}
			System.out.print("\n");
		}
		for(i=1;i<9;i++){
			for(j=1;j<i;j++){
				System.out.print(" ");
			}
			for(k=1;k<(9-i)*2;k++){
				System.out.print((char)(73-i));
			}
			System.out.print("\n");
		}
		
	}
}