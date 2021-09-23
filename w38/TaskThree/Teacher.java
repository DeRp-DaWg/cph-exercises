public class Teacher {
	String name;
	int age;
	boolean isFemale;
	public Teacher(String name, int age, boolean isFemale) {
		this.name = name;
		this.age = age;
		this.isFemale = isFemale;
	}
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	boolean getIsFemale() {
		return isFemale;
	}
}