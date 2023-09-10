    
    /**
     * Write a description of class Marks here.
     *
     * @author Rajwant Kaur
     * @version (04-09-2023)
     */
    
    import java.util.Scanner;
    public class Marks
    {
        // instance variables - replace the example below with your own
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            System.out.print("Enter the assignment name: ");
            String assignmentName = scanner.nextLine();
    
            double[] marksList = new double[30];
            int studentCount = 0;
    
            // F2:  allows the user to input students' marks for the assignment. In this task, you can assume that there are 30 students in the unit. Your program
            //must accept only valid mark inputs by users. A valid mark is any number between 0 and 30
            while (studentCount < 30) {
                System.out.print("Enter mark for student " + (studentCount + 1) + ": ");
                double mark = scanner.nextDouble();
        
                // F3reports any invalid input by showing an error message on the screen to the user with sufficient details of the error before allowing users to reenter the mark.

                if (mark >= 0 && mark <= 30) {
                    marksList[studentCount] = mark;
                    studentCount++;
                } else {
                    System.out.println("Invalid input! Enter a mark between 0 and 30.");
                }
            }
        // F4 prints the assignment name following the 'students' marks after users have finished entering the marks
            System.out.println("Assignment Name: " + assignmentName);
            for (double mark : marksList) {
                System.out.print(mark + " ");
            }
            System.out.println();
            // F5: prints the highest mark and the lowest mark on the screen. You are required to complete this functional requirement in two steps
            findHighestAndLowest(marksList);
            
            // calculates the mean and standard deviation of the marks and print the result on the screen. Like in F5, you are required to complete this functional requirement in two steps:
            calculateMeanAndStandardDeviation(marksList);
        }
        
        // ALgorithm 1: Implement Algorithm 1 based on the pseudo code you created in Step 1. Note that the implementation must be in line with the pseudo code.
            public static void findHighestAndLowest(double[] marks) {
            // initialization of variables 
            double highestMark = -1;
            double lowestMark = 31;
    
            // Iterate through each marks
            for (double mark : marks) {
                
                // Check current marks with highest marks if greater then assigned this marks to highest mark variable
                if (mark > highestMark) {
                    highestMark = mark;
                }
                // Check current marks with lowest marks if lower then assigned to lowest marks.
                if (mark < lowestMark) {
                    lowestMark = mark;
                }
            }
    
            // print highest marks 
            System.out.println("Highest Mark: " + highestMark);
            
            //print lowest marks 
            System.out.println("Lowest Mark: " + lowestMark);
        }
        
         // compute absolute   
        public static double manualAbs(double value) {
        if(value < 0) {
            return -value;
        }
        return value;
    }
        
    // compute square root of number
        public static double manualSqrt(double value) {
        if(value == 0 || value == 1) {
            return value;
        }
    // initialize variables
        double precision = 0.00001;
        double approximation = value;
        double previous;
    
        do {
            previous = approximation;
            approximation = 0.5 * (approximation + value / approximation);
        } while(manualAbs(approximation - previous) > precision);
    
        return approximation;
    }
    
    
    // Algorithm 2 : Calculate Mean and Standard deviation of marks
        public static void calculateMeanAndStandardDeviation(double[] marks) {
            
            // initialize the variable
            double total = 0;
            double varianceSum = 0;
    
            // iterate through marks array to get the total marks
            for (double mark : marks) {
                total += mark;
            }
    
            // compute mean value
            double mean = total / marks.length;
    
            
            // iterate through each marks to find total variance
            for (double mark : marks) {
               varianceSum += (mark - mean) * (mark - mean);
            }
    
            // compute variance and standard deviation
            double variance = varianceSum / marks.length;
            double standardDeviation = manualSqrt(variance);
    
            //print mean, standard deviation marks
            System.out.println("Variance:" + variance);
            System.out.println("Mean: " + mean);
            System.out.println("Standard Deviation: " + standardDeviation);
        }
    }
