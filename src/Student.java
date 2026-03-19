import java.util.ArrayList;
import java.util.List;

public class Student {
    private String facultyNumber;
    private String name;
    private String program;
    private int year;
    private int group;
    private StudentStatus status;

    private List<EnrolledDiscipline> enrolledDisciplines = new ArrayList<>();

    public Student(String facultyNumber, String name, String program, int group) {
        this.facultyNumber = facultyNumber;
        this.name = name;
        this.program = program;
        this.group = group;
        this.year = 1;
        this.status = StudentStatus.ENROLLED;
    }

    public String getFacultyNumber() {
        return facultyNumber;
    }

    public String getName() {
        return name;
    }

    public String getProgram() {
        return program;
    }

    public int getYear() {
        return year;
    }

    public int getGroup() {
        return group;
    }

    public StudentStatus getStatus() {
        return status;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public void setStatus(StudentStatus status) {
        this.status = status;
    }
}