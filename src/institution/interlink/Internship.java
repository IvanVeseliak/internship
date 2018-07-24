package institution.interlink;

import person.Student;
import java.util.ArrayList;
import java.util.List;

public class Internship {

    private String name;
    private List<Student> students = new ArrayList<>();

    public Internship(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public String getStudents() {

        return students.toString();
    }

}
