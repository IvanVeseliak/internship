package person.providers.impl;

import person.Student;
import person.providers.StudentsProvider;

import java.util.ArrayList;
import java.util.List;

public class ManualStudentsProvider implements StudentsProvider {

    @Override
    public List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Andrew Kostenko", 20));
        students.add(new Student("Julia Veselkina", -30));
        students.add(new Student("Maria Perechrest", 40));
        students.add(new Student("Ivan Veseliak", 50));
        return students;
    }
}
