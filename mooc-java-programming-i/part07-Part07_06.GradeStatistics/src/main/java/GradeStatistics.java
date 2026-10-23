import java.util.ArrayList;

public class GradeStatistics {
    private ArrayList<Integer> gradePoints;

    public GradeStatistics() {
        this.gradePoints = new ArrayList<>();
    }

    public void addPoints(int point) {
        if (point < 0 || point > 100) {
            return;
        }
        this.gradePoints.add(point);
    }

    public void print() {
        double sum = 0;
        double passSum = 0;
        int passCount = 0;

        for (int point : this.gradePoints) {
            sum += point;

            if (point >= 50) {
                passSum += point;
                passCount++;
            }
        }
        
        if (this.gradePoints.size() > 0) {
            System.out.println("Point average (all): " + sum / this.gradePoints.size());
        } else {
            System.out.println("Point average (all): 0.0");
        }
        
        if (passCount > 0) {
            System.out.println("Point average (passing): " + passSum / passCount);
        } else {
            System.out.println("Point average (passing): -");
        }

        System.out.println("Pass percentage: " + (100.0 * passCount / this.gradePoints.size()));

        System.out.println("Grade distribution:");
        gradeDistribution();

    }

    private void gradeDistribution() {
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < countGrade(i); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    private int countGrade(int grade) {
        int count = 0;
        for (int point : this.gradePoints) {
            if (connvertToGrade(point) == grade) {
                count++;
            }
        }
        return count;
    }

    private int connvertToGrade(int point) {
        int grade = 5;
        if (point < 50) {
            grade = 0;
        } else if (point < 60) {
            grade = 1;
        } else if (point < 70) {
            grade = 2;
        } else if (point < 80) {
            grade = 3;
        } else if (point < 90) {
            grade = 4;
        }
        return grade;
    }
}
