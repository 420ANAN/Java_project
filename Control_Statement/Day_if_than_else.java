public class Day_if_than_else {
    public static void main(String[] args) {
        String days = "Sunday";


        if(days.equals("Monday")){
            System.out.println("Today is Monday");
        } else if (days.equals("Tuesday")){
            System.out.println("Today is Tuesday");
        } else if(days.equals("Wednesday")){
            System.out.println("Today is Wednesday");
        } else if(days.equals("Thursday")){
            System.out.println("Today is Thursday");
        } else if(days.equals("Friday")){
            System.out.println("Today is Friday");
        } else if(days.equals("Saturday")){
            System.out.println("Today is Saturday");
        } else if(days.equals("Sunday")){
            System.out.println("Today is Sunday");
        } else{
            System.out.println("Invalid day");
        }

    }
}