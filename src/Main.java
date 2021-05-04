class Hospital {
    public static void main(String[]args) {
        Doctor doctor =new Doctor();
        Nurse nurse = new Nurse();
        Administrator administrator = new Administrator();
        Surgeon surgeon = new Surgeon();
        Receptionist receptionist = new Receptionist();
        Janitor janitor = new Janitor();

        doctor.diagnose();
        nurse.examine();
        administrator.budget();
        surgeon.diagnose();
        surgeon.operate();
        receptionist.type();
        receptionist.call();
        janitor.clean();
    }
}

        class Employee {
            String name;
            int age;
            int salary;
            String yearsOfExperience;
            int workFloor;

            Employee(String name, int age, int salary,String yearsOfExperience,int workFloor){
            this.name=name;
            this.age=age;
            this.salary=salary;
            this.yearsOfExperience=yearsOfExperience;
            this.workFloor=workFloor;
        }
    public void set_salary(int salary) {
                this.salary=salary;
            }
        }

        class Doctor extends Employee{
            public void diagnose(){
                System.out.println("Runs the diagnosis to analyse the ailment.");
            }
        }

        class Nurse extends Employee{
            public void examine() {
                System.out.println("Examines the patient for issues.");
            }
        }

        class Janitor extends Employee{
            public void clean() {
                System.out.println("Cleans the grounds and ensures sanitation.");
            }
            Janitor(String name,int age,int salary,int yearsOfExperience){
                super(name,age,salary,yearsOfExperience,workFloor);
            }
        }

        class Administrator extends Employee{
            public void budget() {
                System.out.println("Handles the budgeting for the hospital.");
            }
        }

        class Surgeon extends Employee{
            public void diagnose(){
                System.out.println("Runs the diagnosis to analyse the ailment.");
            }
            public void operate(){
                System.out.println("Operates on the patients to fix the problems.");
            }
        }

        class Receptionist extends Employee{
            public void type(){
                System.out.println("Files and documents the issue to establish a record.");
            }
            public void call(){
                System.out.println("Manages the calls of patients to schedule appointments.");
            }
        }
