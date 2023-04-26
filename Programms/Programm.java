import java.util.Scanner;
public class Programm {
    public void averageNumbers(int x, int y, int z)
    {
        float avg = (x+y+z)/3;
        System.out.println("Average of numbers are : "+avg);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second number: ");
        int num2 = sc.nextInt();
        System.out.println("Enter third number: ");
        int num3 = sc.nextInt();

        Programm obj = new Programm();
        obj.averageNumbers(num1, num2, num3);
        sc.close();
        
    }
    
}
