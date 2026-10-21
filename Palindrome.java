import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to check: ");
        String s = new String(in.next());
        int i , j;
        j=s.length()-1;
        for(i=0; j>=i; j--,i++)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                System.out.println(s+ "is not palindrome");
            System.exit(1);
}
    }
    System.out.println(s+ "String is palindrome");
}
}

    

