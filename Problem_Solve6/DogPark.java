import java.util.Scanner;

public class DogPark {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("What is the first dog's name?");
		String nameOne = input.nextLine();
		System.out.println("What is it's breed?");
		String breedOne = input.nextLine();
		System.out.println("What is the Second dog's name?");
		String nameTwo = input.nextLine();
		System.out.println("What is it's breed?");
		String breedTwo = input.nextLine();

		Dog dogOne = new Dog(nameOne, breedOne);
		Dog dogTwo = new Dog(nameTwo, breedTwo);

		dogOne.play(dogTwo);
		input.close();
	}

}
