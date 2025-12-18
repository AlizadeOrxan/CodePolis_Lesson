package classRoom;

public class ClassRoomMain {
    public static void main(String[] args) {
        ClassRoom classRoom = new ClassRoom(2, 3);

        classRoom.createStudent(0, 0, "Murad");
        classRoom.createStudent(0, 1, "Ali");
        classRoom.createStudent(0, 2, "Nurlan");
        classRoom.createStudent(1, 0, "Cavid");
        classRoom.createStudent(1, 1, "Murad");
        classRoom.createStudent(1, 2, "Ali");

        System.out.println("____________________________________");

        classRoom.displaySeats();


        System.out.println("___________________________________");
        classRoom.findStudent("Murad");
        System.out.println("___________________________________");
        classRoom.updateStudent("Murad", "Cahan");
        System.out.println("___________________________________");
        classRoom.deleteStudent("Murad");
    }
}
