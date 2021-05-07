public class Janitor extends Employee {
    Janitor(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void clean() {
        System.out.println("He cleans the grounds and ensures sanitation to avoid spread of disease through the hospital.");
    }
}
