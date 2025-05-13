public class Prifac {
    public static void main(String[] args) {
        int number = 110; // You can change this to any number

        System.out.println("Prime factors of " + number + " are:");

        for (int i = 2; i <= number; i++) {
            // Check if 'i' is a factor
            while (number % i == 0) {
                System.out.print(i + " ");
                number = number / i;
            }
        }
    }
}
