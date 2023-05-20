public class Main {
    public static void main(String[] args) {
        Man john = new Man("John", "Smith", 70);
        Woman jane = new Woman("Jane", "Doe", 65);



        jane.registerPartnership(john); // Оновлено: Jane приймає прізвище John

        System.out.println(john);
        System.out.println(jane);
        System.out.println("John is retired: " + john.isRetired());
        System.out.println("Jane is retired: " + jane.isRetired());

        jane.deregisterPartnership(true);

        System.out.println(john);
        System.out.println(jane);
        System.out.println("John is retired: " + john.isRetired());
        System.out.println("Jane is retired: " + jane.isRetired());
    }
}