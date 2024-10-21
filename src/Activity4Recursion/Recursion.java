package Activity4Recursion;

import java.util.Scanner;

/**
 * Activity 4
 * @author Lumacang
 */
public class Recursion {

    public static int printStars(int n){
    
        if(n == 0){
            return 0;
        }else{
            System.out.println("*");
            return printStars(n - 1);       
        }
    }
 
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Numbers of stars: ");
        int stars = scn.nextInt();
        System.out.println("");
        printStars(stars);
        
    }
    
}
