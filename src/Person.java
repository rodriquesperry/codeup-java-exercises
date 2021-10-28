public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
       this.name = name;
    }

    public void sayHello() {
        System.out.println("Your new name is " + name);
    }

    public Person(String name) {
       this.name = name;
    }

    public static void main(String[] args) {
        Person rocky = new Person("rocky");
        rocky.name = "Rocky P.";

        System.out.println(rocky.getName());
        rocky.setName("Rodriques P.");
        rocky.sayHello();
    }
}
