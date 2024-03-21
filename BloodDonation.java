import java.util.Scanner;
class BloodDonation{
public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Age-");
	int Age=sc.nextInt();
	if(Age<20){
		System.out.println("Not Adalt");
	} else{
		System.out.println("Have you consume cigar or alcohol (yes/no)");
		String nasha=sc.next().toLowerCase();		
		if(nasha.equals("no")){
			System.out.println("Enter your Weight");
			double Weight=sc.nextDouble();
				if(Weight<50){
				System.out.println("over Weight");
			}else{
				System.out.println("Donet Your Blood");
			}
		}
	}

}

}
