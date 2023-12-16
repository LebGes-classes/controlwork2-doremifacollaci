// вариант  4
public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Employee("Аяна Шекенова ", "Менеджер"),
                new Employee("Алия Сираева", "Кассир"),
                new Visitor("Илона Иншакова", 18),
                new Visitor("Мария Коченкова", 18)
        };

        // информация о людях в магазине
        for (Person person : people) {
            person.printInfo();
        }
    }
}