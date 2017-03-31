/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package u2_a4_fastfood;

import java.util.Scanner;
/**
 *
 * @author WeSon8840
 */
public class U2_A4_FastFood {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int burgers;
        int fries;
        int drinks;
        int amountTendered;
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter the number of burgers: ");
        burgers = input.nextInt();
        
        System.out.print("Enter the number of fries: ");
        fries = input.nextInt();
        
        System.out.print("Enter the number of soft drinks: ");
        drinks = input.nextInt();
        
        System.out.print("Enter the amount tendered: ");
        amountTendered = input.nextInt();
        input.close();
        
        final double CostbeforeTax = 2.49*burgers + 1.89*fries + 0.99*drinks;
        final double Tax = CostbeforeTax*0.13;
        final double Total = CostbeforeTax + Tax;
        final double change = amountTendered - CostbeforeTax;
        
        System.out.println("Total before taxes : $" +CostbeforeTax);
        System.out.println("Tax : $" +Tax );
        System.out.println("Final total : $" +Total);
        System.out.println("Change: $" + change);
    }
    
}
