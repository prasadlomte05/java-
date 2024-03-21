import java.util.Scanner;
class NaturalNumber{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number");
		double number=sc.nextDouble();
		if(number>0){
			System.out.println("Positiv");
		}else if(number<0){
			System.out.println("Negetiv");
		}else if(number==0){
			System.out.println("Netural");
		}

		
	}
}