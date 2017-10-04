import java.util.Scanner;

public class MethodMain {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        String name ="Hello";
        System.out.println("Name:");
        name = keyboard.nextLine();


        System.out.print(helloName(name));
    }

    public static String helloName(String name) {

        return "Hello,"+name+"!";

    }
    }
