import java.util.Scanner;
public class Pattern7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n=");
		int n=sc.nextInt();
		int s=1;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print("  ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print(+s+"  ");
				s=s+1;
			}
			System.out.println();
		}

	}

}
