import java.util.Scanner;
 
 class Practical7{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
	
		int x=0,s=0;
		for(int i=0;i<args.length;i++){
			x=sc.nextInt();
			s+=x;
		}
		
		System.out.print("\nSum is: "+s);
	}
}