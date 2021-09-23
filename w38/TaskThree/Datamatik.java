class Datamatik {
	public static void main(String[] args) {
		Teacher teacher = new Teacher("Jesper",0,false);
		Student student1 = new Student("Lars",20,false,'a');
		Student student2 = new Student("Lars2",0,false,'a');
		
		System.out.println(teacher.getName());
		System.out.println(student1.getName() +" hold-"+ student1.getDatamatikerTeam());
		System.out.println(student2.getName() +" hold-"+ student2.getDatamatikerTeam());
	}
}