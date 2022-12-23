package com.blz.linecomparisonproblem;

import java.util.Scanner;

public class LineComparisonProblem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Every Line consisting 2 points and each point consisting 2 co-ordinates (x,y).");
        System.out.print("Enter the First point - X co-ordinate : ");
        int x1 = scan.nextInt();
        System.out.print("Enter the First point - Y co-ordinate : ");
        int y1 = scan.nextInt();
        System.out.print("Enter the Second point - X co-ordinate : ");
        int x2 = scan.nextInt();
        System.out.print("Enter the Second point - Y co-ordinate : ");
        int y2 = scan.nextInt();
        int Length_Of_Line = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Length of a Line is : " + Length_Of_Line);
    }
}
