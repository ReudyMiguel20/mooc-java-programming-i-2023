
import java.util.ArrayList;

public class GradeRegister {

    private ArrayList<Integer> grades;
    private ArrayList<Integer> gradesAvg;

    public GradeRegister() {
        this.grades = new ArrayList<>();
        this.gradesAvg = new ArrayList<>();
    }

    public void addGradeBasedOnPoints(int points) {
        this.grades.add(pointsToGrade(points));
        this.gradesAvg.add(points);
    }

    public int numberOfGrades(int grade) {
        int count = 0;
        for (int received : this.grades) {
            if (received == grade) {
                count++;
            }
        }

        return count;
    }

    public static int pointsToGrade(int points) {

        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else {
            grade = 5;
        }

        return grade;
    }

    public double averageOfGrades() {
        if (grades.isEmpty()) {
            return -1;
        }
        double average = 0;
        int sumGrades = 0;
        int counter = 0;
        for (int gradesEach : grades) {
            sumGrades += gradesEach;
            counter++;
        }
        return average = 1.0 * sumGrades / counter;
    }
    
    public double averageOfPoints(){
        if (gradesAvg.isEmpty()){
            return -1;
        }
        double average = 0;
        int sumGrades = 0;
        int counter = 0;
        
        for (int gradesNumber : gradesAvg){
            sumGrades += gradesNumber;
            counter++;
        }
        
        return average = 1.0 * sumGrades / counter;
    }
    
    
}
