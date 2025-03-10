public class Nested_switch {
    public static void main(String[] args) {
        int count = 1;
        int target =0;
        int targetArgs = 4;



        switch(count){
            case 1:
            switch(target){
                case 0:
                System.out.println("Target is 0");
                break;
                case 1:
                System.out.println("Target is 1");
                break;
            }
            break;
            case 2:
            switch (targetArgs) {
                case 4:
                System.out.println("Target is 4");
                break;
        
                case 5:
                System.out.println("Target is 5");
                break;
            }
            break;
        }

    }
}
