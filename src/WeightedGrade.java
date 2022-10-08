/*
Lab 3
Simiao Wang
5101
Section-8
*/

public class WeightedGrade {
    //private attributes
    private double[] totalPoint = new double[8];
    private double[] percentage = new double[8];
    private double[] earnPoint = new double[8];

    public WeightedGrade(double[] a, double[] b, double[] c) { //contributor method
        totalPoint = a;
        percentage = b;
        earnPoint = c;
    }

    public String getAnswer() {
        double weightedGrade = 0;
        for (int i = 0; i <= totalPoint.length - 1; i++) { //calculate every weighted-grade and add up
            weightedGrade = weightedGrade + earnPoint[i] / totalPoint[i] * percentage[i];
        }
        if (90 <= weightedGrade && weightedGrade <= 100)  //decide if the grade belongs to A
            return "A";
        if (80 <= weightedGrade && weightedGrade < 90) //decide if the grade belongs to B
            return "B";
        if (70 <= weightedGrade && weightedGrade < 80) //decide if the grade belongs to C
            return "C";
        if (60 <= weightedGrade && weightedGrade < 70) //decide if the grade belongs to D
            return "D";

        return "F";//if the grade doesn't belong to the above, it is F
    }
}

