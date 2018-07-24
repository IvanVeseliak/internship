package person;

import person.consciousness.Knowledge;

public class Student {

    private String name;
    private Knowledge knowledge;

    public Student(String name, int knowledge) {
        this.name = name;
        this.knowledge = new Knowledge(knowledge);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Knowledge getKnowledge() {
        return knowledge;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge;
    }

    public int getKnowledgeLevel() {
        return knowledge.getLevel();
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", knowledge=" + knowledge + "]";
    }

}
