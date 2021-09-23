class Main {
	public static void main(String[] args) {
		int[] intArray = {1,3,5,7,9};
		String[] stringArray = {"Hell","o, W","orld!"};
		boolean[] booleanArray = {true,false,false,true};
		printStringArray(stringArray);
		System.out.println(sum(intArray));
		System.out.println(mean(intArray));
		
		int[] intArray2 = {16,43,35,10,77,60,99};
		int[] intSorted = bubbleSort(intArray2);
		for (int i : intSorted) {
			System.out.println(i);
		}
	}
	public static void printStringArray(String[] array) {
		for (String str : array) {
			System.out.print(str);
		}
		System.out.println();
	}
	public static int sum(int[] array) {
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}
	public static float mean(int[] array) {
		int sum = 0;
		int count = 0;
		for (int i : array) {
			count++;
			sum += i;
		}
		return sum/count;
	}
	public static int[] bubbleSort(int[] array) {
		//int[] sortedArray = new int[array.length];
		boolean isSorted = false;
		int count = 0;
		while (!isSorted) {
			isSorted = true;
			for (int i = 0; i < array.length-1-count; i++) {
				if (array[i] > array[i+1]) {
					isSorted = false;
					int temp = array[i+1];
					array[i+1] = array[i];
					array[i] = temp;
				}
			}
			count++;
		}
		return array;
	}
}