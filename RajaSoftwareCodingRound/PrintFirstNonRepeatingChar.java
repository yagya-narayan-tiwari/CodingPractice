public class PrintFirstNonRepeatingChar{
  public static void main(String[] args) {
    String str = "swiss";
    char result = findFirstNonRepeatingCharacter(str);

    if (result != '\0') {
        System.out.println("The first non-repeating character is: " + result);
    } else {
        System.out.println("No non-repeating character found.");
    }
  }

  public static char findFirstNonRepeatingCharacter(String str) {
    // Create a HashMap to store character frequencies
    HashMap<Character, Integer> frequencyMap = new HashMap<>();

    // Traverse the string to populate the frequency map
    for (char ch : str.toCharArray()) {
        frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
    }

    // Traverse the string again to find the first non-repeating character
    for (char ch : str.toCharArray()) {
        if (frequencyMap.get(ch) == 1) {
            return ch;
        }
    }

    // Return a null character if no non-repeating character is found
    return '\0';
  }
}