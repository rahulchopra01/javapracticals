import java.util.Scanner;

class Practical5
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();
        System.out.println("Number is Binary is :"+Integer.toBinaryString(num));
    }
}