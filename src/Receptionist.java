public class Receptionist extends Employee {
    Receptionist(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void type() {
        System.out.println("He files and documents the issue to establish a record.");
    }
    public void call() {
        System.out.println("He also manages the calls of patients to schedule appointments and maintain a stable time frame.");
    }
}