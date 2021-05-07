public class Practitioner extends Nurse {
    Practitioner(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void advance() {
        System.out.println("She is a highly skilled nurse with an advanced level of training in the medical field.");
    }
}
