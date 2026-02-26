public class Main {
	public static void main(String[] args) {
		StringArrayList a = new StringArrayList();
		StringArrayList b = new StringArrayList(2);
		String[] c = new String[] { "AB", "BC", "CA" };
		StringArrayList d = new StringArrayList(c);

		a.add("Banana");
		a.add("Bridget");
		b.add("Happy Chaos");
		b.add("Apple");
		System.out.println("a.size() = " + a.size() + " b.size() = " + b.size() + " d.size() = " + d.size());
		a.set(0, "Sol");
		System.out.println(a.contains("Sol"));
		System.out.println("a.contains() = " + a.contains("Charlotte") + " b.contains() = "
				+ b.contains("Charlotte") + " d.contains() = " + d.contains("Charlotte"));
	}
}
