package classRoom;

import java.util.Arrays;

public class ClassRoom {


    int rows , columns;

    String [][] seats ;

    public ClassRoom(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        seats = new String [rows][columns];
    }


    public void createStudent(int row, int column, String name) {
        if (row >= 0 && column >= 0 && row < rows && column < columns) {
            if (seats[row][column] == null) {
                seats[row][column] = name;
                System.out.println("Student " + name + " has been created" + " [" + row + "][ " + column + "]" );
            }else {
                System.out.println("Seats has been occupied" + " [" + row + "][" + column + "]" );
            }

        } else  {
            System.out.println("Invalid row or column");
        }
    }



public void displaySeats(){
        for (String[] row : seats) {
            Arrays.stream(row).forEach(System.out::print);
            System.out.println("  ");
        }

}


    public void updateStudent(String oldName,String newName) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (oldName.equalsIgnoreCase(seats[i][j])) {
                    seats[i][j] = newName;
                    System.out.println("Student changed " + seats[i][j] + " [" + oldName + "][" + newName + "]" );
                    return;
                }
            }
        }
        System.out.println("Student not found");
    }


    public boolean findStudent(String oldName) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (oldName.equalsIgnoreCase(seats[i][j])) {
                    System.out.println("Student found " + seats[i][j] + " [" + oldName + " " +i+"][" + j + "]" );
                    return true;
                }
            }
        }
        System.out.println("Student not found");
        return false;
    }

    public void deleteStudent(String oldName) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (oldName.equalsIgnoreCase(seats[i][j])) {
                    seats[i][j] = null;
                    System.out.println("Student deleted " + seats[i][j] + " [" + oldName + i+ "][" + j + "]" );
                    return;
                }
            }
        }
        System.out.println("Student not found");
    }


}
