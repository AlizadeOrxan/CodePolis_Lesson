package lesson7;

public class Dean extends HumanInherit{
    boolean responsibility;

    public Dean(String name,  boolean responsibility) {
        super(name);
        this.responsibility = responsibility;
    }

    @Override
    void printInfo() {
        super.printInfo();
        System.out.println("Responsibility: " + responsibility);
    }


    @Override
    public String toString() {
        return "Dean{" +
                "responsibility=" + responsibility +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
