package examples;

public class Main {
    public static void main(String[] args) {

//
//        // loops
//        Scanner input = new Scanner(System.in);
//

//
//        Random rand = new Random();
//        int guestNumber = rand.nextInt(1,100);
//        System.out.println("Guest Number: " + guestNumber);
//        boolean tapilmadi = true;
//
//        while (tapilmadi){
//            System.out.println("Texmin olunan reqemi yazni");
//            int client = input.nextInt();
//
//            if (client == guestNumber){
//                System.out.println("Tebrik edirem tapdiniz");
//                tapilmadi = false;
//            }else {
//                System.out.println("Tapa bilmediniz");
//            }
//        }

//        String client = "";
//
//        while (!client.equals("java1234")){
//            System.out.println("Please enter your client code:");
//            client = input.nextLine();
//        }
//        System.out.println("Successfully entered");
//
//        System.out.println("Please enter a number between 1 and 10");
//        int client = input.nextInt();
//
//        for (int i = 0; i <= 10; i++) {
//            int vurma = client + i;
//            System.out.println(client+ " + " + i + " = " + vurma);
//        }

//        int max = Integer.MAX_VALUE;
//        int min = Integer.MIN_VALUE;
//        System.out.println("Neche eded daxil edeceksiniz");
//        int count = input.nextInt();
//
//
//        for (int i = 0; i < count; i++) {
//            System.out.println((i+ 1) + " . Ededi daxil edin");
//            int num = input.nextInt();
//
//            if (num > max) {
//                max = num;
//            }
//            if (num < min) {
//                min = num;
//            }
//        }
//
//        System.out.println("Min " + min);
//        System.out.println("Max " + max);
//
//
//        String name = "Orxan";
//
//        for (int i = 0; i <= name.length() -1; i++) {
//            System.out.print(name.charAt(0) + " ");
//        }
//
//
//        CalculatorImpl calculator = new CalculatorImpl();
//
//        System.out.println(calculator.calculate(5, 4));


//        Calculate c = (a , b) -> a * b;
//        System.out.println(c.calculate(10, 20));
//        Calculate c1 = Integer::sum;
//        System.out.println(c1.calculate(10, 20));
//        Calculate c2 = (a, b) -> a - b;
//        System.out.println(c2.calculate(30, 20));
//
//        CalculatorImpl calc = new CalculatorImpl();
//
//
//
//        Predicate<String> predicate = a -> a.equals("Nurlan");
//        System.out.println(predicate.test("Murad"));
//
//        Predicate<String> p = pa -> pa.length() == 5;
//        System.out.println(p.test("Murad"));
//
//
//        Supplier<String> supplier = () -> "Murad";
//        System.out.println(supplier.get().replace("Murad","Ali"));
//
//        Function<String,String> function = s -> s.replace("Murad","Ali");
//        System.out.println(function.apply("Anar"));
//
//        Consumer<String> consumer = a -> System.out.println(a.toUpperCase());
//        consumer.accept("Ali");
//
//        Consumer<String> str = s -> System.out.println("Metn : " + s.toUpperCase());
//        str.accept("nurlan");
//
//

//        int [] numbers = {1,2,3,4,5,6};
////        System.out.println(numbers.length);
//
//        int[] newNumbers = new int[10];
//        newNumbers[6] = 7;
//
//        for (int i = 0; i < numbers.length; i++) {
//            newNumbers[i] = numbers[i];
//            System.out.print(numbers[i] + " ");
//        }
//        System.out.println("\n______________________________");
//        for (int i = 0; i < newNumbers.length; i++) {
//            System.out.print(newNumbers[i] + " ");
//        }
//        System.out.println();
//
//
////        Arrays.stream(newNumbers).forEach(System.out::println);
//        System.out.println(Arrays.toString(numbers));

//        Scanner input = new Scanner(System.in);
//
//        int [] arr = {1,2,3,4,0,9};
//
//        System.out.println(" 1,2,3,4,0,9 ");
//        System.out.println("0 olan deyer uchun reqem daxil edin");
//        int eded = input.nextInt();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0) {
//                arr[i] = eded;
//            }
//        }
//
//
//        System.out.println("Netice ");
//        Arrays.stream(arr).forEach(x -> System.out.print(x + " "));
//

    }

}
