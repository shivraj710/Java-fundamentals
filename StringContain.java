import java.util.Scanner;

public class StringContain{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first string");
        String s1=scanner.nextLine();

        System.out.println("Enter second string");
        String s2=scanner.nextLine();

        boolean result=stringCheck(s1,s2);
        System.out.println(s1+"contains"+s2+"="+result);
    }

    private static boolean stringCheck(String s1, String s2){
        boolean result=false;
        result=s1.contains(s2);
        return result;
    }

    }
    

