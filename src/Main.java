public class Main {
    public static void main(String[] args) {
        String[] array = new String[3];
        try {
            System.out.println(array[10]);
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
        System.out.println("Print");
        System.out.println();

        try {
            printSomething1("ThRoW");
        } catch (Exception e) {
            System.out.println("Exception thrown: "+ e.getMessage());
            e.printStackTrace();
        }
        try {
            printSomething1("inny tekst");
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public static void printSomething1(final String input) throws MyException {
        printSomething2(input);
    }
    public static void printSomething2(final String input) throws MyException {
        printSomething3(input);
    }
    public static void printSomething3(final String input) throws MyException {
        printSomething4(input);
    }

    public static void printSomething4(final String input) throws MyException {
        if ("Throw".equalsIgnoreCase(input)) {
            throw new MyException();
        } else {
            System.out.println(input);
        }
    }
}
