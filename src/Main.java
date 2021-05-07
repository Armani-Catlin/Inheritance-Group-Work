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
