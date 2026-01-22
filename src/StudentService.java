import java.util.Scanner;

public class StudentService {

    private Student[] students;
    private int count;

    public StudentService(int size) {
        students = new Student[size];
        count = 0;
    }

    public void addStudent(Scanner sc) {
        if (count >= students.length) {
            System.out.println("Student list is full!");
            return;
        }

        System.out.print("Enter ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Year: ");
        int year = sc.nextInt();

        System.out.print("Enter Semester: ");
        int sem = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Department: ");
        String dept = sc.nextLine();

        students[count] = new Student(id, name, age, year, sem, dept);
        count++;

        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {
        if (count == 0) {
            System.out.println("No students available.");
            return;
        }

        for (int i = 0; i < count; i++) {
            students[i].displayDetails();
            System.out.println("----------------------");
        }
    }

    public void searchStudentById(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                students[i].displayDetails();
                return;
            }
        }
        System.out.println("Student not found!");
    }

    public void updateStudent(int id, Scanner sc) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {

                sc.nextLine();

                System.out.print("Enter new Name: ");
                students[i].setName(sc.nextLine());

                System.out.print("Enter new Age: ");
                students[i].setAge(sc.nextInt());

                System.out.print("Enter new Year: ");
                students[i].setYear(sc.nextInt());

                System.out.print("Enter new Semester: ");
                students[i].setSem(sc.nextInt());
                sc.nextLine();

                System.out.print("Enter new Department: ");
                students[i].setDept(sc.nextLine());

                System.out.println("Student updated successfully!");
                return;
        }
    }
    System.out.println("Student not found!");
}


    public void deleteStudent(int id) {
        for (int i = 0; i < count; i++) {
            if (students[i].getId() == id) {
                for (int j = i; j < count - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[count - 1] = null;
                count--;
                System.out.println("Student deleted successfully!");
                return;
            }
        }
        System.out.println("Student not found!");
    }
}
