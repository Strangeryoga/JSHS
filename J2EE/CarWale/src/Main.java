import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to CarWale");
		
		while(true) {
			System.out.println("Press 1: to sell the car");
			System.out.println("Press 2: to buy the car");
			System.out.println("Press 3: to see latest cars");
			System.out.println("Press 4: to sell all cars available");
			System.out.println("Press 5: to exit ");
			
			int num=sc.nextInt();
			if(num==1) {
				
			}
			else if(num==2) {
				
			}
			else if(num==3) {
				Test t=new Test();
				break;
			}
			else if(num==4) {
				
			}
			else if(num==5) {
				break;
			}
			else {
				System.out.println("Please enter the correct output");
			}
		}
		
		
	}

}
