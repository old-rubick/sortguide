
public class Lab1_2 {
	public static void main(String[] args){
		int day;
		int year=Integer.parseInt(args[0]);
		int moon=Integer.parseInt(args[0]);
		if((year%4==0&&year%100!=0)||year%400==0)
		switch(moon){
		case 1:
			day=31;
			break;
		case 3:
			day=31;
			break;
		case 4:
			day=30;
			break;
		case 5:
			day=31;
			break;
		case 6:
			day=30;
			break;
		case 7:
			day=31;
			break;
		case 8:
			day=31;
			break;
		case 9:
			day=30;
			break;
		case 10:
			day=31;
			break;
		case 11:
			day=30;
			break;
		case 12:
			day=31;
			break;
		
		}
		if((year%4==0&&year%100!=0)||year%400==0)day=29;
		else day=28;
	}
}
