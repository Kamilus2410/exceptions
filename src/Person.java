public class Person {
    private static int age;

    static  {
        age = 12;
        System.out.println("Static block start " + age);
        if (age == 12) {
            try {
                throw new WrongAge("Wrong age in static block");
            } catch (WrongAge e) {
                e.printStackTrace();
            }
        } else System.out.println("Age ok in static block");
        System.out.println("Static block end");
    }

    {
        this.age = 22;
        System.out.println("Init block start " + age);
        if (age == 12) {
            throw new WrongAge("Wrong age in init block");
        } else System.out.println("Age ok in init block");
        System.out.println("Init block end");
    }

    public Person(int age) throws WrongAge {
        System.out.println("Person constructor start " + age);
        if (age > 0 && age < 120) {
            this.age = age;
            System.out.println("Person constructor OK");
        } else {
            System.out.println("Person constructor throwing WrongAge");
            throw new WrongAge("WTF? " + age);
        }
        System.out.println("Person constructor finish");
    }
    public void method() throws WrongAge {
        System.out.println("metoda");
    }
}
