//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)
import java.util.Scanner;
public class Program4{
    public static void main(String[] args){
        //Declare variables
        
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;
        
        //Create Scanner
        Scanner nums = new Scanner(System.in);
        // Print statement for inputs
        System.out.println("Enter your first three-digit number: ");
        one = nums.nextInt();
        
        System.out.println("Enter your second three-digit number: ");
        two = nums.nextInt();
        
        System.out.println("Enter your third three-digit number: ");
        three = nums.nextInt();
        
        System.out.println("Enter your fourth three-digit number: ");
        four = nums.nextInt();
        
        //Intitialize sum and average
        double sum = one + two + three + four;
        
        double average = sum/4.0;
        
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println("The average of the four number is " + average);
        
        
        
        
        
    }
}


//Paste console output below:
/*

The sum of the four numbers is 2227

The average of the four numbers is 556.75

*/
