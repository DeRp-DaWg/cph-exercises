class Datamatik {
	static Student[] studentArray = new Student[10];
	public static void main(String[] args) {
		//Student[] studentArray = new Student[10];
		for (int i = 0; i < studentArray.length; i++) {
			String name = "student"+(i+1);
			int age = i;
			boolean isFemale = i%2 == 0 ? true : false;
			studentArray[i] = new Student(name,age,isFemale,'a');
		}
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(findNameWithIndex(studentArray,i));
		}
		System.out.println();
		for (int i = 0; i < studentArray.length; i++) {
			System.out.println(findName(studentArray,studentArray[i].getName()));
		}
		System.out.println(findName(studentArray,"bob"));
		//for (int i = 0)
		//System.out.println(teacher.getName());
		//System.out.println(student1.getName() +" hold-"+ student1.getDatamatikerTeam());
		//System.out.println(student2.getName() +" hold-"+ student2.getDatamatikerTeam());
	}
	static String findNameWithIndex(Student[] students, int index) {
		return students[index].getName();
	}
	static String findName(Student[] students, String name) {
		for (Student student : students) {
			if (student.getName() == name) {
				return student.getName();
			}
		}
		return null;
	}
}