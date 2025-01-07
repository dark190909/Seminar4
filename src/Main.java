public class Main {
    public static void main(String[] args) {
        EmployeeDirectory directory = new EmployeeDirectory();

        // Добавляем сотрудников
        directory.addEmployee(new Employee(101, "123-456-7890", "Alice", 5));
        directory.addEmployee(new Employee(102, "987-654-3210", "Bob", 3));
        directory.addEmployee(new Employee(103, "555-666-7777", "Alice", 8));

        // Поиск сотрудников по стажу
        System.out.println("Employees with 5 years of experience: " +
                directory.findEmployeesByExperience(5));

        // Получение номеров телефонов по имени
        System.out.println("Phone numbers for Alice: " +
                directory.findPhoneNumberByName("Alice"));

        // Поиск сотрудника по табельному номеру
        System.out.println("Employee with ID 102: " +
                directory.findEmployeeById(102));
    }
}

