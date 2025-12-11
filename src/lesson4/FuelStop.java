package lesson4;

public class FuelStop {
    public static void main(String[] args) {

        System.out.println("Yolunuz achig olsun , Yanacag ile bagli irelide Yanacaq doldurma menteqesi var ");
        int fuelTank = 20;
        int fuelTarget = 80;

        while(true){

            System.out.println("Cari yanacaq seviyyeniz " + fuelTank);

            fuelTank += 10 ;

            if (fuelTank > fuelTarget) {
                System.out.println("Sizin yanacaginiz , getdiyiniz mesafeye qeder bes edecek ");
                break;
            }else {
                System.out.println("Yancag elave edilmelidir ");
            }


        }




    }
}
