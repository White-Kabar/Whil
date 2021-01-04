/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package whil;
import java.util.Scanner;
/**
 *
 * @author WHITEKABAR
 */
public class Whil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        final int m = 3000;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter i");
        i = input.nextInt();
        while (i<=m) {
            System.out.println("Iteration # "+i);
            i++;
        }
        System.out.println("Out of loop when i "+i);
        }
    }
    

