import java.util.HashSet;

public class FindXBest {

    public static int findXBest(int[] A) {
        HashSet<Integer> negValues = new HashSet<>();
        
        // Store negative values in HashSet
        for (int x : A) {
            int negValue = -(2 * x + 17);
            negValues.add(negValue);
        }
        
        // Check if each element exists in HashSet
        for (int x : A) {
            if (negValues.contains(x)) {
                return x;
            }
        }
        
        // If no such value exists
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {-20, -19, -18, -15, -10, -7, -5, -3, 0, 1, 4, 6, 8, 10, 12, 14, 16};
        int result = findXBest(array);
        if (result != -1) {
            System.out.println("Value of x: " + result);
        } else {
            System.out.println("No such value exists.");
        }
    }
}