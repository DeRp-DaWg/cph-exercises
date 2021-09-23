public class Student {
	String name;
	int age;
	boolean isFemale;
	char datamatikerTeam;
	public Student(String name, int age, boolean isFemale, char datamatikerTeam) {
		this.name = name;
		this.age = age;
		this.isFemale = isFemale;
		this.datamatikerTeam = datamatikerTeam;
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
	char getDatamatikerTeam() {
		return datamatikerTeam;
	}
}