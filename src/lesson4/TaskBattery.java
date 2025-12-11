package lesson4;

public class TaskBattery {
    public static void main(String[] args) {

        System.out.println("Telefonunuzun battery deyeri ashagidaki kimidir");

        int batterHealth = 100;

        System.out.println("Telefonunuzun hal hazirdaki saglamligi " + batterHealth);


        while (batterHealth > 0 ) {
            System.out.println("Battery-nizin saglamliq derecesi ashagidaki kimidir");
            batterHealth-=20;

            if (batterHealth == 40 ){
                System.out.println("telefonuuzu sharja qoyun "  + batterHealth + " -dir");
            }

            System.out.println("Sizin battery-nizin saglamligi "  +batterHealth);
        }
        System.out.println("Telefonunuz sondu");

    }
}
