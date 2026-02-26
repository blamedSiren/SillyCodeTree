public class StringArrayList {
	private String[] a;

	StringArrayList() {
		a = new String[10];
	}

	StringArrayList(int initialCapacity) {
		a = new String[initialCapacity];
	}

	StringArrayList(String[] arr) {
		a = arr;
	}

	public int size() {
		return a.length;
	}

	public String get(int i) {
		if (i > a.length) {
			return null;
		}
		return a[i];
	}

	public boolean add(String s) {
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] == null) {
				a[i] = s;
			}
		}
		String[] b = new String[a.length + 1];
		for (int i = 0; i < a.length; i++) {
			b[i] = a[i];
		}
		b[b.length - 1] = s;
		a = b;
		return true;
	}

	public boolean set(int i, String s) {
		if (i > a.length - 1) {
			return false;
		}
		a[i] = s;
		return true;
	}

	public boolean contains(String s) {
		for (String c : a) {
			if (c.equals(s)) {
				return true;
			}
		}
		return false;
	}
}
