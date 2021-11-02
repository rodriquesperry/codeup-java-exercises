public class Person {
    private String name;
    protected int age;

    public Person(String name) {
        this.name = name;
    }

    //For Employee lecture
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public void sayHello() {
        System.out.println("Hello from " + this.name);
    }

    public static void main(String[] args) {
        Person rocky = new Person("Rocky");


        rocky.name = "Rocky P.";
        System.out.println("rocky.name = " + rocky.name);
        String rockyName = rocky.getName();

        rocky.setName("Rodriques P.");
        System.out.println("rocky.getName() = " + rocky.getName());
        rocky.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
    }


}


