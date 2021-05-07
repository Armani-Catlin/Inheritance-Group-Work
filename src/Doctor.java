public class Doctor extends Employee {
    Doctor(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void diagnose() {
        System.out.println("She runs the symptomatic diagnosis to analyse the ailment.");
    }
}
