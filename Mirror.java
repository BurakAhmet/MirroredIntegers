import java.util.Scanner;

public class Mirror {
	
	public static void Mirror(int n) {
		System.out.printf("%d ",n);
		if(n>1 || n<-1)
		{
			Mirror(n/2);
			System.out.printf("%d ",n);
		}
	}
	
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter a number: ");
		while(!in.hasNextInt())
		{
			System.out.println("Please use just numbers");
			in.nextLine();
		}
		int n = in.nextInt();
		Mirror(n);
		in.close();
	}
}