public class Selection_switch {
    public static void main(String[] args) {
        boolean First_Branch = true;
        boolean data_Available = true;
        int byt_Avalable = 0;
        if(First_Branch){
            switch(data_Available){
                case true:
                    System.out.println("Processing data...");
                    break;
                case false:
                    System.out.println("Waiting for more data...");
                    break;
            }

        }
        else{
            switch(byt_Avalable){
                case 0:
                    System.out.println("Waiting for more data...");
                    break;
                default:
                    System.out.println("Processing data...");
                    break;
            }
        }

    }
    
    
}
