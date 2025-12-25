//package classRoom;
//
//import java.util.Arrays;
//
//public class ClassRoom {
//
//
//    int rows , columns;
//
//    String [][] seats ;
//
//    public ClassRoom(int rows, int columns) {
//        this.rows = rows;
//        this.columns = columns;
//        seats = new String [rows][columns];
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                seats[i][j] = "Empty";
//            }
//        }
//    }
//
//
//    public String createStudent(int row, int column, String name) {
//        if (row >= 0 && column >= 0 && row < rows && column < columns) {
//            if ("Empty".equals(seats[row][column])) {
//                seats[row][column] = name;
//                return "Student " + name + " has been created at [" + row + "][" + column + "]";
//            } else {
//                return "Seat [" + row + "][" + column + "] has been occupied";
//            }
//        } else  {
//            return "Invalid row or column";
//        }
//    }
//
//
//
//    public void displaySeats(){
//        for (String[] row : seats) {
//            System.out.println(Arrays.toString(row));
//        }
//
//    }
//
//
//    public String updateStudent(String oldName,String newName) {
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                if (oldName.equalsIgnoreCase(seats[i][j])) {
//                    seats[i][j] = newName;
//                    return "Student changed from " + oldName + " to " + newName;
//                }
//            }
//        }
//        return "Student not found";
//    }
//
//
//    public String findStudent(String name) {
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                if (name.equalsIgnoreCase(seats[i][j])) {
//                    return "Student found: " + name + " at [" + i + "][" + j + "]";
//                }
//            }
//        }
//        return "Student not found";
//    }
//
//    public String deleteStudent(String name) {
//        for (int i = 0; i < rows; i++) {
//            for (int j = 0; j < columns; j++) {
//                if (name.equalsIgnoreCase(seats[i][j])) {
//                    seats[i][j] = "Empty";
//                    return "Student " + name + " deleted from [" + i + "][" + j + "]";
//                }
//            }
//        }
//        return "Student not found";
//    }
//
//
//}
