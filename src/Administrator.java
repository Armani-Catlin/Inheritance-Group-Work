public class Administrator extends Employee {
    Administrator(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void budget() {
        System.out.println("She handles the budgeting for the hospital and manages expenses,");
    }
}
