package testPackage;

public class Calculator {
    public static void main(String[] args){
        add(5,3);
        substraction(5,3);
        division(4,2);
        multification(4,8);

    }

    public static void  add(int num1, int num2){
        System.out.println("the addition is: " + (num1+num2) );
    }
    public static void  substraction (int num1, int num2){
        System.out.println("the substraction is: " + (num1-num2) );
    }
    public static void  division(int num1, int num2){
        System.out.println("the division is: " + (num1/num2) );
    }
    public static void  multification (int num1, int num2){
        System.out.println("the multification is: " + (num1*num2) );
    }
}
