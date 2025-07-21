import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Ahmed", "Mohamed", "01/02/2015");
        Employee e2 = new Employee("Mohamed", "Khalil", "12/05/2013");
        Employee e3 = new Employee("Khalil", "Aly", "15/02/2012");
        Employee e4 = new Employee("Aly", "Mostafa", "6/05/2012");

        List<Employee> employees = new ArrayList<Employee>(List.of(e1, e2, e3, e4));

        printOrderedList(employees, "name");

    }

    public static void printOrderedList(List<Employee> employees, String sortField) {
        int currentYear = LocalDate.now().getYear();

        class MyEmployee {
            Employee containedEmployee;
            int yearsWorked;
            String fullName;

            public MyEmployee(Employee containedEmployee) {
                this.containedEmployee = containedEmployee;
                yearsWorked = currentYear - Integer.parseInt(containedEmployee.hireDate().split("/")[2]);
                fullName = String.join(" ", containedEmployee.firstName(), containedEmployee.lastName());
            }

            @Override
            public String toString() {
                return "%s has been an Employee for %d years".formatted(fullName, yearsWorked);
            }
        }

        List<MyEmployee> list = new ArrayList<>();
        for (Employee employee : employees) {
            list.add(new MyEmployee(employee));
        }

        var comparator = new Comparator<MyEmployee>() {
            @Override
            public int compare(MyEmployee o1, MyEmployee o2) {
                if (sortField.equals("name")) {
                    return o1.fullName.compareTo(o2.fullName);
                }
                return o1.yearsWorked - o2.yearsWorked;
            }
        };

        list.sort(comparator);

        for (MyEmployee employee : list) {
            System.out.println(employee);
        }
    }
}
