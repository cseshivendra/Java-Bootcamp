package Day1;

public class AdditionInMethod {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int sum = add(a, b);
        System.out.println("The addition of a + b is: " + sum);
    }

    public static int add(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is: " + sum);
        return sum;
    }
}
