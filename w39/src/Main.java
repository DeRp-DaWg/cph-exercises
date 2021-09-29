import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main
{
    static Scanner scan;
    private static String[] text;

    public static void main(String[] args) throws FileNotFoundException
    {
        File file = new File("data.txt");
        scan = new Scanner(file);

        String inputFromFile = "";

        while (scan.hasNextLine())                                // checks if theres more lines in the file
        {
            inputFromFile += scan.nextLine();                     // adds each line to the inputFromFile string.
        }

        text = inputFromFile.split(" ");                    // Creates and array of strings, where each element is a single word from the file.
        System.out.println(text.length);

        printWordsStartingWith("Ø");

        printWordsOfLength(3);


        //test dine metoder ved at kalde dem her:
        printLongestWord();
        printFirstHalfOfEachWord();
        printMostFrequentLetter();
        printLessFrequentLetter();

    }

    private static void printWordsOfLength(int l)
    {
        boolean wordisvalid = true;

        for (String s : text)
        {
            if (s.length() == l)
            {
                if (s.contains(",") || s.contains("."))
                {
                    wordisvalid = false;
                }

                if (wordisvalid)
                {
                    System.out.println(s);
                }
            }
        }
    }

    private static void printWordsStartingWith(String pattern)
    {
        for (String s : text) // for each word in text
        {
            if (s.startsWith(pattern) || s.startsWith(pattern.toLowerCase()))
            {
                System.out.println(s);
            }
        }
    }

    //skriv dine metoder herunder:
    private static void printLongestWord() {
        System.out.print("The longest word: ");
        String longest = "";
        for (String s : text) {
            if (s.length() > longest.length()) {
                longest = s;
            }
        }
        System.out.println(longest);
    }

    private static void printFirstHalfOfEachWord() {
        System.out.println("First half of each word: ");
        for (String s : text) {
            System.out.println(s.substring(0,s.length()/2));
        }
    }

    private static void printMostFrequentLetter() {
        System.out.println("10 letters that occur the most: ");
        ArrayList<Character> charArray = new ArrayList<Character>();
        HashMap<Character, Integer> occurrences = new HashMap<Character, Integer>();
        char[] letters = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
        for (char c : letters) {
            occurrences.put(c, 1);
        }
        for (String s : text) {
            for (char c : s.toCharArray()) {
                if (occurrences.containsKey(c)) {
                    occurrences.put(c, occurrences.get(c)+1);
                }
            }
        }
        Object[] a = occurrences.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });
        for (int i = 0; i < 10; i++) {
            System.out.println(((Map.Entry<Character, Integer>) a[i]).getKey() + " : "
                    + ((Map.Entry<Character, Integer>) a[i]).getValue());
        }
    }
    private static void printLessFrequentLetter() {
        System.out.println("10 letters that occur the least: ");
        ArrayList<Character> charArray = new ArrayList<Character>();
        HashMap<Character, Integer> occurrences = new HashMap<Character, Integer>();
        char[] letters = "abcdefghijklmnopqrstuvwxyzæøå".toCharArray();
        for (char c : letters) {
            occurrences.put(c, 1);
        }
        for (String s : text) {
            for (char c : s.toCharArray()) {
                if (occurrences.containsKey(c)) {
                    occurrences.put(c, occurrences.get(c)+1);
                }
            }
        }
        Object[] a = occurrences.entrySet().toArray();
        Arrays.sort(a, new Comparator() {
            public int compare(Object o1, Object o2) {
                return ((Map.Entry<String, Integer>) o2).getValue()
                        .compareTo(((Map.Entry<String, Integer>) o1).getValue());
            }
        });
        for (int i = a.length-1; i > a.length-11; i--) {
            System.out.println(((Map.Entry<Character, Integer>) a[i]).getKey() + " : "
                    + ((Map.Entry<Character, Integer>) a[i]).getValue());
        }
    }
}
