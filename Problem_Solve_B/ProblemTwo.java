public class ProblemTwo {

	public static void main(String[] args) {
		char[] arr = { 'o', 'c', 'k', 'o', 'a', 'u', 'q', 'm', 'l', 'c', 'k', 'x', 'h', 'n', 'r', 'd', 'u', 'i',
				'r', 'u' };

		for (char i : arr) {
			if (i == 'a' || i == 'e' || i == 'u' || i == 'i' || i == 'o') {
				System.out.println(i);
			}
		}
	}
}
