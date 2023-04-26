import java.util.Scanner;
public class Decision {
    void display()
    {
        System.out.println("How are you?");
    }
    void addition(int x, int y)
    {
        int sum = x + y;
        System.out.println("Addition of two numbers are: "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Decision obj = new Decision();
        obj.display();
        // obj.addition(25, 26);
        System.out.println("Enter First Number: ");
        int num1  = sc.nextInt();
        System.out.println("Enter Second Number: ");
        int num2  = sc.nextInt();

        obj.addition(num1, num2);
        sc.close();
    }
    
}
