public class ArraySum {
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25}; // Example array
        int sum = calculateSum(numbers);
        System.out.println("Sum of array elements: " + sum);
    }

    public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num; // Adding each element to sum
        }
        return sum;
    }
}