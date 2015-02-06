import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	private static boolean isPrime(int n){
		boolean flag = true;
		for(int i=2; i<=Math.sqrt(n); i++){
			if(n%i == 0){
				flag = false;
			}
		}
		return flag;
	}
	
	private static List<Integer> getAllPrimes(int a, int b){
		List<Integer> primes = new ArrayList<Integer>();
		for(int i=a; i<=b; i++){
			if(isPrime(i)){
				primes.add(i);
			}
		}
		return primes;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		boolean flag = false;
		
		do{
			System.out.print("Enter a: ");
			int a = sc.nextInt();
			
			System.out.print("Enter b: ");
			int b = sc.nextInt();
			
			if(a<0 || b<0){
				System.out.println("Both numbers should be positive!");
			}
			else if(a>=b){
				System.out.println("The first number should be lower than the second one!");
			}
			else{
				flag = true;
				System.out.println(getAllPrimes(a,b));
			}
		}while(flag == false);
		
		sc.close();
	}
}
