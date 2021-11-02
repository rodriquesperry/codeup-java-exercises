public class SuperHero extends Person {
    private String alterEgo; // For taxpayer name - ie. "Clark Kent"

    public SuperHero(String govtName, String alterEgo) {
        super(govtName);
        this.alterEgo = alterEgo;
    }

    //Overridden method from Person superclass
    public String getName() {
        return alterEgo;
    }

    public String getSecretIdentity() {
        //Gets the govtName from Person Class getName
        return super.getName();
    }

    public static void main(String[] args) {
        SuperHero theManOfSteel = new SuperHero("Clark Kent", "Superman");

        System.out.println("theManOfSteel.getName() = " + theManOfSteel.getName());

        System.out.println("theManOfSteel.getSecretIdentity() = " + theManOfSteel.getSecretIdentity());
    }
}
