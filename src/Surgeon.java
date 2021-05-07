public class Surgeon extends Employee {
    Surgeon(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void diagnose() {
        System.out.println("He runs systematic diagnosis to analyse the ailment.");
    }
    public void operate() {
        System.out.println("Then based on the diagnosis, performs the procedure needed to improve the patient's condition.");
    }
}
