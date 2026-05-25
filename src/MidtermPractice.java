import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class MidtermPractice {

    public static void main(String[] args) {
        
        //Method 1
        List<String> l1 = new ArrayList<>();
        l1.add("ever"); l1.add("love"); l1.add("doomed");
        l1.add("e"); l1.add(""); l1.add("Tried");

        System.out.println(findLongestWord(l1));

        //Method 2
        Map<String, Integer> m1 = new HashMap<>();
        m1.put("Mappppttt", 1); m1.put("Map", 323);
        m1.put("Hello", 2); m1.put("Perchance", 7);

        System.out.println(countLongWords(m1));

        //Method 3
        float[] a1 = {2.4f, 5.5f, 17.1f, 0f, 9f, 4.3f};
        System.out.println(findAverage(a1));

        //Method 4
        System.out.println(countOddNumbers(m1));

        //Method 5
        int[] a2 = {3, 6, 9};
        int[] a3 = {3, 4, 6, 9};

        System.out.println(allDivisibleBy3(a2));
        System.out.println(allDivisibleBy3(a3));
    }

    /**
     * Finds the longest word in an List of Strings.
     * @param list an ArrayList of words
     * @return the longest word in the list
     * Example: input: ["apple", "banana", "kiwi"] -> output: "banana"
     */
    public static String findLongestWord(List<String> list) {
        String lWord = "";
        for( String x : list )
        {
            if(lWord.length() < x.length())
            {
                lWord = x;
            }
        }
        return lWord;
    }

    /**
     * Counts how many words are longer than 5 characters in the keys of a Map.
     * @param map a Map of strings to integers
     * @return the count of words longer than 5 characters
     * Example: input: ["why"=7, "hello"=8, "brilliant"=99, "world"=15, "amazing"=17] -> output: 2
     */
    public static int countLongWords(Map<String, Integer> map) {
        int count = 0;
        for( String x : map.keySet() )
        {
            if(x.length() > 5){count++;}
        }
        return count; 
    }

    /**
     * Finds the average of the floats in an array.
     * @param arr an array of floats
     * @return the average of the values
     * Example: input: [1.5, 3.5, 2.0, 3.0] -> output: 2.5
     */
    public static double findAverage(float[] arr) {
        double tot = 0.0;
        for(int i = 0; i < arr.length; i++)
        {
            tot += arr[i];
        }
        return (tot/(arr.length));
    }

    /**
     * Counts how many odd numbers there are in the values of a Map.
     * @param map a HashMap of String keys and Integer values
     * @return the count of odd numbers in the values
     * Example: input: {"a"=7, "x"=4, "z"=5} -> output: 2
     */
    public static int countOddNumbers(Map<String, Integer> map) {
        int count = 0;
        for( String x : map.keySet() )
        {
            if(map.get(x) % 2 != 0){count++;}
        }
        return count;
    }

    /**
     * Returns true if all values are divisible by 3 in an array.
     * @param arr an array of integers
     * @return true if all values are divisible by 3, false otherwise
     * Example: input: [3, 6, 9] -> output: true
     * Example 2: input: [3, 4, 6, 9] -> output: false
     */
    public static boolean allDivisibleBy3(int[] arr) {
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] % 3 != 0){return false;}
        }
        return true;
    }

    /**
     * Returns true if all words start with 'a' in an ArrayList of Strings.
     * @param list an ArrayList of words
     * @return true if all words start with 'a', false otherwise
     * Example: input: ["apple", "apricot", "avocado"] -> output: true
     * Example: input: ["apple", "banana", "avocado"] -> output: false
     */
    public static boolean allStartWithA(List<String> list) {
        return false;
    }

    /**
     * OPTIONAL MORE CHALLENGING PROBLEM
     * NOT REQUIRED
     *
     * Determines if the array can be split into two contiguous subarrays with equal sums.
     * The method checks if there exists an index where the sum of elements to the left of the index
     * is equal to the sum of elements to the right. Both subarrays must be contiguous.
     *
     * @param arr an array of integers to evaluate
     * @return true if there exists a split point where the left and right contiguous subarrays have equal sums, false otherwise
     *
     * Example:
     * Input: [1, 3, 8, 2, 1, 2, 7]
     * Output: true (since [1, 3, 8] and [2, 1, 2, 7] both sum to 12)
     *
     * Input: [1, 2, 3, 4, 5]
     * Output: false (no contiguous split results in equal sums)
     */
    public static boolean canPartitionWithEqualSums(int[] arr) {
        return false;
    }

}