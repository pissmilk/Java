import java.util.Scanner;

public class TestingInput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String op = input.nextLine();
        if (op.equals("double")) {
            int i = input.nextInt();
            System.out.println(square(i));
        }
    }

    private static int square(int i) {
        return i*2;
    }
}
