import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age");
        int age = input.nextInt();

        if(age >= 18){
            System.out.println("You can vote");
        }
        if(age <= 17 && age >=0){
            System.out.println("You cannot vote");
        }
        else{
            System.out.println("You are a time traveler");
        }
        input.close();
    }
}
