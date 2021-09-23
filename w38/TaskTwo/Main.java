class Main {
	public static boolean happy = true;
	
	public static void main(String [] args) {
		if (iAmHappy()) {
			System.out.println("I clap my hands");
		}
		else {
			System.out.println("I don't clap my hands"); 
		}
		System.out.println(sum(5,7));
		System.out.println(upper("Hello, World!"));
		System.out.println(isFirstLetterUpper("Hej"));
		System.out.println(isFirstLetterUpper("hEJ"));
	}
	
	private static boolean iAmHappy() {
		// fill out what is missing here: 
		return happy;
	}
	
	private static int sum(int ...arr) {
		int res = 0;
		for (int i : arr) {
			res += i;
		}
		return res;
	}
	
	private static String upper(String str) {
		return str.toUpperCase();
	}
	
	private static boolean isFirstLetterUpper(String str) {
		char firstChar = str.charAt(0);
		if (Character.isUpperCase(firstChar)) {
			return true;
		}
		return false;
	}
}