/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.whileloop;
import javax.swing.JOptionPane;
/**
 *
 * @author RC_Student_lab
 */
public class WhileLoop {

    public static void main(String[] args) {
        // the program contains a state that can be chanded by user during runtime
        int state = 0; 
        int counter = 0;
        while (state == 0){//where we begin the loop
        JOptionPane.showMessageDialog(null,"Loop number: " + counter);
            counter++;
            
            
            
            //Local integer variable
            int choice = Integer.parseInt(JOptionPane.showInputDialog("Do you want to continue?\n 1 = No 0 = Yes")); //prompt user
            state = choice;
            switch(choice){
                case 0:
                break;
                case 1:
                 JOptionPane.showMessageDialog(null,"User Terminated the Program");
                 state = choice;
                break;
                
                default:
                      JOptionPane.showMessageDialog(null,"wrong Input");
                 
                    
            }//end of switch statement
        }//end of while loop
    }//end of main methods
}//end of class
