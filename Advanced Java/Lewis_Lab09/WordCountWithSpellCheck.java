import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class WordCountWithSpellCheck {
    private static final String DICTIONARY_FILE = "dictionary.txt";
    private static final Collection<String> dictionaryWords = new ArrayList<>();
    private static final Map<String, Integer> wordToFrequencyMap = new TreeMap<>();
    private static final Map<Integer, List<String>> frequencyToWordMap = new TreeMap<>(Collections.reverseOrder());
    private static final Set<String> misspelledWords = new TreeSet<>();

    public static void main(String[] args) throws FileNotFoundException {
        // Check command line argument
        if (args.length != 1) {
            System.out.println("ERROR: Missing input file. Please specify the file you want to process.");
            System.exit(1);
        }

        // Check if source file exists
        File file = new File(args[0]);
        if (!file.exists()) {
            System.out.println("Specified file " + args[0] + " does not exist");
            System.exit(2);
        }

        loadDictionaryWords();
        process(file);
        printResult();
    }

    private static void printResult() {
        System.out.println("*** Misspelled words listed in alphabetical order:");
        misspelledWords.forEach(System.out::println);
        System.out.println("*** Correctly spelled words with frequency in descending order, same frequency in alphabetical order:");
        frequencyToWordMap.forEach((freq, words) -> {
            Collections.sort(words, String.CASE_INSENSITIVE_ORDER); // Sorting words alphabetically should ignoring case
            String wordsString = String.join(" ", words); // Joining words on one line with a space to separate
            System.out.println(freq + ": " + wordsString); // Prints the frequency and words
        });
    }



    private static void process(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String word = scanner.next().replaceAll("[^a-zA-Z]", ""); // Ignores punctuation 
            if (word.isEmpty()) continue; // Skips empty words

            String lowercaseWord = word.toLowerCase(); // Converting words to lowercase
            if (dictionaryWords.contains(lowercaseWord)) { // Checks if the word is in the dictionary
                wordToFrequencyMap.merge(lowercaseWord, 1, Integer::sum); // Increments word frequency by 1
            } else {
                misspelledWords.add(lowercaseWord); // Adds misspelled word to the set
            }
        }
        scanner.close();

        // Mapping frequencies to words
        wordToFrequencyMap.forEach((word, frequency) -> {
            frequencyToWordMap.computeIfAbsent(frequency, k -> new ArrayList<>()).add(word); // Adding word to frequency map
        });
    }

    private static void loadDictionaryWords() throws FileNotFoundException {
    	Scanner input = new Scanner(new File(DICTIONARY_FILE));
        while (input.hasNext())
            dictionaryWords.add(input.next());
        input.close();
    }
}
