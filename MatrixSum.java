import java.util.Scanner;
public class MatrixSum{
    public static void main(String[] args)
    {
        int m, n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of matrix: ");
        m=sc.nextInt();
        n=sc.nextInt();
        int a[][]=new int[m][n];
        int b[][]=new int[m][n];
        int c[][]=new int[m][n];

        System.out.println("Enter all the elemnts of first matrix: ");
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
        a[i][j]=sc.nextInt();

        System.out.println("");
        System.out.println(" Enter all the element of second matrix: ");
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
        b[i][j]=sc.nextInt();

        System.out.println("");

        System.out.println("Matrix after addition:");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print((a[i][j] + b[i][j]) +"");

            }
            System.out.println("");
        }
    }


}
    

