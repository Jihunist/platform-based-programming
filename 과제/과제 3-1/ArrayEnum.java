import java.util.Locale;
import java.util.Scanner;

public class ArrayEnum {
    enum Command {
        ADD,
        LIST,
        SUM,
        MAX,
        MIN,
        QUIT,
        INVALID_COMMAND;
    }

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        int[] values = new int[100];
        int index = 0;

        while (true) {
            final Command command = getCommand(scanner);
            if (command == Command.QUIT) {
                System.out.println("Bye!");
                break;
            }

            switch (command) {
                case ADD:
                    final int newValue = getValue(scanner);
                    values[index] = newValue;
                    index++;
                    break;
                case LIST:
                    printList(values, index);
                    break;
                case SUM:
                    System.out.println(getSum(values, index));
                    break;
                case MAX:
                    System.out.println(getMax(values, index));
                    break;
                case MIN:
                    System.out.println(getMin(values, index));
                    break;
                case QUIT:
                    break;
                default:
                    System.out.println("Invalid Command");
                    break;

            }
        }

        scanner.close();
    }

    public static Command getCommand(Scanner scanner) {
        String input = scanner.next().trim().toUpperCase(Locale.ROOT);

        Command ret;
        try {
            ret = Command.valueOf(input);
        }
        catch (IllegalArgumentException e){
            ret = Command.INVALID_COMMAND;
        }

        return ret;
    }

    public static int getValue(Scanner scanner) {
        int ret = scanner.nextInt();
        return ret;
    }

    public static void printList(int[] values, int index) {
        for (int i = 0; i < index; i++) {
            System.out.print(values[i]);
            System.out.print(" ");
        }
        System.out.println();
        return;
    }

    public static int getSum(int[] values, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += values[i];
        }
        return sum;
    }

    public static int getMax(int[] values, int index) {
        int max = 0;
        for (int i = 0; i < index; i++) {
            if (max < values[i]) {
                max = values[i];
            }
        }
        return max;
    }

    public static int getMin(int[] values, int index) {
        int min = 0;
        if (index >= 1) min = values[0];

        for (int i = 1; i < index; i++) {
            if (min > values[i]) {
                min = values[i];
            }
        }
        return min;
    }
}
