/*
Lab 3
Simiao Wang
5101
Section-8
*/

import java.util.Scanner;

public class GetWeightedGrade {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        double[] a = new double[8]; //input of Total points
        System.out.println("Please enter Total points of 8 subjects and hit enter after each point");
        for (int i = 0; i <= a.length-1; i++ ) {
            a[i] = sc.nextDouble();
        }
        double[] b = new double[8]; //input of Percentage
        System.out.println("Please enter percentage of 8 subjects and hit enter after each point");
        for (int i = 0; i <= b.length-1; i++ ) {
            b[i] = sc.nextDouble();
        }
        double[] c = new double[8]; //input of eared points
        System.out.println("Please enter eared points of 8 subjects and hit enter after each point");
        for (int i = 0; i <= c.length-1; i++ ) {
            c[i] = sc.nextDouble();
        }
        WeightedGrade newGrade = new WeightedGrade(a, b, c);//create an instance of WeightedGrade and pass parameters
        String result = newGrade.getAnswer();//call the method to do the math
        System.out.println("Your weighted grade is:" + result); //print the result


        }
    }


