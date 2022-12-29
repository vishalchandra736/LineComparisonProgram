package com.blz.linecomparisonproblem;

import java.util.Scanner;

public class LineComparisonProblem {
    public int lineCoordinate() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the First point - X co-ordinate : ");
        int x1 = scan.nextInt();
        System.out.print("Enter the First point - Y co-ordinate : ");
        int y1 = scan.nextInt();
        System.out.print("Enter the Second point - X co-ordinate : ");
        int x2 = scan.nextInt();
        System.out.print("Enter the Second point - Y co-ordinate : ");
        int y2 = scan.nextInt();
        int Length_Of_Line = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return Length_Of_Line;
    }

    public static void main(String[] args) {
        LineComparisonProblem Line = new LineComparisonProblem();
        System.out.println("Every Line consisting 2 points and each point consisting 2 co-ordinates (x,y).");
        System.out.println("For Line 1 - ");
        Integer Length_of_line1 = Line.lineCoordinate();
        System.out.println("For Line 2 - ");
        Integer Length_of_line2 = Line.lineCoordinate();
        System.out.println();
        // Use equals Method
        if(Length_of_line1.equals(Length_of_line2)) {
            System.out.println("Length of Both Lines are equal.");
        }
        else {
            // Use compareTo Method
            int lengthDifference = Length_of_line1.compareTo(Length_of_line2);
            if (lengthDifference > 0)
                System.out.println("Length of Line1 is Greater and Length of Line2 is Smaller.");
            else if (lengthDifference < 0)
                System.out.println("Length of Line1 is Smaller and Length of Line2 is Greater.");
        }
    }
}
