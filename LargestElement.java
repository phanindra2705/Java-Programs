public class LargestElement {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 19, 7};
        
        int max = numbers[0];
        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        
        System.out.println("Largest element: " + max);
    }
}
