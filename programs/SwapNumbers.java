package programs;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        System.out.println("Before Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // swap without third variable
        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("After Swap:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
