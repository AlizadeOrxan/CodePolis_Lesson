package lesson7;

public class HumanInherit {
    protected String name ;
  protected   String surname = "Memmedov";

    public HumanInherit(String name) {
        this.name = name;
        this.surname = "Memmedov";
    }

    void printInfo(){
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
    }



    @Override
    public String toString() {
        return "HumanInherit{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
