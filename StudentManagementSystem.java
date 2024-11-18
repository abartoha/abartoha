import java.util.Scanner;
import java.util.Arrays;

public class StudentManagementSystem {
    public static void main(String[] args) {
        // Create a Scanner for user input
        Scanner scanner = new Scanner(System.in);

        // Take user input for the Student attributes
        System.out.println("Enter Full Name:");
        String fullName = scanner.nextLine();

        System.out.println("Enter Student ID:");
        int studentId = scanner.nextInt();

        System.out.println("Enter GPA:");
        double gpa = scanner.nextDouble();
        scanner.nextLine(); // Consume the newline character

        System.out.println("Enter Enrolled Courses (comma-separated):");
        String[] enrolledCourses = scanner.nextLine().split(",");

        // Initialize the Student object using user input
        Student student = new Student();
        student.initializeStudent(fullName, studentId, gpa, enrolledCourses);

        // Print Student details
        student.printStudentDetails();

        scanner.close();
    }
}

class Student {
    // Attributes
    private String fullName;
    private int studentId;
    private double gpa;
    private String[] enrolledCourses;

    // Default Constructor
    public Student() {
        this.fullName = "Unknown";
        this.studentId = 0;
        this.gpa = 0.0;
        this.enrolledCourses = new String[0];
    }

    // Overloaded Constructors
    public Student(String fullName) {
        this.fullName = fullName;
        this.studentId = 0;
        this.gpa = 0.0;
        this.enrolledCourses = new String[0];
    }

    public Student(String fullName, int studentId) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.gpa = 0.0;
        this.enrolledCourses = new String[0];
    }

    public Student(String fullName, int studentId, double gpa) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.gpa = gpa;
        this.enrolledCourses = new String[0];
    }

    public Student(String fullName, int studentId, double gpa, String[] enrolledCourses) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.gpa = gpa;
        this.enrolledCourses = enrolledCourses;
    }

    // Method to initialize attributes
    public void initializeStudent(String fullName, int studentId, double gpa, String[] enrolledCourses) {
        this.fullName = fullName;
        this.studentId = studentId;
        this.gpa = gpa;
        this.enrolledCourses = enrolledCourses;
    }

    // Getter methods
    public String getFullName() {
        return fullName;
    }

    public int getStudentId() {
        return studentId;
    }

    public double getGpa() {
        return gpa;
    }

    public String[] getEnrolledCourses() {
        return enrolledCourses;
    }

    // Method to print student details
    public void printStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("Full Name: " + getFullName());
        System.out.println("Student ID: " + getStudentId());
        System.out.println("GPA: " + getGpa());
        System.out.println("Enrolled Courses: " + Arrays.toString(getEnrolledCourses()));
    }
}
