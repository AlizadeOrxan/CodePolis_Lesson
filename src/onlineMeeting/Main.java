package onlineMeeting;

public class Main {
    public static void main(String[] args) {


//
//        HumanValideyn valideyn = new Student("Murad","Memmedov",99);
//
//        valideyn.nefesAlir();
//        valideyn.speaking();
//
        Student student = new Student("Murad","Memmedov","asd",32);
        student.nefesAlir();
        student.speaking();
        System.out.println(Student.createName("Murad", 99));

        System.out.println(Teacher.createName("Namig", 99));

//
//
//        HumanValideyn [] valideyn1 = {
//                new Student("Murad","Memmedov",99),
//                new Teacher("Namig","Memmedov","Fizika")
//        };
//
//        for (HumanValideyn v : valideyn1) {
//            v.speaking();
//            System.out.println("__________________");
//            v.nefesAlir();
//        }





    }
}
