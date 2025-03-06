public class Selection_if {
    boolean First_Branch ;
 boolean data_Available = true;
 int byte_Available ;

 public void process_data() {
    System.out.println("Processing data...");
   
}
public void Wait_for_More_Data() {
    System.out.println("Waiting for more data...");
}

    public static void main(String[] args) {
        Selection_if obj = new Selection_if();
      
if(obj.First_Branch) {
       if(obj.data_Available) {
          obj.process_data();
       }
       else {
          obj.Wait_for_More_Data();
       }
    }
    else {
       if(obj.byte_Available > 0) {
          obj.process_data();
       }
       else {
          obj.Wait_for_More_Data();
       }
    }
    }

   
}