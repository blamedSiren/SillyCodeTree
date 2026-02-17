public class Dog {

	private String name;
	private String breed;

	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	public void play(Dog d) {
		System.out.println("The name of the dog callig this method is " + this.name);
		System.out.println("The name of the dog they are playing with is " + d.getName());
	}

	public String getName() {
		return name;
	}

	public String getBreed() {
		return breed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}
}
