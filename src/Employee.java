public class Employee {

    private String name;
    private int age;
    private int salary;
    private int yearsOfExperience;
    private int workFloor;
    private String title;

    Employee(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) { //What each preceding class inherits.
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.yearsOfExperience = yearsOfExperience;
        this.workFloor = workFloor;
        this.title = title;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getYearsOfExperience() {
        return yearsOfExperience;
    }
    public void setYearsOfExperience(int yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
    public int getWorkFloor() {
        return workFloor;
    }
    public void setWorkFloor(int workFloor) {
        this.workFloor = workFloor;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void set_salary(int salary) {
        this.salary = salary;
    }
}
