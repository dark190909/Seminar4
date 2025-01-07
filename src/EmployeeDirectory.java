import java.util.ArrayList;
import java.util.List;

class EmployeeDirectory {
    private List<Employee> employees;

    // Конструктор
    public EmployeeDirectory() {
        this.employees = new ArrayList<>();
    }

    // Метод добавления нового сотрудника
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Метод поиска сотрудников по стажу
    public List<Employee> findEmployeesByExperience(int experience) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getExperience() == experience) {
                result.add(employee);
            }
        }
        return result;
    }

    // Метод получения номера телефона сотрудника по имени
    public List<String> findPhoneNumberByName(String name) {
        List<String> phoneNumbers = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                phoneNumbers.add(employee.getPhoneNumber());
            }
        }
        return phoneNumbers;
    }

    // Метод поиска сотрудника по табельному номеру
    public Employee findEmployeeById(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null; // Если сотрудник не найден
    }
}
