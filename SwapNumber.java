import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the numbers:");
        int a1 = s.nextInt();
        int a2 = s.nextInt();

        int temp = a1;
        a1 = a2;
        a2 = temp;

        System.out.println(a1 +"is swap to "+ a2);
    }
}
