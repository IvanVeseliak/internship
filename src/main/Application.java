package main;

import institution.University;
import institution.interlink.Internship;
import person.providers.StudentsProvider;
import person.providers.impl.ManualStudentsProvider;

public class Application {

    public static void main(String[] args) {
        University university = new University("CH.U.I.");
        StudentsProvider studentsProvider = new ManualStudentsProvider();
        university.setStudents(studentsProvider.getStudents());

        Internship internship = new Internship("Interlink");
        internship.setStudents(university);
        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());

    }

}
