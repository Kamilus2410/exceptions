public class MainRuntime {
    public static void main(String[] args) {

        try {
            printSomething1("ThRoW");
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }
        try {
            printSomething5("dupa");
        } catch (Exception e) {
            System.out.println("Exception thrown: " + e.getMessage());
        }
    }

    private static void printSomething5(String input) {
        if ("Dupa".equalsIgnoreCase(input)) {
            throw new RuntimeException("Standard Runtime Exception");
        } else {
            System.out.println(input);
        }
    }


    public static void printSomething1(final String input) {
        printSomething2(input);
    }

    public static void printSomething2(final String input) {
        printSomething3(input);
    }

    public static void printSomething3(final String input) {
        printSomething4(input);
    }

    public static void printSomething4(final String input) {
        if ("Throw".equalsIgnoreCase(input)) {
            throw new MyRuntimeException();
        } else {
            System.out.println(input);
        }
    }
}

