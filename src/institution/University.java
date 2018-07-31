package institution;

import person.Student;

import java.util.ArrayList;
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
        this.students = students.stream()
                .filter(student -> hasStudentValidKnowledgeLevel(student.getKnowledgeLevel()))
                .collect(Collectors.toList());
    }

    private boolean hasStudentValidKnowledgeLevel(int knowledgeLevel) {
        return knowledgeLevel >= 0 && knowledgeLevel <= 100;
    }

    public void addStudent(Student student) {
        if (hasStudentValidKnowledgeLevel(student.getKnowledgeLevel())) {
            students.add(student);
        }
    }

}
