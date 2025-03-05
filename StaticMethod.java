public class StaticMethod {
    static int a = 42;

    public static int prefix_increment(){
        //The value is incremented first, and then the new value is used in the expression.

        return ++a;
    }


    public static  int postfix_increment(){
        //The previous value is obtained for use in the expression, and then the value is incremented.

        return a++;  

    }


    public static int prefix_decerement(){
        //The value is decremented first, and then the new value is used in the expression.

        return --a;
    }

    public static int postfix_decerement(){
        //The previous value is obtained for use in the expression, and then the value is decremented.

        return a--;
    }




    public static void main (String args[]){

        System.out.println(a);  //42
        System.out.println(StaticMethod.prefix_increment()); //43
        System.out.println(StaticMethod.postfix_increment()); //43
        System.out.println(a); //44
        System.out.println(StaticMethod.prefix_decerement()); //43
        System.out.println(StaticMethod.postfix_decerement()); //43
        System.out.println(a);//42

    }
    
}
