public class ConstructorExceptions {

    public static void main(String[] args) {

        try {
            Person testowy = new Man(130);
        } catch (WrongAge e) {
            System.out.println("dupa wołowa");
            e.printStackTrace();
        }

    }
}
