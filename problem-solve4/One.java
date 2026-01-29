import java.util.Scanner;


public class One{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();
        
        if(number % 0 == 0){
            System.out.println("even.");
        } else {
            System.out.println("odd.");
        }
        input.close();
    }
}