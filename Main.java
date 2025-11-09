import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        /* Varibles
            just like
            Water - bucket
            Masala - box
            Lunch - lunchbox

            in java:
            Variables are containers which stores data values
            string , int , float , char, boolean
            how to declare variables:
            syntax - <dataType> <variableName> = <value>;

         */
        String name2 = "Rohit";
        System.out.println(name2);
        int a = 45;
        float b = 45.25f;
        boolean isAdult = false;
        System.out.println(a);
        System.out.println(b);
        System.out.println(isAdult);

        /*Rules for constructing name of variable in Java
            1. can contain digits, underscores, dollar signs, letters
            2. should begin with a letters , $ or _
            3. Java is case sensitive lang which means that
                rohit and Rohit are two different variables altogether.
            4. should not contain whitespaces
            5. You cannot use reserved keywords from Java

         */

        /* Two types of Java data types:
            1. Primitive - byte(1 bytes), short(2 bytes), int(4 bytes), long(8 bytes), float(4 bytes),
                double(8 bytes), boolean(1 bits), char(2 bytes).
            2. Non primitive

         */
        double u = 56.23265d;
        System.out.println(u);
        char grade = 'A';
        System.out.println(grade);

        /* Operators in Java

            Operand,  Operator, Operand = Result
            4           +           7   =   11

            Types of operators in Java
            Arithmetic operators:   '+' , '-' , '*' , '/' , '%'
            Assignment operators:
            Logical operators: '&&' , '||' , '!'
            Comparison operators: '==' , '!=' , '<' , '>' , '<=' , '>='
        */
//        int num1 = 45 , num2 = 78;
//        System.out.print("The value of num1 + num2 is :");
//        System.out.println(num1 + num2);
//
//        System.out.print("The value of num1 - num2 is :");
//        System.out.println(num1 - num2);
//
//        System.out.print("The value of num1 * num2 is :");
//        System.out.println(num1 * num2);
//
//        System.out.print("The value of num1 / num2 is :");
//        System.out.println(num1 / num2);
//
//        System.out.print("The value of num1 % num2 is :");
//        System.out.println(num1 % num2);
//
//        System.out.println(num1++);
//        System.out.println(++num1);
//        System.out.println(num1--);
//        System.out.println(--num1);

        /* Logical operators:
            1. && - Logical and operator - returns true only if both conditions are true
            2. || - Logical or operator - returns true if any one condition is true
            3. ! - Logical not - Reverse the result from true to false and vice versa
         */


        // Taking user input in java
        /*
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter Input");
            String input = scan.nextLine();
            System.out.println(input);
        */
        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Age :");
//            int age = scan.nextInt();
//            System.out.println(age);


//        String name= "Rohit";
//        String channel = "GIT";
//        System.out.println(name);
//        System.out.println(name.length());
//        System.out.println(name.toUpperCase());
//        System.out.println(name.toLowerCase());
//        System.out.println(name + " from " + channel);
//        System.out.println(name + " from\" " + channel);
//        System.out.println(name + " from\\ " + channel);
//     System.out.println(name + " from\t " + channel);
//     System.out.println(name + " from\n " + channel);

//        System.out.println(name.contains("Har"));
//        System.out.println(name.charAt(2));
//        System.out.println(name.endsWith("ry"));
//        System.out.println(name.indexOf("rry"));

        //int numb1 = 4, numb2 = 7;
//        System.out.println(Math.max(numb1, numb2));
//        System.out.println(Math.min(numb1, numb2));
//        System.out.println(Math.sqrt(36));
//          System.out.println(Math.abs(-36));
//          System.out.println(Math.abs(6));
//        System.out.println(Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());
//        System.out.println(4+(8-4)*Math.random());



        // If-else conditionals
//        if(age>20){
//            System.out.println("you are an adult");
//        }
//        else if(age > 5){
//            System.out.println("you are not a kid");
//        }
//        else{
//            System.out.println("you are a kid");
//        }

        //Switch statement in Java

//        switch(age){
//            case 12:
//                System.out.println("You are 12 years old");
//                break;
//            case 56:
//                System.out.println("You are 56 years old");
//                break;
//            case 16:
//                System.out.println("You are 16 years old");
//                break;
//            default:
//                System.out.println("you did not match any of the cases ");
//        }

        // Quick Quiz: print sunday to saturday based on numbers 1 to 7 typed by the user
        System.out.println("Enter the number btw 1 - 7 :");
        int num = scan.nextInt();
        switch(num){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("The entered number is wrong");
        }

    }
}
