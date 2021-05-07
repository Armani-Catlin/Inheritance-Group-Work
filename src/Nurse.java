public class Nurse extends Employee {
    Nurse(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void examine() {
        System.out.println("He examines the patient for issues.");
    }
}