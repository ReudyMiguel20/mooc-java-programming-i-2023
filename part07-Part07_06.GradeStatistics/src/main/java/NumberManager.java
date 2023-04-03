
import java.util.ArrayList;

public class NumberManager {

    private ArrayList<Integer> numbers;

    public NumberManager() {
        this.numbers = new ArrayList();
    }

    public void add(int input) {
        this.numbers.add(input);
    }

    public double average() {
        int sumNumbers = 0;
        int counter = 0;
        for (int numbersList : numbers) {
            sumNumbers += numbersList;
            counter++;
        }
        double average = 1.0 * sumNumbers / counter;
        return average;
    }

    public double averagePassingGrade() {
        int sumNumbers = 0;
        int counter = 0;
        for (int numbersList : numbers) {
            if (numbersList > 0 && numbersList < 50) {
                continue;
            } else if (numbersList < 0 && numbersList > 100) {
                continue;
            } else if (numbersList > 50 && numbersList < 100) {
                sumNumbers += numbersList;
                counter++;
            }
        }
        double average = 1.0 * sumNumbers / counter;

        return average;
    }

    public double passPercentage() {

        int passingParticipants = 0;

        for (int passing : numbers) {
            if (passing >= 50 && passing <= 100) {
                passingParticipants++;
            } else if (passing > 0 && passing <= 49) {
                continue;
            }
        }

        double passPercentage = 1.0 * 100 * passingParticipants / numbers.size();
        return passPercentage;
    }

    public void gradeDistribution() {
        int[] gradeDistArr = new int[6]; // 0 through 5

        //from my understanding Array's are already initilized with 0. So ill just loop and add to them
        //using previous exercise p3_22 printlnstars to help with this method.
        for (int grade : this.numbers) {

            if (grade >= 90) {
                gradeDistArr[0]++;

            } else if (grade <= 89 && grade > 79) {
                gradeDistArr[1]++;
            } else if (grade <= 79 && grade > 69) {
                gradeDistArr[2]++;
            } else if (grade <= 69 && grade > 59) {
                gradeDistArr[3]++;
            } else if (grade <= 59 && grade > 49) {
                gradeDistArr[4]++;
            } else if (grade <= 49) {
                gradeDistArr[5]++;
            }

        }
        System.out.println("Grade distribution:");
        int gradDistIndex = 5;

        for (int e : gradeDistArr) {
            System.out.print(gradDistIndex + ":");

            for (int i = 0; i < e; i++) {
                System.out.print("*");
            }

            System.out.print("\n"); //line break
            gradDistIndex--;
        }
    }

    public String toString() {
        return "Point average (all): " + average() + "\n"
                + "Point average (passing): " + averagePassingGrade() + "\n"
                + "Pass percentage: " + passPercentage();
    }
    
    public void printGrades(){
        gradeDistribution();
    }

}
