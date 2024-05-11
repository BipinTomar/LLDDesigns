package org.example.basicstrong.oop.DesignPatterns.statedesign;

 interface EmployeeState {
    public void work();

    public void canApproveLeave();
}
 class Employee {
    private String designation;
    private EmployeeState employeeState;
    public Employee(String designation) {
        setDesignation(designation);
    }
    public void working() {
        employeeState.work();
    }
    public void authorities() {
        employeeState.canApproveLeave();
    }
    public void setDesignation(String designation) {
        this.designation = designation;
        if (designation.equals("HR"))
            employeeState = new HR();
        else if (designation.equals("Developer"))
            employeeState = new Developer();
        else if (designation.equals("Manager"))
            employeeState = new Manager();
        else
            employeeState = new Developer();
    }
}
 class Developer implements EmployeeState {
    @Override
    public void work() {
        System.out.println("Work : Have to Complete the task assigned by senior management.");
    }
    @Override
    public void canApproveLeave() {
        System.out.println("can Approve leaves : Yes Developer can approve the leaves of traniee!\n.");
    }
}
 class HR implements EmployeeState{
    @Override
    public void work() {
        System.out.println("Work : Recruitment resources for Organisation");
    }
    @Override
    public void canApproveLeave() {
        System.out.println("Can approve Leaves : No, HR can't approve the leave.!\n");
    }
}

class Manager implements EmployeeState{
    @Override
    public void work() {
        System.out.println("Work : Design the project architecture for the organisation");
    }

    @Override
    public void canApproveLeave() {
        System.out.println("Can approve leaves : Yes, manager can approve leaves.\n");
    }
}
public class StateDesignPattern {
    public static void main(String[] args) {

        Employee emp = new Employee("HR");
        emp.working();
        Employee emp1 = new Employee("Manager");
        emp1.working();
        emp1.authorities();
    }
}
