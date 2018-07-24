package institution;

import person.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;


public class University {

    private String name;
    private List<Student> students = new ArrayList<>();

    public University(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudentsForInternship() {

        int sum = 0;
        for (Student student : students) {
            sum += student.getKnowledgeLevel();
        }
        double avg = sum / students.size();
        return students.stream().filter(s -> s.getKnowledge().getLevel() > avg).collect(Collectors.toList());
    }


}
