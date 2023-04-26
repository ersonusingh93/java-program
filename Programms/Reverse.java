import java.util.Scanner;
public class Reverse {
    void reverseNumber(int num)
    {
        int rem=0;
        int rev=0;
        while(num>0)
        {
            rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        System.out.println("Reverese of number is : "+rev);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int x = sc.nextInt();
        Reverse obj = new Reverse();
        obj.reverseNumber(x);
        
    }
}
