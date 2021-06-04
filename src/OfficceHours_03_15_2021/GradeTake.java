package OfficceHours_03_15_2021;

public class GradeTake {
    public static void main(String[] args) {

        int baseGrade = 90;
        int numberOfAttempts = 1;
        int retakePenalty = 0;

        if (numberOfAttempts == 1) {
            retakePenalty = (int) (baseGrade * 0.10);
        } else if (numberOfAttempts == 2) {
            retakePenalty = (int) (baseGrade * 0.20);
        } else if (numberOfAttempts == 3) {
            retakePenalty = (int) (baseGrade * 0.35);
        } else {
            System.out.println("invalid attempt number");

        }
        {

        }

        System.out.println("Grade after retake attempt " + numberOfAttempts + "was: " + (baseGrade - retakePenalty));
    }
}


