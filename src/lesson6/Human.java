package lesson6;

public class Human {

   String name ;
  private   String surname;
    int age ;
    double weight ;
    double height;
    String eyeColor;
    boolean isStudent;
    double balance;
    Phone phone;

    public Human(String name, String surname, int age, double weight, double height, String eyeColor, boolean isStudent,double balance) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.eyeColor = eyeColor;
        this.isStudent = isStudent;
        this.balance = balance;
    }





    public Human(String name, String surname, int age,Phone phone) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
    }

    public Human() {
    }

    void printInfo(){
        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
    }


    String nameInfo(){
        return name;
    }

    int ageInfo(){
        return age;
    }




    void withdraw(double amount){

        if (amount > 0){
            balance -= amount;
        }else {
            System.out.println("Balansiniz kifayet qeder deyil");
        }


    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public boolean isStudent() {
        return isStudent;
    }

    public double getBalance() {
        return balance;
    }

    public Phone getPhone() {
        return phone;
    }


    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
//
//
//    int calcualate(int a , int b){
//        return add(a,b);
//    }
//
//
//    int add (int a , int b){
//
//        return a + b ;
//    }
//
//
//
//
//    int calcualate(int a , int b){
//        return a+b;
//    }
//
//    int calcualate(int a , int b, int c,  int d){
//        return a+b+c * d;
//    }


//    @Override
//    public String toString() {
//        return "Human{" +
//                "Ad -> " + name + '\'' +
//                ", surname='" + surname + '\'' +
//                ", age=" + age +
//                ", weight=" + weight +
//                ", height=" + height +
//                ", eyeColor='" + eyeColor + '\'' +
//                ", isStudent=" + isStudent + " Phone " + phone +
//                '}';
//    }

    @Override
   public String toString(){
       return name + "  " + surname + " " + age + " " + phone ;
    }
}
