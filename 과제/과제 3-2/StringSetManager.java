import java.util.Locale;
import java.util.Scanner;

enum StringCommand {
    ADD,
    REMOVE,
    CLEAN,
    QUIT,
    INVALID
}
public class StringSetManager {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        String[] stringSet = new String[100];
        int index = 0;

        while (true) {
            final StringCommand command = getCommand(scanner);
            if (command == StringCommand.QUIT) {
                System.out.println("BYE!");
                break;
            }

            switch (command) {
                case ADD: {
                    final String str = getString(scanner);
                    index = add(stringSet, str, index);
                    break;
                }
                case REMOVE: {
                    final String str = getString(scanner);
                    index = remove(stringSet, str, index);
                    break;
                }
                case CLEAN: {
                    index = clear(stringSet, index);
                    break;
                }
                case QUIT:
                    break;
                default:
                    System.out.println("Unknown Command!");
                    break;
            }
            print(stringSet, index);
        }
        scanner.close();
    }

    public static StringCommand getCommand(Scanner scanner) {
        StringCommand ret;
        try {
            ret = StringCommand.valueOf(scanner.next().trim().toUpperCase(Locale.ROOT));
        }
        catch (IllegalArgumentException e) {
            ret = StringCommand.INVALID;
        }
        return ret;
    }

    public static String getString(Scanner scanner) {
        String ret;
        ret = scanner.next();
        return ret;
    }

    public static int add(String[] set, String str, int index) {
        for (int i = 0; i < index; i++) {
            if (str.equals(set[i])) {
                return index;
            }
        }
        set[index] = str;
        index++;
        return index;
    }

    public static int remove(String[] set, String str, int index) {
        for (int i = 0; i < index; i++) {
            if (str.equals(set[i])) {
                for (int k = i; k < index - 1; k++) {
                    set[k] = set[k + 1];
                }
                i--;
                index--;
            }
        }
        return index;
    }

    public static int clear(String[] set, int index) {
        for (int i = 0; i < index; i++) {
            set[i] = "";
            index = 0;
        }
        return index;
    }

    public static void print(String[] set, int index) {
        System.out.print("Element Size: " + index + ", Values = [ ");
        for (int i = 0; i < index; i++) {
            System.out.print(set[i]);
            if (i < index - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
