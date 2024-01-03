public class DamkaBoard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 0; i < n; i++) {
            // For even rows, start with an asterisk, for odd rows, start with a space
            boolean startWithAsterisk = i % 2 == 0;

            for (int j = 0; j < n; j++) {
                if (startWithAsterisk) {
                    System.out.print((j % 2 == 0) ? "* " : "  "); // Print "* " for even-indexed columns, "  " for odd
                } else {
                    System.out.print((j % 2 == 0) ? "  " : "* "); // Print "  " for even-indexed columns, "* " for odd
                }
            }
            System.out.println();
        }
    }
}

