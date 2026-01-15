import java.util.Scanner;

public class ProblemSolve0{
    public static void main(String[] args) {
        Scanner problem = new Scanner(System.in);
        System.out.println("Problem Solving 0\nWhat problem do you want to showcase?");
        int problemNumber = problem.nextInt();
        switch(problemNumber){
            case 1:
                problemOne();
                break;
            case 2:
                problemTwo();
                break;
            case 3:
                problemThree();
                break;
            case 4:
                problemFour();
                break;
            case 5:
                problemFive();
                break;
            case 6:
                problemSix();
                break;
            case 7:
                problemSeven();
                break;
            default:
                System.out.println("Invalid problem number.");
                break;
        }
    }
        
        
        
        
        
        
        
    
        public static void problemOne(){
            Scanner input = new Scanner(System.in);
            int total = 0;
            int count = 0;
            while(count < 5){
                System.out.print("Enter a number: ");
                int num = input.nextInt();
                total = total + num; // total += num;
                count = count + 1; // count++;
            }
            float average = total / count;
            System.out.println("The average is: " + average);
        }

        public static void problemTwo(){
            Scanner input = new Scanner(System.in);
            int secretNumber = 7;
            System.out.print("Guess the secret number (between 1 and 10): ");
            int guess = input.nextInt();
            while(guess != secretNumber){
                System.out.print("Try again: ");
                guess = input.nextInt();
            }
            System.out.print("Correct!");
        }

        public static void problemThree(){
            Scanner input = new Scanner(System.in);
            int positiveCount = 0;
            for(int i = 1; i <= 5; i++){
                System.out.print("Enter a number: ");
                int num = input.nextInt();
                if(num > 0){
                    positiveCount++;
                }
            }
            System.out.print("Positive Count: " + positiveCount);
        }

        public static void problemFour(){
            int[] numbers = {4, 9, 2, 7, 5};
            int max = numbers[0];
            for(int i = 0; i < numbers.length; i++){
                if(numbers[i] > max){
                    max = numbers[i];
                }
            }
            System.out.print("The maximum number is: " + max);
        }

        public static void problemFive(){
            Scanner input = new Scanner(System.in);
            String correctPassword = "abc123";
            int attempts = 0;
            while(attempts < 3){
                System.out.print("Enter password: ");
                String password = input.nextLine();
                if(password.equals(correctPassword)){
                    System.out.print("Access Granted");
                    break;
                }
                    attempts++;
                    System.out.print("Incorrect password. ");
            }
            if(attempts == 3){
                System.out.println("Account Locked");
            }
        }

        public static void problemSix(){
            int total = 0;
            for(int i = 1; i <= 20; i++){
                if(i % 2 == 0){
                    total += i;
                }
            }
            System.out.print(("The sum of even numbers is: " + total));
        }

        public static void problemSeven(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a word: ");
            String word = input.nextLine();
            int countVowels = 0;
            for(int i = 0; i < word.length(); i++){
                char c = word.charAt(i);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                    countVowels++;
            }
            }
            System.out.print("Number of vowels: " + countVowels);
        }
        
    }
