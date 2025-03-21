package Ineritance_Type;

public class UseofsometV1 {
    int emp_id;
    String name;
    String salary;

    void setEmp_id(int emp_id){
        this.emp_id = emp_id;
    }


    void setName(String name){
        this.name = name;
    }

    void setSalary(String salary){
        this.salary = salary;
    }
    

    public static void main(String[] args) {
        UseofsometV1 obj = new UseofsometV1();
        obj.setEmp_id(101);
        obj.setName("Rahul");
        obj.setSalary("50000");
        System.out.println("Employee ID: "+obj.emp_id);
        System.out.println("Employee Name: "+obj.name);
        System.out.println("Employee Salary: "+obj.salary);
        
    }
    
}
