package learn_Selenium_;

public class ElementCounter {
    public static void main(String[] args) {
        int[] array = {1, 2, 2, 3, 4, 4, 4, 5};

        // Loop through each element in the array
        for (int i = 0; i < array.length; i++) {
            // Skip if this element has already been counted
            boolean alreadyCounted = false;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    alreadyCounted = true;
                    break;
                }
            }
            if (alreadyCounted) {
                continue;
            }

            // Count occurrences of array[i]
            int count = 0;
            for (int k = 0; k < array.length; k++) {
                if (array[k] == array[i]) {
                    count++;
                }
            }

            // Print the count for array[i]
            System.out.println("Element: " + array[i] + ", Count: " + count);
        }
    }
}
