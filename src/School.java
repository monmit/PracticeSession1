import java.util.Scanner;

public class School {
    String Name;
    int Age;
    String Division;

    public School(String name, int age, String division){
       getStudentName(name);
       getStudentAge(age);
       getStudentDivision(division);
    }

    private int getStudentAge(int b) {
        System.out.println("Enter Age :");
        Scanner age = new Scanner(System.in);
        Age = age.nextInt();
        return Age;
    }

    private String getStudentName(String a) {
        System.out.println("Enter Name :");
        Scanner name = new Scanner(System.in);
        Name= name.nextLine();
        return Name;
    }

    private String getStudentDivision(String c) {
        System.out.println("Enter Division :");
        Scanner division = new Scanner(System.in);
        Division = division.nextLine();
        return Division;
    }

    public String getStudentByDivision(String division) {
        System.out.println(getStudentDivision(division));
        return division;
    }

    public List<> String getAllStudents(String Student){
        System.out.println();
    return Student;
    }

}
