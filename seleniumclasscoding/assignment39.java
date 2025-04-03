package seleniumclasscoding;

// Base or Super Class
class Employee {
    int salary = 60000;
}

// Inherited or Sub Class
class assignment39 extends Employee {
    int benefits = 10000;

    public static void main(String args[])
    {
    	assignment39 E1 = new assignment39();
        System.out.println("Salary : " + E1.salary
                           + "\nBenefits : " + E1.benefits);
    }
}