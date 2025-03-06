
  class Operation {

    int emp_id ;
    String emp_name;
   static  String emp_ceo;

    void display(){
        System.out.println(emp_id + " " + emp_name + " " + emp_ceo);

    }


}


public class StaticVariable {
    
    public static void main(String[] args) {
        Operation Anand = new Operation();
        Operation Rahul = new Operation();
       
        Anand.emp_id = 1;
        Anand.emp_name  = "Anand";
        Operation.emp_ceo = "Sundar Pichai";

       
        Rahul.emp_id = 2;
        Rahul.emp_name  = "Rahul";
        Operation.emp_ceo = "Sundar Pichai";

        Operation.emp_ceo = "Satya Nadella";
        
        

        Anand.display();
        Rahul.display();
       

       
    }
    
}
