public class Employee extends Person {

    public Employee(String employeeName) {
        super(employeeName);// calling the constructor method from Person- ie. Person(employeeName)
    }

    public int getAge() {
        return this.age;
    }

    @Override //<-- This is an annotation that tells me what's going on
    public void sayHello() {
        System.out.println("Welcome to MegaCorp- How may I help you?");
    }

    //Method only available to Employee Class (sub cannot extend to super)
    public void doWork() {
        System.out.println("Work, work, work...!");
    }

    public static void main(String[] args) {
        Person rick = new Person("Rick");
        System.out.println("rick.name = " + rick.getName());
        rick.sayHello();

        Employee rock = new Employee("Rock");
        rock.sayHello();
        System.out.println("rock.name = " + rock.getName());

        rock.doWork();
//        rick.doWork(); // Will not work because it is not a method of Person Class, only Employee class

    }
}
