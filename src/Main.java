import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        try {
            // Scans the number of inputs.
            int n = Integer.parseInt(scanner.nextLine());

            for (int i = 0; i < n; i++) {
                // Scans user input.
                String input = scanner.nextLine();

                // Stores the elements at the even position.
                StringBuilder oddBuilder = new StringBuilder();

                // Stores the elements at the odd position.
                StringBuilder evenBuilder = new StringBuilder();

                // Converts input to a String array.
                String[] array = input.split("");

                // Bifurcates elements at even and odd position.
                for (int j = 0; j < array.length; j++) {
                    if (j % 2 == 0) {
                        evenBuilder.append(array[j]);
                    } else {
                        oddBuilder.append(array[j]);
                    }
                }

                // Prints the bifurcation.
                System.out.println(evenBuilder + " " + oddBuilder);
            }
        } catch (NumberFormatException e) {
            System.out.println("Error - Cannot parse input value.");
        } finally {
            // Closes the scanner.
            scanner.close();
        }
    }
}
