package institution.interlink;

import institution.University;
import person.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public String getStudents() {
        return students.toString();
    }

    public void setStudents(University university) {
        if (university.getStudents().isEmpty()) {
            return;
        }
        double avg = getAvgOfStudentsKnowledgeLevel(university.getStudents());
        this.students = university.getStudents().stream()
                .filter(s -> s.getKnowledgeLevel() > avg)
                .collect(Collectors.toList());
    }

    private double getAvgOfStudentsKnowledgeLevel(List<Student> students) {
        return students.stream().mapToInt(student -> student.getKnowledgeLevel()).average().getAsDouble();
    }

}
