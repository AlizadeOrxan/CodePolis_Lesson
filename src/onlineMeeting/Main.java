package onlineMeeting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {


//
//        HumanValideyn valideyn = new Student("Murad","Memmedov",99);
//
//        valideyn.nefesAlir();
//        valideyn.speaking();
//
//        Student student = new Student("Murad","Memmedov","asd",32);
//        student.nefesAlir();
//        student.speaking();
//        System.out.println(Student.createName("Murad", 99));
//
//        System.out.println(Teacher.createName("Namig", 99));

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


        int x = 10; // 1. Stack-də 'main' metodu üçün bir yer (frame) açılır, 'x' orada saxlanılır.
        calculate(x); // 2. 'calculate' metodu çağırılır, Stack-ə yeni frame əlavə olunur.
    }

    public static void calculate(int a) {
        int b = a * 2; // 3. 'a' və 'b' lokal dəyişənləri 'calculate' frame-ində saxlanılır.
        printResult(b); // 4. 'printResult' çağırılır, Stack-ə növbəti frame əlavə olunur.
    }

    public static void printResult(int res) {
        // 5. Hazırda Stack-in ən üstündə 'printResult' metodu durur.
        System.out.println(res);
     // 6. Metod bitir, 'printResult' frame-i Stack-dən silinir.


    }
}
