class Hospital {
    public static void main(String[] args) {
        Doctor doctor = new Doctor("Fumi", 33, 150000, 13, 2, "Senior Consultant");
        Surgeon surgeon = new Surgeon("Jeremy", 30, 125000, 11, 2, "Dissective Specialist");
        Nurse nurse = new Nurse("Armani", 34, 40000, 6, 2, "Registered Nurse");
        Practitioner practitioner  = new Practitioner("Laura", 29, 60000, 8, 2, "Technical Practitioner");
        Administrator administrator = new Administrator("Mehak", 30, 100000, 10, 3, "Financial Administrator");
        Receptionist receptionist = new Receptionist("Isaiah", 32, 50000, 13, 1, "Schedule Manager");
        Janitor janitor = new Janitor("Joseph", 28, 40000, 10, 1, "Sanitation Manager");

        //Doctor
        System.out.println(doctor.getName());
        System.out.println(doctor.getTitle());
        System.out.println(doctor.getAge());
        System.out.println(doctor.getSalary());
        System.out.println(doctor.getWorkFloor());
        System.out.println(doctor.getYearsOfExperience());
        doctor.diagnose();
        System.out.println();

        //Surgeon
        System.out.println(surgeon.getName());
        System.out.println(surgeon.getTitle());
        System.out.println(surgeon.getAge());
        System.out.println(surgeon.getSalary());
        System.out.println(surgeon.getWorkFloor());
        System.out.println(surgeon.getYearsOfExperience());
        surgeon.diagnose();
        surgeon.operate();
        System.out.println();

        //Nurse
        System.out.println(nurse.getName());
        System.out.println(nurse.getTitle());
        System.out.println(nurse.getAge());
        System.out.println(nurse.getSalary());
        System.out.println(nurse.getWorkFloor());
        System.out.println(nurse.getYearsOfExperience());
        nurse.examine();
        System.out.println();

        //Practitioner
        System.out.println(nurse.getName());
        System.out.println(nurse.getTitle());
        System.out.println(nurse.getAge());
        System.out.println(nurse.getSalary());
        System.out.println(nurse.getWorkFloor());
        System.out.println(nurse.getYearsOfExperience());
        practitioner.advance();
        System.out.println();

        //Administrator
        System.out.println(administrator.getName());
        System.out.println(administrator.getTitle());
        System.out.println(administrator.getAge());
        System.out.println(administrator.getSalary());
        System.out.println(administrator.getWorkFloor());
        System.out.println(administrator.getYearsOfExperience());
        administrator.budget();
        System.out.println();

        //Receptionist
        System.out.println(receptionist.getName());
        System.out.println(receptionist.getTitle());
        System.out.println(receptionist.getAge());
        System.out.println(receptionist.getSalary());
        System.out.println(receptionist.getWorkFloor());
        System.out.println(receptionist.getYearsOfExperience());
        receptionist.type();
        receptionist.call();
        System.out.println();

        //Janitor
        System.out.println(janitor.getName());
        System.out.println(janitor.getTitle());
        System.out.println(janitor.getAge());
        System.out.println(janitor.getSalary());
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
        System.out.println("She runs the symptomatic diagnosis to analyse the ailment.");
    }
}

class Surgeon extends Employee {
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

class Nurse extends Employee {
    Nurse(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void examine() {
        System.out.println("He examines the patient for issues.");
    }
}

class Practitioner extends Nurse {
    Practitioner(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void advance() {
        System.out.println("She is a highly skilled nurse with an advanced level of training in the medical field.");
    }
}

class Administrator extends Employee {
    Administrator(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void budget() {
        System.out.println("She handles the budgeting for the hospital and manages expenses,");
    }
}

class Receptionist extends Employee {
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

class Janitor extends Employee {
    Janitor(String name, int age, int salary, int yearsOfExperience, int workFloor, String title) {
        super(name, age, salary, yearsOfExperience, workFloor, title);
    }
    public void clean() {
        System.out.println("He cleans the grounds and ensures sanitation to avoid spread of disease through the hospital.");
    }
}