import java.util.Scanner;

class ControlStructures{
    public static void main(String[] args){
        char operator;
        double number1,number2;

        Scanner input=new Scanner(System.in);

        System.out.println("Enter first number : ");
        number1=input.nextDouble();

        System.out.println("Choose operator: +,-,*,/, or =");
        operator=input.next().charAt(0);

        while(operator!='=')
        {System.out.println("Enter second number : ");
            number2=input.nextDouble();

            switch(operator){
                case'+': number1+=number2;
                break;
                case'-': number1-=number2;
                break;
                case'*': number1*=number2;
                break;
                case'/': number1/=number2;
                break;

            }
            System.out.println("Choose an operator : +,-,*,/, or =");
            operator = input.next().charAt(0);

        }
        System.out.println("Result: "+number1);

    }
    
}
