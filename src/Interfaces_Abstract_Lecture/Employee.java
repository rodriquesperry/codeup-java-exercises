package Interfaces_Abstract_Lecture;

//Add implements plus interface name
abstract class Employee implements DailyWork {
    protected String name;
    protected String department;

    public Employee(String name, String department) {
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }
    //With work() being here it is tightly coupled - think to put it in an interface
//    public abstract String work();

    //Cannot instantiate an abstract class- compile time error
//    public static void main(String[] args) {
//        Employee rock = new Employee("Rocky", "web dev");
//    }

}
