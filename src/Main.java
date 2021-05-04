class Hospital {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Fumi", 33, 150000, 13, 1, "Senior Consultant");
        Nurse nurse = new Nurse("Armani", 34, 60000, 8, 1, "Technical Practitioner");
        Administrator administrator = new Administrator("Mehak", 30, 100000, 10, 1, "Financial Administrator");
        Receptionist receptionist = new Receptionist("Isaiah", 32, 40000, 13, 1, "Schedule Manager");
        Janitor janitor = new Janitor("Joseph", 28, 40000000, 10, 1, "Sanitation Manager");

        //Doctor
        System.out.println(doctor.getAge());
        System.out.println(doctor.getName());
        System.out.println(doctor.getSalary());
        System.out.println(doctor.getTitle());
        System.out.println(doctor.getWorkFloor());
        System.out.println(doctor.getYearsOfExperience());
        doctor.diagnose();
        //Nurse
        System.out.println(nurse.getAge());
        System.out.println(nurse.getName());
        System.out.println(nurse.getSalary());
        System.out.println(nurse.getTitle());
        System.out.println(nurse.getWorkFloor());
        System.out.println(nurse.getYearsOfExperience());
        nurse.examine();
        //Administrator
        System.out.println(administrator.getAge());
        System.out.println(administrator.getName());
        System.out.println(administrator.getSalary());
        System.out.println(administrator.getTitle());
        System.out.println(administrator.getWorkFloor());
        System.out.println(administrator.getYearsOfExperience());
        administrator.budget();
        //Receptionist
        System.out.println(receptionist.getAge());
        System.out.println(receptionist.getName());
        System.out.println(receptionist.getSalary());
        System.out.println(receptionist.getTitle());
        System.out.println(receptionist.getWorkFloor());
        System.out.println(receptionist.getYearsOfExperience());
        receptionist.type();
        receptionist.call();
        //Janitor
        System.out.println(janitor.getAge());
        System.out.println(janitor.getName());
        System.out.println(janitor.getSalary());
        System.out.println(janitor.getTitle());
        System.out.println(janitor.getWorkFloor());
        System.out.println(janitor.getYearsOfExperience());
        janitor.clean();
    }
}

class Employee {

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

class Doctor extends Employee {
    Doctor(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void diagnose() {
        System.out.println("Runs the diagnosis to analyse the ailment.");
    }
}

class Nurse extends Employee {
    Nurse(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void examine() {
        System.out.println("Examines the patient for issues.");
    }
}

class Administrator extends Employee {
    Administrator(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void budget() {
        System.out.println("Handles the budgeting for the hospital.");
    }
}

class Receptionist extends Employee {
    Receptionist(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void type() {
        System.out.println("Files and documents the issue to establish a record.");
    }
    public void call() {
        System.out.println("Manages the calls of patients to schedule appointments.");
    }
}

class Janitor extends Employee {
    Janitor(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void clean() {
        System.out.println("Cleans the grounds and ensures sanitation.");
    }
}