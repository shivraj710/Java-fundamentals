import java.util.*;
class Sorting
{
    int n=0;
    String[]str;
    void readStrings()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        n = s.nextInt();
        str = new String[n];
        System.out.println(" Enter strings: ");
        for(int i=0; i<n; i++)
            str[i]=new String(s.next());
    }
    void sortStrings()
    {
        for(int i=0; i<n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
                if(str[i].compareTo(str[j])>0)
                {
                    String temp = str[i];
                    str[i]=str[j];
                    str[j]=temp;
                }
            }
        }
    }
    void showStrings()
    {
        for(int i=0; i<n; i++)
            System.out.println(str[i]);
    }
}
class Stringsort
{
    public static void main(String[] args)
    {
        Sorting obj = new Sorting();
        obj.readStrings();
        System.out.println("Before Sort list of strings: ");
        obj.showStrings();
        obj.sortStrings();
        System.out.println("After sort list of strings: ");
        obj.showStrings();
    }
}

