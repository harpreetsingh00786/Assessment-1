
/**
 * Write a description of class Assignment1 here.
 *
 * @author (Harpreet Singh)
 * @version (05/09/2023)
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Assignment1
{

    public static void main(String[] args) {
        
        // declared all the variables at the top
        String assignmentName;
        final int STUDENTS = 30;
        int assignmentMarks, highestMark, lowestMark;
        double marksSum = 0, mean, difference, sqrDifference, sumSqrDifference = 0, standardDeviation;
        
        ArrayList<Integer> marksList = new ArrayList<>();
        
        Scanner scanner = new Scanner(System.in);
        
        // tassignment name as user input
        System.out.print("Enter assignment name: ");
        assignmentName = scanner.nextLine();
        
        // use for loop for 30 iterations, because here I have 30 students 
        for(int i=0; i<STUDENTS; i++){
            
            // user while loop for multiple iterations until stop the loop with break
            while(true){
                System.out.print("Enter student " + (i+1) + " marks: ");
                
                // used try-catch to avoid from crashing
                try{
                    assignmentMarks = scanner.nextInt();
                    
                    // here use the confitional staement if the condition satisfied then break the loop
                    if(assignmentMarks >= 0 && assignmentMarks <= 30) {
                        break;
                    } else {
                        System.out.print("WARNING! Assignment marks must be 0 - 30.\n");
                    }
                
                } catch(java.util.InputMismatchException e) {
                    System.out.print("WARNING! Please enter a postive integer.\n");
                    scanner.next(); 
                }
            }
            
            // add students marks into the list 
            marksList.add(assignmentMarks);
        }
            System.out.println("\nAssignment name: " + assignmentName + "\n");
             // dsiplay studnet marks
        for(int i=0; i<marksList.size(); i++){
            System.out.println("Student "+ (i+1) + " marks: " + marksList.get(i));
        }
        
}
}
