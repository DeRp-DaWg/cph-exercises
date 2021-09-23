class Main {
	public static void main(String[] args) {
		emptyLine();
		stringParameter("Hello, World!");
		nameAndAge("Lars",20);
	}
	static void emptyLine() {
		System.out.println();
	}
	static void stringParameter(String str) {
		System.out.println(str);
	}
	static void nameAndAge(String name, int age) {
		System.out.println("My name is "+name+", I am "+age+" years old");
	}
}