import java.util.Random;

public class MinMaxNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int number = random.nextInt(100) + 1; // 1 to 100
        int min = number;
        int max = number;

        System.out.println("Random numbers drawn:");

        int count = 1;
        System.out.print(number + " "); // print the 1st number

        while (count < 10) {
            number = random.nextInt(100) + 1;

            System.out.print(number + " "); 

            // Update min and max
            if (number < min) {
                min = number;
            }
            if (number > max) {
                max = number;
            }

            count++;
        }

        System.out.println("\n\nSmallest number: " + min);
        System.out.println("Largest number: " + max);
    }
}
