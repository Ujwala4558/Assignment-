
public class Largest_Number {

    public static void main(String[] args) {

        int num1 = 21, num2 = 78, num3 = 56;

        if(num1 >= num2) {
            if(num1 >= num3)
                System.out.println(num1 + " is the largest number.");
            else
                System.out.println(num3 + " is the largest number.");
        } else {
            if(num2 >= num3)
                System.out.println(num2 + " is the largest number.");
            else
                System.out.println(num3 + " is the largest number.");
        }
    }
}