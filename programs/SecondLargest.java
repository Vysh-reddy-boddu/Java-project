package programs;

public class SecondLargest {
    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 8, 30, 25};
        
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("Largest number is: " + largest);
        System.out.println("Second Largest number is: " + secondLargest);
    }
}
