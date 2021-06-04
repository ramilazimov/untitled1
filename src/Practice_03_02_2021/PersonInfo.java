package Practice_03_02_2021;

public class PersonInfo {
    public static void main(String[] args){
        //variables without data
        String name,fullBirthDate, favoriteQuote;
        byte age;
        char gender;
        boolean student;
        short numberOfSiblings;
        long favoriteNumber;

        int numberOfSeasons, year;
        double birthDate;

        //Assigment of data
         name = "Ramil";
         age = 43;
         gender = 'M';
         student = true;
         numberOfSiblings = 5;
         favoriteNumber = 7;
         numberOfSeasons = 4;
         birthDate = 3.2;
         year = 2021;
        fullBirthDate = "" + birthDate + year + ""; //2025.2 adds first then turns to string
        favoriteQuote = "have a good mindset";

        System.out.println(fullBirthDate);
        fullBirthDate = "" + birthDate + "." + year;//3.2.2021

        System.out.println("Name" + name);

        // other printing
    }

} //
