package encapsulation.Office.TestEmployee;

import encapsulation.Office.Employee.Employee;

public class TestEmployee {
    static void main(String[] args) {
        Employee emp = new Employee("Priyanshu", 22, 55000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Priya");
        System.out.println(emp.getEmployeeDetails());
    }
}
