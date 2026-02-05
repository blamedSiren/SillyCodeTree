import java.util.Scanner;

public class ProblemThree {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a number(Length of the array)");
		int num = input.nextInt();
		int[] nums = new int[num];
		int holder;

		for (int i = 0; i < num; i++) {
			System.out.println("Please enter a number: ");
			holder = input.nextInt();
			nums[i] = holder;
		}
		int greatest = nums[nums.length - 1];
		int sum = 0;

		for (int i = 0; i < num; i++) {
			if (nums[i] < greatest) {
				sum += nums[i];
			}
		}
		System.out.println("Sum of numbers greater than last number: " + sum);
		input.close();
	}
}
